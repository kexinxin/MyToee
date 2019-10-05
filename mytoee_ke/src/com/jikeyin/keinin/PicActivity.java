package com.jikeyin.keinin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;
public class PicActivity extends Activity {
       String path;
       ImageView img;
       TextView text;
       String[] string;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pic);
		string=new String[]{
				"排名：你长的长相击败了全国10%的人\n评语：长得惊险。。。。。",
				"排名：你长的长相击败了全国11%的人 \n评语：你小时候被*亲过吧？",
				"排名：你长的长相击败了全国9%的人 \n评语：你长得很爱国 很 敬业 很 有骨气",
				"排名：你长的长相击败了全国21%的人 \n评语：长得真有创意，活得真有勇气",
				"排名：你长的长相击败了全国31%的人 \n评语： 你长得真tm后现代",
				"排名：你长的长相击败了全国41%的人 \n评语：你长的好像车祸现场",
				"排名：你长的长相击败了全国43%的人\n 评语：你长得外形不准 比例没打好",
				"排名：你长的长相击败了全国35%的人 \n评语：你干嘛用屁股挡住脸",
				"排名：你长的长相击败了全国29%的人 \n评语：我觉得世界上就只有两种人能吸引人，一种是特漂亮的 一种就是你这样的",
				"排名：你长的长相击败了全国48%的人 \n评语：你长得很提神的说！",
				"排名：你长的长相击败了全国33%的人 \n评语：你需要回炉重造",
				"排名：你长的长相击败了全国33%的人 \n评语：你长的长相击败了全国23%的人      你TMD长得太好认了",
				"排名：你长的长相击败了全国33%的人 \n评语：见过丑的，没见过这么丑的。咋一看挺丑，仔细一看更丑",
				"排名：你长的长相击败了全国33%的人  \n评语：你长的拖网速，你长得太耗内存",
				"排名：你长的长相击败了全国33%的人  \n评语：你光着身子追我两公里，我回头一次都算我是*！",
				"排名：你长的长相击败了全国3%的人    \n评语：大哥，把你脸上的分辨率调低点好吗？",
				"排名：你长的长相击败了全国13%的人\n评语：你长得违章",
				"排名：你长的长相击败了全国1%的人\n评语：你就是一具活生生得抽象艺术品",
				"排名：你长的长相击败了全国8%的人\n评语：国际脸孔世界通用 ",
				"排名：你长的长相击败了全国9%的人\n评语：你的长相突破了人类的想象",
				"排名：你长的长相击败了全国2%的人\n评语：你还没进化完全，长得像人真难为你",
				"排名：您的长相击败了全国80%的人\n评语：您所看到的高度是我们达不到的",
				"排名：您的长相击败了全国65%的人\n评语：您真不简单",
				"排名：您的长相击败了全国85%的人\n评语：You did a good job",
				"排名：您的长相击败了全国100%的人\n评语：You are the best!",
				"排名：您的长相击败了全国95%的人\n评语：We are so proud of you",
				"排名：您的长相击败了全国98%的人\n评语：You are very professional!",
				"排名：您的长相击败了全国90%的人\n评语：Nice going!",
				"排名：您的长相击败了全国70%的人\n评语：You are really talented!",
				"排名：您的长相击败了全国80%的人\n评语：您真不简单",
				"排名：您的长相击败了全国87%的人\n评语：You look like a million dollars",
				"排名：您的长相击败了全国91%的人\n评语：You look outstanding",
				"排名：您的长相击败了全国82%的人\n评语：您真棒！",
				"排名：您的长相击败了全国50%的人\n评语：您仍需努力",
				"排名：您的长相击败了全国60%的人\n评语：看好你哦~",
				"排名：您的长相击败了全国75%的人\n评语：您还可以更棒",
				"排名：您的长相击败了全国83%的人\n评语：You are so great!",
				"排名：您的长相击败了全国79%的人\n评语：You need more practice!"




		};
		Random random=new Random();
		int r=random.nextInt(35);
		Intent intent = this.getIntent();
		path = intent.getStringExtra("path");
		Bitmap bitmap=BitmapFactory.decodeFile(path);
		
		img=(ImageView) findViewById(R.id.img);
//		if(r>10){
//			img.res=com.jikeyin.keinin.R.drawable.pic_rs1_g_14;
//			}
		img.setImageBitmap(bitmap);
		text=(TextView) findViewById(R.id.text);
		
		text.setTextSize(20);
		text.setText(string[r]);
		
	}
       
}
