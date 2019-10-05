package com.jikeyin.keinin;
       
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.jikeyin.utils.SoundUtils;
       
public class Mytoee_keActivity extends Activity implements OnClickListener{
	Button man,woman,sound,yijian;
	SoundUtils soundUtils;
	boolean isSoundOn;
	SharedPreferences sp;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置界面的样子
        setContentView(R.layout.main);             
        //根据id获取帅哥，美女的button
        man=(Button) findViewById(R.id.man);
        woman=(Button) findViewById(R.id.woman);
        yijian=(Button) findViewById(R.id.yijian);
        //给man,woman按钮绑定监听器，一旦man,woman被点击就会发出警报
        man.setOnClickListener(this);
        woman.setOnClickListener(this);
        yijian.setOnClickListener(this);
        soundUtils=new SoundUtils();
        sound=(Button) findViewById(R.id.sound);
        sound.setOnClickListener(this);
        sp=this.getSharedPreferences("sound",Context.MODE_PRIVATE);
        
        //初始化音频工具类
        isSoundOn=sp.getBoolean("isSoundOn",true);
        if(isSoundOn){
        	sound.setBackgroundResource(R.drawable.bt_homepage_sound_on);
        }
        else{
        	sound.setBackgroundResource(R.drawable.bt_homepage_sound_off);
        }
    }  
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//监听器的警报方法
		//进行跳转
		//桥梁，航班机场
		Intent intent=new Intent();
		intent.setClass(Mytoee_keActivity.this, MainActivity.class);
		switch (v.getId()) {
		case R.id.man:
			//帅哥被点到了
			intent.putExtra("gender",true);
			if(isSoundOn){
				soundUtils.playSound(Mytoee_keActivity.this,R.raw.boy);
			}
			startActivity(intent);
			break;
		case R.id.woman:
			//美女被点到了
			intent.putExtra("gender", false);
			if(isSoundOn){
				soundUtils.playSound(Mytoee_keActivity.this,R.raw.girl);
			}
			startActivity(intent);
			break;
		case R.id.sound:
			Editor editor=sp.edit();
			if(isSoundOn){
				sound.setBackgroundResource(R.drawable.bt_homepage_sound_off);
				editor.putBoolean("isSoundOn",false);
			}
			else{
				sound.setBackgroundResource(R.drawable.bt_homepage_sound_on);
				editor.putBoolean("isSoundOn",true);
			}
			isSoundOn=!isSoundOn;
			editor.commit();
			break;
		case R.id.yijian:
			intent.putExtra("all",true);
			startActivity(intent);
			break;
		default:
			break;
		}
	}   
}          