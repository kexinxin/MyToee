                                                                                                                                                                                                                                                                                              package com.jikeyin.keinin;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.jikeyin.myotee.listener.OnReplaceListener;
import com.jikeyin.myotee.myview.MyView;
import com.jikeyin.utils.SoundUtils;

public class MainActivity extends FragmentActivity implements
		OnCheckedChangeListener, OnPageChangeListener, OnClickListener,
		OnReplaceListener,OnTouchListener {
	static int count=1;
	@Override
	
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		// super.onSaveInstanceState(outState);
	}

	boolean gender;
	RadioGroup rg;
	RadioButton rb0, rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11;
	ViewPager vp;
	MyPagerAdapter adapter;
	HorizontalScrollView hsv;
	Button back, save,sh,button0;
	RelativeLayout rl;
	MyView mView;
	SoundUtils soundUtils;
	boolean[] r;
	
	String path;
	
	
	TextView text1;
    public static String text="";
    EditText editText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diy);
		Intent intent = this.getIntent();
		gender = intent.getBooleanExtra("gender", true);
		initView();
		// mView = new MyView(this, gender);
		soundUtils=new SoundUtils();
		r=new boolean[12];
	}

	private void initView() {
		// TODO Auto-generated method stub
		rg = (RadioGroup) findViewById(R.id.rg);
		rb0 = (RadioButton) findViewById(R.id.rb0);
		rb1 = (RadioButton) findViewById(R.id.rb1);
		rb2 = (RadioButton) findViewById(R.id.rb2);
		rb3 = (RadioButton) findViewById(R.id.rb3);
		rb4 = (RadioButton) findViewById(R.id.rb4);
		rb5 = (RadioButton) findViewById(R.id.rb5);
		rb6 = (RadioButton) findViewById(R.id.rb6);
		rb7 = (RadioButton) findViewById(R.id.rb7);
		rb8 = (RadioButton) findViewById(R.id.rb8);
		rb9 = (RadioButton) findViewById(R.id.rb9);
		rb10 = (RadioButton) findViewById(R.id.rb10);
		rb11 = (RadioButton) findViewById(R.id.rb11);
		back = (Button)findViewById(R.id.back);
		save = (Button)findViewById(R.id.save);
		sh=(Button) findViewById(R.id.sh);
		Button button0 = (Button)findViewById(R.id.sample_button0);  
        button0.setOnClickListener(this);
		// 中间绘图的房间
		rl = (RelativeLayout) findViewById(R.id.rl);
		// 自己定义的控件
		mView = new MyView(this, gender);
		//设置该控件可以被截屏
		mView.setDrawingCacheEnabled(true);
		mView.setOnTouchListener(this);
		// 将自定义的控件添加到绘图的房间
		rl.addView(mView);
		back.setOnClickListener(this);
		save.setOnClickListener(this);
		sh.setOnClickListener(this);
		rb0.setChecked(true);
		rb0.setBackgroundColor(Color.BLUE);
		rg.setOnCheckedChangeListener(this);
		vp = (ViewPager) findViewById(R.id.vp);
		adapter = new MyPagerAdapter(this.getSupportFragmentManager());
		vp.setAdapter(adapter);
		vp.setOnPageChangeListener(this);
		hsv = (HorizontalScrollView) findViewById(R.id.hsv);

	}

	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		// 让选中的单选按钮背景变蓝其他没选中的恢复原来颜色
		switch (checkedId) {
		case R.id.rb0:
			checkedChangedRb(rb0);

			break;
		case R.id.rb1:
			checkedChangedRb(rb1);
			break;
		case R.id.rb2:
			checkedChangedRb(rb2);
			break;
		case R.id.rb3:
			checkedChangedRb(rb3);
			break;
		case R.id.rb4:
			checkedChangedRb(rb4);
			break;
		case R.id.rb5:
			checkedChangedRb(rb5);
			break;
		case R.id.rb6:
			checkedChangedRb(rb6);
			break;
		case R.id.rb7:
			checkedChangedRb(rb7);
			break;
		case R.id.rb8:
			checkedChangedRb(rb8);
			break;
		case R.id.rb9:
			checkedChangedRb(rb9);
			break;
		case R.id.rb10:
			checkedChangedRb(rb10);
			break;
		case R.id.rb11:
			checkedChangedRb(rb11);
			break;
		default:
			break;
		}
	}

	/**
	 * set background of checked button to blue and set background of unchecked
	 * button to white
	 * 
	 * @author kexinxin
	 * @param rb02
	 *            checked button
	 */
	private void checkedChangedRb(RadioButton rb02) {
		// TODO Auto-generated method stub
		int index = rg.getChildCount();
		for (int i = 0; i < index; i++) {
			if (rg.getChildAt(i).getId() == rb02.getId()) {
				rb02.setBackgroundColor(Color.BLUE);
				vp.setCurrentItem(i);
				r[i]=true;
			} else {
				rg.getChildAt(i).setBackgroundColor(Color.WHITE);
				r[i]=false;
			}
		}

	}

	 class MyPagerAdapter extends FragmentPagerAdapter {
	
		public MyPagerAdapter(FragmentManager fm) {
			super(fm);
			
			// TODO Auto-generated constructor stub
		}

		// 决定每一页长什么样子
		@Override
		public Fragment getItem(int arg0) {
			// TODO Auto-generated method stub
			MyFragment myFragment = new MyFragment();

			// 蛇皮带
			Bundle bundle = new Bundle();
			bundle.putInt("index", arg0);
			bundle.putBoolean("gender", gender);
			myFragment.setArguments(bundle);
		
			myFragment.setOnReplaceListener(MainActivity.this);
			return myFragment;
		}

		// 决定ViewPager有多少页
		@Override
		public int getCount() {
			// TODO Auto-generated method stub

			return rg.getChildCount();
		}

	}

	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub

	}

	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	public void onPageSelected(int arg0) {
		// TODO Auto-generated method stub
		// 翻到了某一页，让对应的radiobutton、也跟着翻过来
		// Log.i("INFO","翻到了"+arg0+"页");
		RadioButton rb = (RadioButton) rg.getChildAt(arg0);
		checkedChangedRb(rb);
		int left = arg0 * rb0.getWidth();
		int y = (hsv.getWidth() - rb0.getWidth()) / 2;
		int x = left - y;
		hsv.smoothScrollTo(x, 0);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.back:
			// 返回到LogoActivity
			// Intent intent=new Intent();
			// intent.setClass(MainActivity.this,Mytoee_keActivity.class);
			// startActivity(intent);
			count=1;
			finish();
			break;
		case R.id.save:
			// 将我们拼出来的卡通人物保存为一张图片到SDcard
			//首先判断用户是否有SD卡
			Log.i("INFO",Environment.getExternalStorageState());
			Intent intent=this.getIntent();
			Bitmap bitmap;
			String name;
			
			FileOutputStream stream;
			if(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){
			    bitmap=mView.getDrawingCache();
			    name=System.currentTimeMillis()+".png";
			    path=Environment.getExternalStorageDirectory().getAbsolutePath()+"/"+name;
				//FileOutputStream stream;
				if(intent.getBooleanExtra("all",false)){
					 bitmap=mView.getDrawingCache();
					 name=count+".png";
					 path=Environment.getExternalStorageDirectory().getAbsolutePath()+"/"+name;
					count++;
					//intent.putExtra("all",false);
					//FileOutputStream stream1;
				};
				
				try {
					
					stream = new FileOutputStream(path);
					bitmap.compress(CompressFormat.PNG,100,stream);
					Toast.makeText(MainActivity.this,"图片存在"+path,2000).show();
					//将选中的12张图片存储起来，用sharePreference
					savePics();
					soundUtils.playSound(MainActivity.this,R.raw.save_succeed);
					//Intent intent=new Intent();
					intent.setClass(MainActivity.this,PicActivity.class);
					intent.putExtra("path",path);
					if(!intent.getBooleanExtra("all",false)){
					startActivity(intent);
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else{
				//吐槽
				Toast.makeText(MainActivity.this,"SD卡不存在",2000).show();
			}
			break;
		case R.id.sh:
			Intent intent1=new Intent();
			intent1.setClass(MainActivity.this,shareActivity.class);
			intent1.putExtra("path",count);
			startActivity(intent1);
			break;
		case R.id.sample_button0:
			 editText = (EditText) findViewById(R.id.etTest);
				text = editText.getText().toString();
//				Bundle bundle1 =new Bundle();
//				bundle1.putString("string",text);
				mView.invalidate();
			break;
		default:
			break;
		}
	}

	private void savePics() {
		// TODO Auto-generated method stub
		SharedPreferences sp;
		if(gender){
			sp=this.getSharedPreferences("man", Context.MODE_PRIVATE);
		}
		else{
			sp=this.getSharedPreferences("woman",Context.MODE_PRIVATE);
		}
		Editor editor=sp.edit();
		int index=mView.res.length;
		for(int i=0;i<index;i++){
			editor.putInt(String.valueOf(i),mView.res[i]);
		}
		editor.commit();
	}

	public void onReplace(int res, int index) {
		// TODO Auto-generated method stub
		// 替换自定义控件的图片
		mView.res[index] = res;
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), res);
		mView.mbitmaps[index] = bitmap;
		mView.invalidate();
	}

	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		int action=event.getAction();
		switch (action) {
		case MotionEvent.ACTION_MOVE:
			//手指滑动事件
			//获取手指滑动时的坐标
			    if(r[8]){
				float x=event.getX();
				float y=event.getY();
				//获取需要绘制帽子的坐标
				
				int x_hat=(int) (x-mView.mbitmaps[8].getWidth()/2);
				int y_hat=(int) (y-mView.mbitmaps[8].getHeight()/2);
				mView.left_hat=x_hat;
				mView.top_hat=y_hat;
				mView.isStart=false;
				mView.invalidate();
				Log.i("INFO","手指x的坐标"+x+"\n"+"手指y坐标"+y);
			    }
			    if(r[9]){
			    	float x=event.getX();
					float y=event.getY();
					//获取需要绘制帽子的坐标
					
					int x_hat=(int) (x-mView.mbitmaps[9].getWidth()/2);
					int y_hat=(int) (y-mView.mbitmaps[9].getHeight()/2);
					mView.left_hobby=x_hat;
					mView.top_hobby=y_hat;
					mView.start=false;
					mView.invalidate();
					Log.i("INFO","手指x的坐标"+x+"\n"+"手指y坐标"+y);
			    }
			break;

		default:
			break;
		}
		return true;
	}
}