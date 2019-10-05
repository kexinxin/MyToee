package com.jikeyin.utils;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;

public class SoundUtils implements OnLoadCompleteListener{
	int load;
	/**play a sound by path of this sound
	 * @author kexinxin
	 * @param path the path of this sound to play
	 */
      public void playSound(Context context,int path){
       	 SoundPool soundPool=new SoundPool(4,AudioManager.STREAM_MUSIC,0);
    	 load = soundPool.load(context,path,1);
    	 soundPool.setOnLoadCompleteListener(this);
    	 
      }

	public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
		// TODO Auto-generated method stub
		
		soundPool.play(load,1.0f,1.0f,1,0,1.0f);
	}

}
