package com.jikeyin.keinin;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.jikeyin.myotee.listener.OnReplaceListener;
import com.jikeyin.utils.MyRes;

public class MyFragment extends Fragment implements OnItemClickListener {
	protected static final String TAG = null;
	int index;
	boolean gender;
	MyRes myRes;
	int[] pic_res;
	MyGridViewAdapter adapter;
	OnReplaceListener onReplaceListener;
	SharedPreferences all;
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
		gridView.setNumColumns(3);
		gridView.setOnItemClickListener(this);
		// gridView.setScrollbarFadingEnabled(false);
		gridView.setSmoothScrollbarEnabled(false);
		return gridView;
	}

	public class MyGridViewAdapter extends BaseAdapter {
		// 决定gridview有多少个条目
		public int getCount() {
			// TODO Auto-generated method stub
			return pic_res.length;
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
			int res = pic_res[position];
			ImageView imageView = new ImageView(getActivity());
			imageView.setMinimumWidth(120);
			imageView.setMinimumHeight(120);
			imageView.setBackgroundResource(R.drawable.pic_bg);
			imageView.setImageResource(res);
			return imageView;
		}
	}

	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		// 通知自定义的控件替换对应的图片
		int res_click=0;
		if (index == 0) {
			if (gender) {
				res_click = myRes.getRealBoyHair()[position];
			} else {
				res_click = myRes.getRealGirlHair()[position];
			}
		} else if (index == 5) {
			if (gender) {
				if (gender) {
					res_click = myRes.getRealBoyFeature()[position];
				} else {
					res_click = myRes.getRealGirlFeature()[position];
				}
			}
		} else {
			res_click = pic_res[position];
		}
		if (res_click == R.drawable.show_no) {
			res_click = R.drawable.show_nothing;
		}
		if(index==11){
//			new AlertDialog.Builder(getActivity()).setTitle("请输入").setIcon(
//				     android.R.drawable.ic_dialog_info).setView(
//				     new EditText(getActivity())).setPositiveButton("确定", null)
//				     .setNegativeButton("取消", null).show();
			final EditText input = new EditText(getActivity());   
			input.setSingleLine(true); //android:singleLine=”true”  
			   input.setImeOptions(EditorInfo.IME_ACTION_SEND);  
			   input.setInputType(InputType.TYPE_CLASS_TEXT |InputType.TYPE_TEXT_VARIATION_PASSWORD);  
			   input.setOnEditorActionListener(new TextView.OnEditorActionListener() {  
			       public boolean onEditorAction(TextView v, int actionId,    
			               KeyEvent event)  {    
			        Log.d(TAG, ""+actionId+","+event);  
			           if (actionId==EditorInfo.IME_ACTION_SEND  
			                ||(event!=null&&event.getKeyCode()== KeyEvent.KEYCODE_ENTER)) {    
			            //do something;  
			            return true;  
			           }    
			           return false;    
			       }    
			   });
		}
		onReplaceListener.onReplace(res_click,index);
		//all=this.get
	}

}
