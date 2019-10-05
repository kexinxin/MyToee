package com.jikeyin.keinin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		MyThread myThread=new MyThread();
	    myThread.start();
	}
	private class MyThread extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			//经过两秒后跳转到LogActivity界面
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				Intent intent=new Intent(SplashActivity.this,Mytoee_keActivity.class);
			    startActivity(intent);
			    finish();
			}
		}
	}
}
