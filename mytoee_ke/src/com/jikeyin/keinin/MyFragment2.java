package com.jikeyin.keinin;

import com.jikeyin.myotee.listener.OnReplaceListener;
import com.jikeyin.utils.MyRes;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MyFragment2 extends Fragment{
	int index;
	boolean gender;
	MyRes myRes;
	int[] pic_res;
	MyGridViewAdapter adapter;
	OnReplaceListener onReplaceListener;
	SharedPreferences all;
    int path;
    String path1;
	public OnReplaceListener getOnReplaceListener() {
		return onReplaceListener;
	}

	public void setOnReplaceListener(OnReplaceListener onReplaceListener) {
		this.onReplaceListener = onReplaceListener;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		GridView gridView = new GridView(getActivity());
		Bundle bundle = this.getArguments();
		index = bundle.getInt("index");
		gender = bundle.getBoolean("gender");
		myRes = new MyRes();
		Bundle bundle1 = this.getArguments();
		path=bundle1.getInt("path");
		switch (index) {
		case 0:
			if (gender) {
				pic_res = myRes.getBoyHair();
			} else
				pic_res = myRes.getGirlHair();
			break;
		case 1:
			pic_res = myRes.getFaceShape();
			break;
		case 2:
			pic_res = myRes.getEyeBrow();
			break;
		case 3:
			pic_res = myRes.getEye();
			break;
		case 4:
			pic_res = myRes.getMouth();
			break;
		case 5:
			if (gender) {
				pic_res = myRes.getFeature();
			} else
				pic_res = myRes.getGirlFeature();
			break;
		case 6:
			pic_res = myRes.getGlass();
			break;
		case 7:
			if (gender) {
				pic_res = myRes.getBoyClothes();
			} else
				pic_res = myRes.getGirlClothes();
			break;
		case 8:
			pic_res = myRes.getHat();
			break;
		case 9:
			pic_res = myRes.getHobby();
			break;
		case 10:
			pic_res = myRes.getBackGround();
			break;
		case 11:
			pic_res = myRes.getPop();
			break;
		default:
			break;
		}
		adapter = new MyGridViewAdapter();
		gridView.setAdapter(adapter);
		gridView.setNumColumns(1);
		// gridView.setScrollbarFadingEnabled(false);
		gridView.setSmoothScrollbarEnabled(false);
		return gridView;
	}

	private class MyGridViewAdapter extends BaseAdapter {
		// 决定gridview有多少个条目
		//MainActivity main=new MainActivity();
		public int getCount() {
			// TODO Auto-generated method stub
			return MainActivity.count;
		}

		// 拿到第position的地址
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return pic_res[position];
		}

		//
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		// 决定每个条目长什么样
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			// 拿到对应条目的图片

			ImageView imageView = new ImageView(getActivity());
			path1=Environment.getExternalStorageDirectory().getAbsolutePath()+"/"+position+".png";
			Bitmap bitmap=BitmapFactory.decodeFile(path1);
			imageView.setImageBitmap(bitmap);
			return imageView;
		}
	}
}
	