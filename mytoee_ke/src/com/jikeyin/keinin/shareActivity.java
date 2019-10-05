package com.jikeyin.keinin;

import com.jikeyin.myotee.listener.OnReplaceListener;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class shareActivity extends  FragmentActivity implements OnCheckedChangeListener, OnPageChangeListener, OnClickListener,
OnReplaceListener,OnTouchListener{
	MyPagerAdapter adapter;
	int path;
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.share);
		ViewPager vp;
		vp = (ViewPager) findViewById(R.id.vp1);
		adapter = new MyPagerAdapter(this.getSupportFragmentManager());
		vp.setAdapter(adapter);
		vp.setOnPageChangeListener(this);
		Intent intent1 = this.getIntent();
		path = intent1.getIntExtra("path",10);
	}
	private class MyPagerAdapter extends FragmentPagerAdapter {
		
		public MyPagerAdapter(FragmentManager fm) {
			super(fm);
			
			// TODO Auto-generated constructor stub
		}

		// 决定每一页长什么样子
		@Override
		public Fragment getItem(int arg0) {
			// TODO Auto-generated method stub
			MyFragment2 myFragment2 = new MyFragment2();

			// 蛇皮带
			Bundle bundle = new Bundle();
			bundle.putInt("path",path);
			myFragment2.setArguments(bundle);
			myFragment2.setOnReplaceListener(shareActivity.this);
			return myFragment2;
		}

		// 决定ViewPager有多少页
		@Override
		public int getCount() {
			// TODO Auto-generated method stub

			return 1;
		}

	}
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return false;
	}
	public void onReplace(int res, int index) {
		// TODO Auto-generated method stub
		
	}
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	public void onPageSelected(int arg0) {
		// TODO Auto-generated method stub
		
	}
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		
	}

}
