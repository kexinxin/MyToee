package com.jikeyin.myotee.myview;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import com.jikeyin.keinin.MainActivity;
import com.jikeyin.utils.MyRes;

public class MyView extends View {
	boolean gender;
	public int[] res;
	MyRes mRes;
	public Bitmap [] mbitmaps;
	public int left_hat,top_hat,left_hobby,top_hobby;
	public boolean isStart;
	public boolean start;
	Paint paint;
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		//获取控件屏幕的宽高
		int width=this.getWidth();
		int height=this.getHeight();
		
		//把张图片进行缩放
		mbitmaps[0]=Bitmap.createScaledBitmap(mbitmaps[0],2*width/3, 2*width/3,false);
		mbitmaps[1]=Bitmap.createScaledBitmap(mbitmaps[1],2*width/3, 2*width/3,false);
		mbitmaps[2]=Bitmap.createScaledBitmap(mbitmaps[2],width/3, width/3,false);
		mbitmaps[3]=Bitmap.createScaledBitmap(mbitmaps[3],3*width/10, 3*width/10,false);
		mbitmaps[4]=Bitmap.createScaledBitmap(mbitmaps[4],width/5, width/5,false);
		mbitmaps[5]=Bitmap.createScaledBitmap(mbitmaps[5],width/2, width/2,false);
		mbitmaps[6]=Bitmap.createScaledBitmap(mbitmaps[6],width/3, width/3,false);
		mbitmaps[7]=Bitmap.createScaledBitmap(mbitmaps[7],5*width/11, 5*width/11,false);
		mbitmaps[8]=Bitmap.createScaledBitmap(mbitmaps[8],7*width/13, width/2,false);
		mbitmaps[9]=Bitmap.createScaledBitmap(mbitmaps[9],width/4, width/4,false);
	   mbitmaps[10]=Bitmap.createScaledBitmap(mbitmaps[10],width,height,false);
	   mbitmaps[11]=Bitmap.createScaledBitmap(mbitmaps[11],width/3+height/20,height/3,false);
	   if(isStart){
	   left_hat=(width-mbitmaps[8].getWidth())/2;
	   top_hat=(height-mbitmaps[8].getHeight())-height/3;
	   }
	   if(start){
		   left_hobby=0;
		   top_hobby=0;
	   }
		//绘制所有已经被缩放的图片拼出卡通人物
		canvas.drawBitmap(mbitmaps[10],0,0,null);
		canvas.drawBitmap(mbitmaps[1],(width-mbitmaps[1].getWidth())/2,(height-mbitmaps[1].getHeight())/2,null);
		canvas.drawBitmap(mbitmaps[2],(width-mbitmaps[2].getWidth())/2,(height-mbitmaps[2].getHeight())/2,null);
		canvas.drawBitmap(mbitmaps[3],(width-mbitmaps[3].getWidth())/2,(height-mbitmaps[2].getHeight())/2+height/15,null);
		canvas.drawBitmap(mbitmaps[4],(width-mbitmaps[4].getWidth())/2,11*height/20,null);
		canvas.drawBitmap(mbitmaps[5],(width-mbitmaps[5].getWidth())/2,(height-mbitmaps[5].getHeight())/2,null);
		canvas.drawBitmap(mbitmaps[6],(width-mbitmaps[6].getWidth())/2,(height-mbitmaps[6].getHeight())/2+height/20,null);
		canvas.drawBitmap(mbitmaps[7],(width-mbitmaps[7].getWidth())/2,height-mbitmaps[7].getHeight(),null);
		canvas.drawBitmap(mbitmaps[0],(width-mbitmaps[0].getWidth())/2,(height-mbitmaps[0].getHeight())/2,null);
		canvas.drawBitmap(mbitmaps[8],left_hat,top_hat,null);
		canvas.drawBitmap(mbitmaps[9],left_hobby,top_hobby,null);
		canvas.drawBitmap(mbitmaps[11],2*width/3,0,null);
		
		paint.setColor(Color.BLACK);
		paint.setTextSize(20);
		//Bundle bundle = this.getContext();
		canvas.drawText("newstart作品", 10, 20, paint);
		paint.setColor(Color.RED);
		paint.setTextSize(35);
		
		canvas.drawText(MainActivity.text,50,320, paint);
		super.onDraw(canvas);
		
	}
	
	public MyView(Context context,boolean gender) {
		super(context);
		this.gender=gender;
	    mRes=new MyRes();
        isStart=true;  
        start=true;
	    //根据性别获取默认图片的地址
	    if(gender){
	    	res=mRes.getBoyDefault();
	    	
	    }
	    else{
	    	res=mRes.getGirlDefault();
	    }
	    //取出存储的12张图片，并替换默认的（假设已经存储了）
	    getPic(context);
	    paint=new Paint();
	    //根据图片的地址加载出对应的图片
	    int length=res.length;
	    //数组在使用前，切记要初始化或者赋值
	    mbitmaps=new Bitmap[length];
	    for(int i=0;i<length;i++){
	    	Bitmap bitmap=BitmapFactory.decodeResource(getResources(), res[i]);
	    	mbitmaps[i]=bitmap;
	    }
		// TODO Auto-generated constructor stub
	}

	private void getPic(Context context) {
		// TODO Auto-generated method stub
		SharedPreferences sp;
		if(gender){
			sp=context.getSharedPreferences("man",Context.MODE_PRIVATE);
		}else{
			sp=context.getSharedPreferences("woman",Context.MODE_PRIVATE);
		}
		int index=res.length;
		for(int i=0;i<index;i++){
			res[i]=sp.getInt(String.valueOf(i),res[i]);
		}
	}  
}