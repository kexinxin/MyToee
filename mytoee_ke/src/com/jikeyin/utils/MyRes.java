package com.jikeyin.utils;


import com.jikeyin.keinin.R;


public class MyRes {
	
	int [] boyHair;
	int [] realBoyHair;
	int [] girlHair;
	int [] realGirlHair;
	int [] faceShape;
	int [] eyebrow;
	int [] eye;
	int [] mouth;
	int [] feature;
	int [] feature_g;
	int [] realBoyFeature;
	int [] realGirlFeature;
	int [] glass;
	int [] boy_clothes;
	int [] girl_clothes;
	int [] hat;
	int [] hobby;
	int [] background;
	int [] pop;
	int [] boy_default;
	int [] girl_default;
	
	/*获取boy发型的图片地址数组
	 * */
	//SharedPreferences sp;
	public int [] getBoyHair(){
		if(boyHair==null){
			boyHair = new int[]{
					R.drawable.pic_s1_0,
					R.drawable.pic_s1_1,
					R.drawable.pic_s1_2,
					R.drawable.pic_s1_3,
					R.drawable.pic_s1_4,
					R.drawable.pic_s1_5,
					R.drawable.pic_s1_6,
					R.drawable.pic_s1_7,
					R.drawable.pic_s1_8,
					R.drawable.pic_s1_9,
					R.drawable.pic_s1_10,
					R.drawable.pic_s1_11,
					R.drawable.pic_s1_12,
					R.drawable.pic_s1_13,
					R.drawable.pic_s1_14,
					R.drawable.pic_s1_15,
					R.drawable.pic_s1_16,
					R.drawable.pic_s1_17,
					R.drawable.pic_s1_18,
					R.drawable.pic_s1_19,
					R.drawable.pic_s1_20,
					R.drawable.pic_s1_21,
					R.drawable.pic_s1_22,
					R.drawable.pic_s1_23,
					R.drawable.pic_s1_24,
					R.drawable.pic_s1_25,
					R.drawable.pic_s1_26,
					R.drawable.pic_s1_27,
					R.drawable.pic_s1_28,
					R.drawable.pic_s1_29,
					R.drawable.pic_s1_30,
					R.drawable.pic_s1_31,
					R.drawable.pic_s1_32,
					R.drawable.pic_s1_33,
					R.drawable.pic_s1_34,
					R.drawable.pic_s1_35,
					R.drawable.pic_s1_36,
					R.drawable.pic_s1_37,
					R.drawable.pic_s1_38,
					R.drawable.pic_s1_39,
					R.drawable.pic_s1_40,
					R.drawable.pic_s1_41,
					R.drawable.pic_s1_42,
					R.drawable.pic_s1_43,
					R.drawable.pic_s1_44,
					R.drawable.pic_s1_45,
					R.drawable.pic_s1_46,
					R.drawable.pic_s1_47,
					R.drawable.pic_s1_48,
					R.drawable.pic_s1_49,
					R.drawable.pic_s1_50
			};
		}
		return boyHair;
	}
	
	/**
	 * 获取真实发型的图片数组
	 * @return
	 */
	public int [] getRealBoyHair(){
		if(realBoyHair == null){
			realBoyHair = new int[]{
					R.drawable.pic_rs1_0,
					R.drawable.pic_rs1_1,
					R.drawable.pic_rs1_2,
					R.drawable.pic_rs1_3,
					R.drawable.pic_rs1_4,
					R.drawable.pic_rs1_5,
					R.drawable.pic_rs1_6,
					R.drawable.pic_rs1_7,
					R.drawable.pic_rs1_8,
					R.drawable.pic_rs1_9,
					R.drawable.pic_rs1_10,
					R.drawable.pic_rs1_11,
					R.drawable.pic_rs1_12,
					R.drawable.pic_rs1_13,
					R.drawable.pic_rs1_14,
					R.drawable.pic_rs1_15,
					R.drawable.pic_rs1_16,
					R.drawable.pic_rs1_17,
					R.drawable.pic_rs1_18,
					R.drawable.pic_rs1_19,
					R.drawable.pic_rs1_20,
					R.drawable.pic_rs1_21,
					R.drawable.pic_rs1_22,
					R.drawable.pic_rs1_23,
					R.drawable.pic_rs1_24,
					R.drawable.pic_rs1_25,
					R.drawable.pic_rs1_26,
					R.drawable.pic_rs1_27,
					R.drawable.pic_rs1_28,
					R.drawable.pic_rs1_29,
					R.drawable.pic_rs1_30,
					R.drawable.pic_rs1_31,
					R.drawable.pic_rs1_32,
					R.drawable.pic_rs1_33,
					R.drawable.pic_rs1_34,
					R.drawable.pic_rs1_35,
					R.drawable.pic_rs1_36,
					R.drawable.pic_rs1_37,
					R.drawable.pic_rs1_38,
					R.drawable.pic_rs1_39,
					R.drawable.pic_rs1_40,
					R.drawable.pic_rs1_41,
					R.drawable.pic_rs1_42,
					R.drawable.pic_rs1_43,
					R.drawable.pic_rs1_44,
					R.drawable.pic_rs1_45,
					R.drawable.pic_rs1_46,
					R.drawable.pic_rs1_47,
					R.drawable.pic_rs1_48,
					R.drawable.pic_rs1_49,
					R.drawable.pic_rs1_50
			};
		}
		return realBoyHair;
	}
	/*
	 * 获取girl发型的图片地址数组
	 */
	public int [] getGirlHair(){
		if(girlHair==null){
			girlHair = new int[]{
				R.drawable.pic_s1_g_1,
				R.drawable.pic_s1_g_2,
				R.drawable.pic_s1_g_3,
				R.drawable.pic_s1_g_4,
				R.drawable.pic_s1_g_5,
				R.drawable.pic_s1_g_6,
				R.drawable.pic_s1_g_7,
				R.drawable.pic_s1_g_8,
				R.drawable.pic_s1_g_9,
				R.drawable.pic_s1_g_10,
				R.drawable.pic_s1_g_11,
				R.drawable.pic_s1_g_12,
				R.drawable.pic_s1_g_13,
				R.drawable.pic_s1_g_14,
				R.drawable.pic_s1_g_15,
				R.drawable.pic_s1_g_16,
				R.drawable.pic_s1_g_17,
				R.drawable.pic_s1_g_18,
				R.drawable.pic_s1_g_19,
				R.drawable.pic_s1_g_20,
				R.drawable.pic_s1_g_21,
				R.drawable.pic_s1_g_22,
				R.drawable.pic_s1_g_23,
				R.drawable.pic_s1_g_24,
				R.drawable.pic_s1_g_25,
				R.drawable.pic_s1_g_26,
				R.drawable.pic_s1_g_27,
				R.drawable.pic_s1_g_28,
				R.drawable.pic_s1_g_29,
				R.drawable.pic_s1_g_30,
				R.drawable.pic_s1_g_31,
				R.drawable.pic_s1_g_32,
				R.drawable.pic_s1_g_33,
				R.drawable.pic_s1_g_34,
				R.drawable.pic_s1_g_35,
				R.drawable.pic_s1_g_36,
				R.drawable.pic_s1_g_37,
				R.drawable.pic_s1_g_38,
				R.drawable.pic_s1_g_39,
				R.drawable.pic_s1_g_40,
				R.drawable.pic_s1_g_41,
				R.drawable.pic_s1_g_42,
				R.drawable.pic_s1_g_43,
				R.drawable.pic_s1_g_44,
				R.drawable.pic_s1_g_45,
				R.drawable.pic_s1_g_46,
				R.drawable.pic_s1_g_47,
				R.drawable.pic_s1_g_48,
				R.drawable.pic_s1_g_49,
				R.drawable.pic_s1_g_50
			};
		}
		return girlHair;
	}
	/**
	 * 获取真实girl的图片数组
	 * @return
	 */
	public int [] getRealGirlHair(){
		if(realGirlHair == null){
			realGirlHair = new int[]{
					R.drawable.pic_rs1_g_1,
					R.drawable.pic_rs1_g_2,
					R.drawable.pic_rs1_g_3,
					R.drawable.pic_rs1_g_4,
					R.drawable.pic_rs1_g_5,
					R.drawable.pic_rs1_g_6,
					R.drawable.pic_rs1_g_7,
					R.drawable.pic_rs1_g_8,
					R.drawable.pic_rs1_g_9,
					R.drawable.pic_rs1_g_10,
					R.drawable.pic_rs1_g_11,
					R.drawable.pic_rs1_g_12,
					R.drawable.pic_rs1_g_13,
					R.drawable.pic_rs1_g_14,
					R.drawable.pic_rs1_g_15,
					R.drawable.pic_rs1_g_16,
					R.drawable.pic_rs1_g_17,
					R.drawable.pic_rs1_g_18,
					R.drawable.pic_rs1_g_19,
					R.drawable.pic_rs1_g_20,
					R.drawable.pic_rs1_g_21,
					R.drawable.pic_rs1_g_22,
					R.drawable.pic_rs1_g_23,
					R.drawable.pic_rs1_g_24,
					R.drawable.pic_rs1_g_25,
					R.drawable.pic_rs1_g_26,
					R.drawable.pic_rs1_g_27,
					R.drawable.pic_rs1_g_28,
					R.drawable.pic_rs1_g_29,
					R.drawable.pic_rs1_g_30,
					R.drawable.pic_rs1_g_31,
					R.drawable.pic_rs1_g_32,
					R.drawable.pic_rs1_g_33,
					R.drawable.pic_rs1_g_34,
					R.drawable.pic_rs1_g_35,
					R.drawable.pic_rs1_g_36,
					R.drawable.pic_rs1_g_37,
					R.drawable.pic_rs1_g_38,
					R.drawable.pic_rs1_g_39,
					R.drawable.pic_rs1_g_40,
					R.drawable.pic_rs1_g_41,
					R.drawable.pic_rs1_g_42,
					R.drawable.pic_rs1_g_43,
					R.drawable.pic_rs1_g_44,
					R.drawable.pic_rs1_g_45,
					R.drawable.pic_rs1_g_46,
					R.drawable.pic_rs1_g_47,
					R.drawable.pic_rs1_g_48,
					R.drawable.pic_rs1_g_49,
					R.drawable.pic_rs1_g_50
			};
		}
		return realGirlHair;
	}
	/*
	 * 脸型图片数组
	 */
	public int [] getFaceShape(){
		if(faceShape == null){
			faceShape = new int[]{
					R.drawable.pic_s2_20000,
					R.drawable.pic_s2_20001,
					R.drawable.pic_s2_20002,
					R.drawable.pic_s2_20003,
					R.drawable.pic_s2_20004,
					R.drawable.pic_s2_20005,
					R.drawable.pic_s2_20006,
					R.drawable.pic_s2_20007,
					R.drawable.pic_s2_20008,
					R.drawable.pic_s2_20009,
					R.drawable.pic_s2_20010,
					R.drawable.pic_s2_20011,
					R.drawable.pic_s2_20012,
					R.drawable.pic_s2_20013,
					R.drawable.pic_s2_20014,
					R.drawable.pic_s2_20015,
					R.drawable.pic_s2_20016,
					R.drawable.pic_s2_20017,
					R.drawable.pic_s2_20018,
					R.drawable.pic_s2_20019
			};
		}
		return faceShape;
	}
	
	/*
	 * 眉毛图片数组
	 */
	public int [] getEyeBrow(){
		if(eyebrow == null){
			eyebrow = new int[]{
				R.drawable.	pic_s3_1,
				R.drawable.	pic_s3_2,
				R.drawable.	pic_s3_3,
				R.drawable.	pic_s3_4,
				R.drawable.	pic_s3_5,
				R.drawable.	pic_s3_6,
				R.drawable.	pic_s3_7,
				R.drawable.	pic_s3_8,
				R.drawable.	pic_s3_9,
				R.drawable.	pic_s3_10,
				R.drawable.	pic_s3_11,
				R.drawable.	pic_s3_12,
				R.drawable.	pic_s3_13,
				R.drawable.	pic_s3_14,
				R.drawable.	pic_s3_15,
				R.drawable.	pic_s3_16,
				R.drawable.	pic_s3_17,
				R.drawable.	pic_s3_18,
				R.drawable.	pic_s3_19,
				R.drawable.	pic_s3_20,
				R.drawable.	pic_s3_21,
				R.drawable.	pic_s3_22,
				R.drawable.	pic_s3_23,
				R.drawable.	pic_s3_24,
				R.drawable.	pic_s3_25,
				R.drawable.	pic_s3_26,
				R.drawable.	pic_s3_27,
				R.drawable.	pic_s3_28,
				R.drawable.	pic_s3_29,
				R.drawable.	pic_s3_30,
				R.drawable.	pic_s3_31,
				R.drawable.	pic_s3_20000,
				R.drawable.	pic_s3_20001,
				R.drawable.	pic_s3_20002,
				R.drawable.	pic_s3_20003,
				R.drawable.	pic_s3_20004,
				R.drawable.	pic_s3_20005,
				R.drawable.	pic_s3_20006,
				R.drawable.	pic_s3_20007,
				R.drawable.	pic_s3_20008,
				R.drawable.	pic_s3_20009,
				R.drawable.	pic_s3_20010,
				R.drawable.	pic_s3_20011,
				R.drawable.	pic_s3_20012,
				R.drawable.	pic_s3_20013,
				R.drawable.	pic_s3_20014
			};
		}
		return eyebrow;
	}
	
	/*
	 * 眼睛图片数组
	 * */
	public int [] getEye(){
		if(eye == null){
			eye = new int[]{
				R.drawable.pic_s4_1,
				R.drawable.pic_s4_2,
				R.drawable.pic_s4_3,
				R.drawable.pic_s4_4,
				R.drawable.pic_s4_5,
				R.drawable.pic_s4_6,
				R.drawable.pic_s4_7,
				R.drawable.pic_s4_8,
				R.drawable.pic_s4_9,
				R.drawable.pic_s4_10,
				R.drawable.pic_s4_11,
				R.drawable.pic_s4_12,
				R.drawable.pic_s4_13,
				R.drawable.pic_s4_14,
				R.drawable.pic_s4_15,
				R.drawable.pic_s4_16,
				R.drawable.pic_s4_17,
				R.drawable.pic_s4_18,
				R.drawable.pic_s4_19,
				R.drawable.pic_s4_20,
				R.drawable.pic_s4_21,
				R.drawable.pic_s4_22,
				R.drawable.pic_s4_23,
				R.drawable.pic_s4_24,
				R.drawable.pic_s4_25,
				R.drawable.pic_s4_26,
				R.drawable.pic_s4_27,
				R.drawable.pic_s4_28,
				R.drawable.pic_s4_29,
				R.drawable.pic_s4_30,
				R.drawable.pic_s4_31,
				R.drawable.pic_s4_32,
				R.drawable.pic_s4_33,
				R.drawable.pic_s4_34,
				R.drawable.pic_s4_35,
				R.drawable.pic_s4_36,
				R.drawable.pic_s4_37,
				R.drawable.pic_s4_38,
				R.drawable.pic_s4_39,
				R.drawable.pic_s4_40,
				R.drawable.pic_s4_41,
				R.drawable.pic_s4_42,
				R.drawable.pic_s4_43,
				R.drawable.pic_s4_44,
				R.drawable.pic_s4_45,
				R.drawable.pic_s4_46,
				R.drawable.pic_s4_47,
				R.drawable.pic_s4_48,
				R.drawable.pic_s4_49,
				R.drawable.pic_s4_50,
				R.drawable.pic_s4_51,
				R.drawable.pic_s4_52,
				R.drawable.pic_s4_53,
				R.drawable.pic_s4_20000,
				R.drawable.pic_s4_20001,
				R.drawable.pic_s4_20002,
				R.drawable.pic_s4_20003,
				R.drawable.pic_s4_20004,
				R.drawable.pic_s4_20005,
				R.drawable.pic_s4_20006,
				R.drawable.pic_s4_20007,
				R.drawable.pic_s4_20008,
				R.drawable.pic_s4_20009,
				R.drawable.pic_s4_20010,
				R.drawable.pic_s4_20011,
				R.drawable.pic_s4_20012,
				R.drawable.pic_s4_20013,
				R.drawable.pic_s4_20014,
				R.drawable.pic_s4_20015,
				R.drawable.pic_s4_20016,
				R.drawable.pic_s4_20017,
				R.drawable.pic_s4_20018,
				R.drawable.pic_s4_20019,
				R.drawable.pic_s4_20020,
				R.drawable.pic_s4_20021,
				R.drawable.pic_s4_20022,
				R.drawable.pic_s4_20023,
				R.drawable.pic_s4_20024,
				R.drawable.pic_s4_20025,
				R.drawable.pic_s4_20026,
				R.drawable.pic_s4_20027,
				R.drawable.pic_s4_20028,
				R.drawable.pic_s4_20029,
				R.drawable.pic_s4_20030,
				R.drawable.pic_s4_20031,
				R.drawable.pic_s4_20032,
				R.drawable.pic_s4_20033,
				R.drawable.pic_s4_20034,
				R.drawable.pic_s4_20035,
				R.drawable.pic_s4_20036,
				R.drawable.pic_s4_20037,
				R.drawable.pic_s4_20038,
				R.drawable.pic_s4_20039,
				R.drawable.pic_s4_20040,
				R.drawable.pic_s4_20041,
				R.drawable.pic_s4_20042,
				R.drawable.pic_s4_20043,
				R.drawable.pic_s4_20044
			};
		}
		return eye;
	}
	
	/*
	 * 嘴巴图片数组
	 */
	
	public int[] getMouth(){
		if(mouth == null){
			mouth = new int[]{
				R.drawable.pic_s5_1,
				R.drawable.pic_s5_2,
				R.drawable.pic_s5_3,
				R.drawable.pic_s5_4,
				R.drawable.pic_s5_5,
				R.drawable.pic_s5_6,
				R.drawable.pic_s5_7,
				R.drawable.pic_s5_8,
				R.drawable.pic_s5_9,
				R.drawable.pic_s5_10,
				R.drawable.pic_s5_11,
				R.drawable.pic_s5_12,
				R.drawable.pic_s5_13,
				R.drawable.pic_s5_14,
				R.drawable.pic_s5_15,
				R.drawable.pic_s5_16,
				R.drawable.pic_s5_17,
				R.drawable.pic_s5_18,
				R.drawable.pic_s5_19,
				R.drawable.pic_s5_20,
				R.drawable.pic_s5_21,
				R.drawable.pic_s5_22,
				R.drawable.pic_s5_23,
				R.drawable.pic_s5_24,
				R.drawable.pic_s5_25,
				R.drawable.pic_s5_26,
				R.drawable.pic_s5_27,
				R.drawable.pic_s5_28,
				R.drawable.pic_s5_29,
				R.drawable.pic_s5_30,
				R.drawable.pic_s5_31,
				R.drawable.pic_s5_32,
				R.drawable.pic_s5_33,
				R.drawable.pic_s5_34,
				R.drawable.pic_s5_35,
				R.drawable.pic_s5_36,
				R.drawable.pic_s5_37,
				R.drawable.pic_s5_38,
				R.drawable.pic_s5_39,
				R.drawable.pic_s5_40,
				R.drawable.pic_s5_41,
				R.drawable.pic_s5_42,
				R.drawable.pic_s5_43,
				R.drawable.pic_s5_44,
				R.drawable.pic_s5_45,
				R.drawable.pic_s5_46,
				R.drawable.pic_s5_47,
				R.drawable.pic_s5_48,
				R.drawable.pic_s5_49,
				R.drawable.pic_s5_50,
				R.drawable.pic_s5_51,
				R.drawable.pic_s5_52,
				R.drawable.pic_s5_53,
				R.drawable.pic_s5_54,
				R.drawable.pic_s5_55,
				R.drawable.pic_s5_56,
				R.drawable.pic_s5_57,
				R.drawable.pic_s5_58,
				R.drawable.pic_s5_59,
				R.drawable.pic_s5_60,
				R.drawable.pic_s5_61,
				R.drawable.pic_s5_62,
				R.drawable.pic_s5_63,
				R.drawable.pic_s5_64,
				R.drawable.pic_s5_65,
				R.drawable.pic_s5_66,
				R.drawable.pic_s5_67,
				R.drawable.pic_s5_68,
				R.drawable.pic_s5_69,
				R.drawable.pic_s5_70,
				R.drawable.pic_s5_71,
				R.drawable.pic_s5_72,
				R.drawable.pic_s5_73,
				R.drawable.pic_s5_74,
				R.drawable.pic_s5_75,
				R.drawable.pic_s5_76,
				R.drawable.pic_s5_77,
				R.drawable.pic_s5_78,
				R.drawable.pic_s5_79,
				R.drawable.pic_s5_80,
				R.drawable.pic_s5_81,
				R.drawable.pic_s5_82,
				R.drawable.pic_s5_83,
				R.drawable.pic_s5_84,
				R.drawable.pic_s5_85,
				R.drawable.pic_s5_86,
				R.drawable.pic_s5_87,
				R.drawable.pic_s5_88,
				R.drawable.pic_s5_89,
				R.drawable.pic_s5_90,
				R.drawable.pic_s5_91,
				R.drawable.pic_s5_92,
				R.drawable.pic_s5_93,
				R.drawable.pic_s5_94,
				R.drawable.pic_s5_95,
				R.drawable.pic_s5_96,
				R.drawable.pic_s5_97,
				R.drawable.pic_s5_98,
				R.drawable.pic_s5_99,
				R.drawable.pic_s5_100,
				R.drawable.pic_s5_101,
				R.drawable.pic_s5_102,
				R.drawable.pic_s5_20000,
				R.drawable.pic_s5_20001,
				R.drawable.pic_s5_20002,
				R.drawable.pic_s5_20003,
				R.drawable.pic_s5_20004,
				R.drawable.pic_s5_20005,
				R.drawable.pic_s5_20006,
				R.drawable.pic_s5_20007,
				R.drawable.pic_s5_20008,
				R.drawable.pic_s5_20018,
				R.drawable.pic_s5_20019,
				R.drawable.pic_s5_20020,
				R.drawable.pic_s5_20021,
				R.drawable.pic_s5_20022,
				R.drawable.pic_s5_20023,
				R.drawable.pic_s5_20024,
				R.drawable.pic_s5_20025,
				R.drawable.pic_s5_20026,
				R.drawable.pic_s5_20027,
				R.drawable.pic_s5_20028,
				R.drawable.pic_s5_20029,
				R.drawable.pic_s5_20030,
				R.drawable.pic_s5_20031,
				R.drawable.pic_s5_20032,
				R.drawable.pic_s5_20033,
				R.drawable.pic_s5_20034,
				R.drawable.pic_s5_20035,
				R.drawable.pic_s5_20036,
				R.drawable.pic_s5_20037
			};
		}
		return mouth;
	}
	
	/*
	 * 特征图片数组
	 */
	public int [] getFeature(){
		if(feature == null){
			feature = new int[]{
					R.drawable.show_no,
					R.drawable.pic_s6_1,
					R.drawable.pic_s6_2,
					R.drawable.pic_s6_3,
					R.drawable.pic_s6_4,
					R.drawable.pic_s6_5,
					R.drawable.pic_s6_8,
					R.drawable.pic_s6_9,
					R.drawable.pic_s6_10,
					R.drawable.pic_s6_11,
					R.drawable.pic_s6_12,
					R.drawable.pic_s6_14,
					R.drawable.pic_s6_15,
					R.drawable.pic_s6_16
			};
		}
		return feature;
	}
	/**
	 * 获取真实boy图片数组
	 */
	public int[] getRealBoyFeature(){
		if(realBoyFeature == null){
			realBoyFeature = new int[]{
					R.drawable.show_nothing,
					R.drawable.pic_rs6_1,
					R.drawable.pic_rs6_2,
					R.drawable.pic_rs6_3,
					R.drawable.pic_rs6_4,
					R.drawable.pic_rs6_5,
					R.drawable.pic_rs6_8,
					R.drawable.pic_rs6_9,
					R.drawable.pic_rs6_10,
					R.drawable.pic_rs6_11,
					R.drawable.pic_rs6_12,
					R.drawable.pic_rs6_14,
					R.drawable.pic_rs6_15,
					R.drawable.pic_rs6_16
			};
		}
		return realBoyFeature;
	}
	/**
	 * 获取girl特征图片数组
	 * @return
	 */
	public int[] getGirlFeature(){
		if(feature_g == null){
			feature_g = new int[]{
					R.drawable.show_no,
					R.drawable.pic_s6_1,
					R.drawable.pic_s6_10,
					R.drawable.pic_s6_11,
					R.drawable.pic_s6_12,
					R.drawable.pic_s6_14,
					R.drawable.pic_s6_15,
					R.drawable.pic_s6_16,
					R.drawable.pic_s6_20012,
					R.drawable.pic_s6_20013,
					R.drawable.pic_s6_20014,
					R.drawable.pic_s6_20015,
					R.drawable.pic_s6_20016
					
			};
		}
		return feature_g;
	}
	
	/**
	 * 获取真实girl特征图片数组
	 * @return
	 */
	public int [] getRealGirlFeature(){
		if(realGirlFeature == null){
			realGirlFeature = new int[]{
					R.drawable.show_nothing,
					R.drawable.pic_rs6_1,
					R.drawable.pic_rs6_10,
					R.drawable.pic_rs6_11,
					R.drawable.pic_rs6_12,
					R.drawable.pic_rs6_14,
					R.drawable.pic_rs6_15,
					R.drawable.pic_rs6_16,
					R.drawable.pic_rs6_20012,
					R.drawable.pic_rs6_20013,
					R.drawable.pic_rs6_20014,
					R.drawable.pic_rs6_20015,
					R.drawable.pic_rs6_20016
			};
		}
		return realGirlFeature;
	}
	/*
	 * 眼睛图片数组
	 */
	public int[] getGlass(){
		if(glass == null){
			glass = new int[]{
					R.drawable.show_no,
					R.drawable.pic_s7_1,
					R.drawable.pic_s7_2,
					R.drawable.pic_s7_3,
					R.drawable.pic_s7_4,
					R.drawable.pic_s7_5,
					R.drawable.pic_s7_6,
					R.drawable.pic_s7_7,
					R.drawable.pic_s7_8,
					R.drawable.pic_s7_9,
					R.drawable.pic_s7_10,
					R.drawable.pic_s7_11,
					R.drawable.pic_s7_12,
					R.drawable.pic_s7_13,
					R.drawable.pic_s7_14,
					R.drawable.pic_s7_15,
					R.drawable.pic_s7_16,
					R.drawable.pic_s7_17,
					R.drawable.pic_s7_18,
					R.drawable.pic_s7_19,
					R.drawable.pic_s7_20,
					R.drawable.pic_s7_20000,
					R.drawable.pic_s7_20001,
					R.drawable.pic_s7_20002,
					R.drawable.pic_s7_20003,
					R.drawable.pic_s7_20004,
					R.drawable.pic_s7_20005,
					R.drawable.pic_s7_20006,
					R.drawable.pic_s7_20007,
					R.drawable.pic_s7_20008,
			};
		}
		return glass;
	}
	
	/*
	 * 获取boy衣服图片数组
	 */
	public int[] getBoyClothes(){
		if(boy_clothes == null){
			boy_clothes = new int[]{
				R.drawable.pic_s8_1,
				R.drawable.pic_s8_2,
				R.drawable.pic_s8_3,
				R.drawable.pic_s8_4,
				R.drawable.pic_s8_5,
				R.drawable.pic_s8_6,
				R.drawable.pic_s8_7,
				R.drawable.pic_s8_8,
				R.drawable.pic_s8_9,
				R.drawable.pic_s8_10,
				R.drawable.pic_s8_11,
				R.drawable.pic_s8_12,
				R.drawable.pic_s8_13,
				R.drawable.pic_s8_14,
				R.drawable.pic_s8_15,
				R.drawable.pic_s8_16,
				R.drawable.pic_s8_17,
				R.drawable.pic_s8_18,
				R.drawable.pic_s8_19,
				R.drawable.pic_s8_20,
				R.drawable.pic_s8_21,
				R.drawable.pic_s8_22,
				R.drawable.pic_s8_23,
				R.drawable.pic_s8_24,
				R.drawable.pic_s8_25,
				R.drawable.pic_s8_26,
				R.drawable.pic_s8_27,
				R.drawable.pic_s8_28,
				R.drawable.pic_s8_29,
				R.drawable.pic_s8_30,
				R.drawable.pic_s8_31,
				R.drawable.pic_s8_32,
				R.drawable.pic_s8_33,
				R.drawable.pic_s8_34,
				R.drawable.pic_s8_35,
				R.drawable.pic_s8_36,
				R.drawable.pic_s8_37,
				R.drawable.pic_s8_38,
				R.drawable.pic_s8_39,
				R.drawable.pic_s8_40,
				R.drawable.pic_s8_20000,
				R.drawable.pic_s8_20001,
				R.drawable.pic_s8_20002,
				R.drawable.pic_s8_20003,
				R.drawable.pic_s8_20004,
				R.drawable.pic_s8_20005,
				R.drawable.pic_s8_20006,
				R.drawable.pic_s8_20007,
				R.drawable.pic_s8_20008,
				R.drawable.pic_s8_20009,
				R.drawable.pic_s8_20010,
				R.drawable.pic_s8_20011,
				R.drawable.pic_s8_20012,
				R.drawable.pic_s8_20013,
				R.drawable.pic_s8_20014,
				R.drawable.pic_s8_20015,
				R.drawable.pic_s8_20016,
				R.drawable.pic_s8_20017,
				R.drawable.pic_s8_20018,
				R.drawable.pic_s8_20019,
				R.drawable.pic_s8_20020,
				R.drawable.pic_s8_20021,
				R.drawable.pic_s8_20022,
				R.drawable.pic_s8_20023,
				R.drawable.pic_s8_20024,
				R.drawable.pic_s8_20025,
				R.drawable.pic_s8_20026,
				R.drawable.pic_s8_20027,
				R.drawable.pic_s8_20028,
				R.drawable.pic_s8_20029,
				R.drawable.pic_s8_20030,
				R.drawable.pic_s8_20031,
				R.drawable.pic_s8_20032,
				R.drawable.pic_s8_20033,
				R.drawable.pic_s8_20034,
				R.drawable.pic_s8_20035,
				R.drawable.pic_s8_20036,
				R.drawable.pic_s8_20037,
				R.drawable.pic_s8_20039,
				R.drawable.pic_s8_20040,
				R.drawable.pic_s8_20041,
				R.drawable.pic_s8_20042,
				R.drawable.pic_s8_20043,
				R.drawable.pic_s8_20044,
				R.drawable.pic_s8_20045,
				R.drawable.pic_s8_20046,
				R.drawable.pic_s8_20047,
				R.drawable.pic_s8_20048,
				R.drawable.pic_s8_20049,
				R.drawable.pic_s8_20050,
				R.drawable.pic_s8_20051,
				R.drawable.pic_s8_20052,
				R.drawable.pic_s8_20053,
				R.drawable.pic_s8_20054,
				R.drawable.pic_s8_20055,
				R.drawable.pic_s8_20056,
				R.drawable.pic_s8_20057,
				R.drawable.pic_s8_20058,
				R.drawable.pic_s8_20059,
				R.drawable.pic_s8_20060,
				R.drawable.pic_s8_20061,
				R.drawable.pic_s8_20062,
				R.drawable.pic_s8_20063,
				R.drawable.pic_s8_20064,
				R.drawable.pic_s8_20065,
				R.drawable.pic_s8_20066,
				R.drawable.pic_s8_20067,
				R.drawable.pic_s8_20068,
				R.drawable.pic_s8_20069,
				R.drawable.pic_s8_20070,
				R.drawable.pic_s8_20071,
				R.drawable.pic_s8_20072,
				R.drawable.pic_s8_20073,
				R.drawable.pic_s8_20074,
				R.drawable.pic_s8_20075,
				R.drawable.pic_s8_20076,
				R.drawable.pic_s8_20077,
				R.drawable.pic_s8_20078,
				R.drawable.pic_s8_20079,
				R.drawable.pic_s8_20080,
				R.drawable.pic_s8_20081,
				R.drawable.pic_s8_20082,
				R.drawable.pic_s8_20083,
				R.drawable.pic_s8_20084,
				R.drawable.pic_s8_20085,
				R.drawable.pic_s8_20086,
				R.drawable.pic_s8_20087,
				R.drawable.pic_s8_20088,
				R.drawable.pic_s8_20089,
				R.drawable.pic_s8_20090,
				R.drawable.pic_s8_20091,
				R.drawable.pic_s8_20092,
				R.drawable.pic_s8_20093,
				R.drawable.pic_s8_20094,
				R.drawable.pic_s8_20095,
				R.drawable.pic_s8_20096,
				R.drawable.pic_s8_30000,
				R.drawable.pic_s8_30001,
				R.drawable.pic_s8_30002,
				R.drawable.pic_s8_30003,
				R.drawable.pic_s8_30004
			};
		}
		return boy_clothes;
	}
	
	/**
	 * 获取girl衣服图片数组
	 */
	
	public int [] getGirlClothes(){
		if(girl_clothes == null){
			girl_clothes = new int[]{
				R.drawable.pic_s8_30005,
				R.drawable.pic_s8_30006,
				R.drawable.pic_s8_30007,
				R.drawable.pic_s8_30008,
				R.drawable.pic_s8_30009,
				R.drawable.pic_s8_30010,
				R.drawable.pic_s8_30011,
				R.drawable.pic_s8_30012,
				R.drawable.pic_s8_30013,
				R.drawable.pic_s8_30014,
				R.drawable.pic_s8_30015,
				R.drawable.pic_s8_30016,
				R.drawable.pic_s8_30017,
				R.drawable.pic_s8_30018,
				R.drawable.pic_s8_30019,
				R.drawable.pic_s8_30020,
				R.drawable.pic_s8_30011,
				R.drawable.pic_s8_30012,
				R.drawable.pic_s8_30013,
				R.drawable.pic_s8_30014,
				R.drawable.pic_s8_30015,
				R.drawable.pic_s8_30016,
				R.drawable.pic_s8_30017,
				R.drawable.pic_s8_30018,
				R.drawable.pic_s8_30019,
				R.drawable.pic_s8_30020,
				R.drawable.pic_s8_30011,
				R.drawable.pic_s8_30012,
				R.drawable.pic_s8_30013,
				R.drawable.pic_s8_30014,
				R.drawable.pic_s8_30015,
				R.drawable.pic_s8_30016,
				R.drawable.pic_s8_30017,
				R.drawable.pic_s8_30018,
				R.drawable.pic_s8_30019,
				R.drawable.pic_s8_30020,
				R.drawable.pic_s8_30021,
				R.drawable.pic_s8_30022,
				R.drawable.pic_s8_30023,
				R.drawable.pic_s8_30024,
				R.drawable.pic_s8_30025,
				R.drawable.pic_s8_30026,
				R.drawable.pic_s8_30027,
				R.drawable.pic_s8_30028,
				R.drawable.pic_s8_30029,
				R.drawable.pic_s8_30030,
				R.drawable.pic_s8_30031,
				R.drawable.pic_s8_30032,
				R.drawable.pic_s8_30033,
				R.drawable.pic_s8_30034,
				R.drawable.pic_s8_30035,
				R.drawable.pic_s8_30036,
				R.drawable.pic_s8_30037,
				R.drawable.pic_s8_30038,
				R.drawable.pic_s8_30039,
				R.drawable.pic_s8_30040,
				R.drawable.pic_s8_30041,
				R.drawable.pic_s8_30042,
				R.drawable.pic_s8_30043,
				R.drawable.pic_s8_30044,
				R.drawable.pic_s8_30045,
				R.drawable.pic_s8_30046,
				R.drawable.pic_s8_30047,
				R.drawable.pic_s8_30048,
				R.drawable.pic_s8_30049,
				R.drawable.pic_s8_30050,
				R.drawable.pic_s8_30051,
				R.drawable.pic_s8_30052,
				R.drawable.pic_s8_30053,
				R.drawable.pic_s8_30054,
				R.drawable.pic_s8_30055,
				R.drawable.pic_s8_30056,
				R.drawable.pic_s8_30057,
				R.drawable.pic_s8_30058,
				R.drawable.pic_s8_30059,
				R.drawable.pic_s8_30060,
				R.drawable.pic_s8_30061,
				R.drawable.pic_s8_30062,
				R.drawable.pic_s8_30063,
				R.drawable.pic_s8_30064,
				R.drawable.pic_s8_30065,
				R.drawable.pic_s8_30066,
				R.drawable.pic_s8_30067,
				R.drawable.pic_s8_30068,
				R.drawable.pic_s8_30069,
				R.drawable.pic_s8_30070,
				R.drawable.pic_s8_30071,
				R.drawable.pic_s8_30072,
				R.drawable.pic_s8_30073,
				R.drawable.pic_s8_30074,
				R.drawable.pic_s8_30075,
				R.drawable.pic_s8_30076,
				R.drawable.pic_s8_30077,
				R.drawable.pic_s8_30078,
				R.drawable.pic_s8_30079,
				R.drawable.pic_s8_30080,
				R.drawable.pic_s8_30081,
				R.drawable.pic_s8_30082,
				R.drawable.pic_s8_30083,
				R.drawable.pic_s8_30084,
				R.drawable.pic_s8_30085,
				R.drawable.pic_s8_30086,
				R.drawable.pic_s8_30087,
				R.drawable.pic_s8_30088,
				R.drawable.pic_s8_30089,
				R.drawable.pic_s8_g_1,
				R.drawable.pic_s8_g_2,
				R.drawable.pic_s8_g_3,
				R.drawable.pic_s8_g_4,
				R.drawable.pic_s8_g_5,
				R.drawable.pic_s8_g_6,
				R.drawable.pic_s8_g_7,
				R.drawable.pic_s8_g_8,
				R.drawable.pic_s8_g_9,
				R.drawable.pic_s8_g_10,
				R.drawable.pic_s8_g_11,
				R.drawable.pic_s8_g_12,
				R.drawable.pic_s8_g_13,
				R.drawable.pic_s8_g_14,
				R.drawable.pic_s8_g_15,
				R.drawable.pic_s8_g_16,
				R.drawable.pic_s8_g_17,
				R.drawable.pic_s8_g_18,
				R.drawable.pic_s8_g_19,
				R.drawable.pic_s8_g_20,
				R.drawable.pic_s8_g_21,
				R.drawable.pic_s8_g_22,
				R.drawable.pic_s8_g_23,
				R.drawable.pic_s8_g_24,
				R.drawable.pic_s8_g_25,
				R.drawable.pic_s8_g_26,
				R.drawable.pic_s8_g_27,
				R.drawable.pic_s8_g_28,
				R.drawable.pic_s8_g_29,
				R.drawable.pic_s8_g_30,
				R.drawable.pic_s8_g_31,
				R.drawable.pic_s8_g_32,
				R.drawable.pic_s8_g_33,
				R.drawable.pic_s8_g_34,
				R.drawable.pic_s8_g_35,
				R.drawable.pic_s8_g_36,
				R.drawable.pic_s8_g_37,
				R.drawable.pic_s8_g_38,
				R.drawable.pic_s8_g_39,
			};
		}
		return girl_clothes;
	}
	
	/**
	 * 获取帽子图片数组
	 */
	public int [] getHat(){
		if(hat == null){
			hat = new int[]{
					R.drawable.show_no,
					R.drawable.pic_s9_1,
					R.drawable.pic_s9_2,
					R.drawable.pic_s9_3,
					R.drawable.pic_s9_4,
					R.drawable.pic_s9_5,
					R.drawable.pic_s9_6,
					R.drawable.pic_s9_7,
					R.drawable.pic_s9_8,
					R.drawable.pic_s9_9,
					R.drawable.pic_s9_10,
					R.drawable.pic_s9_11,
					R.drawable.pic_s9_12,
					R.drawable.pic_s9_13,
					R.drawable.pic_s9_14,
					R.drawable.pic_s9_15,
					R.drawable.pic_s9_16,
					R.drawable.pic_s9_17,
					R.drawable.pic_s9_18,
					R.drawable.pic_s9_19,
					R.drawable.pic_s9_20,
					R.drawable.pic_s9_21,
					R.drawable.pic_s9_22,
					R.drawable.pic_s9_23,
					R.drawable.pic_s9_24,
					R.drawable.pic_s9_25,
					R.drawable.pic_s9_26,
					R.drawable.pic_s9_27,
					R.drawable.pic_s9_28,
					R.drawable.pic_s9_29,
					R.drawable.pic_s9_30,
					R.drawable.pic_s9_31,
					R.drawable.pic_s9_32,
					R.drawable.pic_s9_20000,
					R.drawable.pic_s9_20001,
					R.drawable.pic_s9_20002,
					R.drawable.pic_s9_20003,
					R.drawable.pic_s9_20004,
					R.drawable.pic_s9_20005,
					R.drawable.pic_s9_20006,
					R.drawable.pic_s9_20007,
					R.drawable.pic_s9_20008,
					R.drawable.pic_s9_20011,
					R.drawable.pic_s9_20012,
					R.drawable.pic_s9_20013,
					R.drawable.pic_s9_20014,
					R.drawable.pic_s9_20015,
					R.drawable.pic_s9_20016,
					R.drawable.pic_s9_20017,
					R.drawable.pic_s9_20018,
					R.drawable.pic_s9_20019,
					R.drawable.pic_s9_20020,
					R.drawable.pic_s9_20021,
					R.drawable.pic_s9_20022,
					R.drawable.pic_s9_20023,
					R.drawable.pic_s9_20024,
					R.drawable.pic_s9_20025,
					R.drawable.pic_s9_20026,
					R.drawable.pic_s9_20027,
					R.drawable.pic_s9_20028,
					R.drawable.pic_s9_20029,
					R.drawable.pic_s9_20030,
					R.drawable.pic_s9_20031,
					R.drawable.pic_s9_20032,
					R.drawable.pic_s9_20033,
					R.drawable.pic_s9_20034,
					R.drawable.pic_s9_20035,
					R.drawable.pic_s9_20036,
					R.drawable.pic_s9_20037,
					R.drawable.pic_s9_20038,
					R.drawable.pic_s9_20039,
					R.drawable.pic_s9_20040,
					R.drawable.pic_s9_20041,
					R.drawable.pic_s9_20042,
					R.drawable.pic_s9_20043,
					R.drawable.pic_s9_20044,
					R.drawable.pic_s9_20045,
					R.drawable.pic_s9_20046,
					R.drawable.pic_s9_20047,
					R.drawable.pic_s9_20048,
					R.drawable.pic_s9_20049,
					R.drawable.pic_s9_20050,
					R.drawable.pic_s9_20051,
					R.drawable.pic_s9_20052,
					R.drawable.pic_s9_20053,
					R.drawable.pic_s9_20054,
					R.drawable.pic_s9_20055,
					R.drawable.pic_s9_20056
			};
		}
		return hat;
	}
	
	/*
	 * 获取爱好图片数组
	 */
	public int [] getHobby(){
		if(hobby == null){
			hobby = new int[]{
					R.drawable.show_no,
					R.drawable.pic_s10_1,
					R.drawable.pic_s10_2,
					R.drawable.pic_s10_3,
					R.drawable.pic_s10_4,
					R.drawable.pic_s10_5,
					R.drawable.pic_s10_6,
					R.drawable.pic_s10_7,
					R.drawable.pic_s10_8,
					R.drawable.pic_s10_9,
					R.drawable.pic_s10_10,
					R.drawable.pic_s10_11,
					R.drawable.pic_s10_12,
					R.drawable.pic_s10_13,
					R.drawable.pic_s10_14,
					R.drawable.pic_s10_15,
					R.drawable.pic_s10_16,
					R.drawable.pic_s10_17,
					R.drawable.pic_s10_18,
					R.drawable.pic_s10_19,
					R.drawable.pic_s10_20,
					R.drawable.pic_s10_21,
					R.drawable.pic_s10_22,
					R.drawable.pic_s10_23,
					R.drawable.pic_s10_24,
					R.drawable.pic_s10_25,
					R.drawable.pic_s10_26,
					R.drawable.pic_s10_27,
					R.drawable.pic_s10_28,
					R.drawable.pic_s10_29,
					R.drawable.pic_s10_30,
					R.drawable.pic_s10_31,
					R.drawable.pic_s10_32
			};
		}
		return hobby;
	}
	
	/**
	 * 获取背景图片数组
	 */
	public int[] getBackGround(){
		if(background == null){
			background = new int[]{
				R.drawable.pic_s11_1,
				R.drawable.pic_s11_2,
				R.drawable.pic_s11_3,
				R.drawable.pic_s11_4,
				R.drawable.pic_s11_5,
				R.drawable.pic_s11_6,
				R.drawable.pic_s11_7,
				R.drawable.pic_s11_8,
				R.drawable.pic_s11_9,
				R.drawable.pic_s11_10,
				R.drawable.pic_s11_1,
				R.drawable.pic_s11_2,
				R.drawable.pic_s11_3,
				R.drawable.pic_s11_4,
				R.drawable.pic_s11_5,
				R.drawable.pic_s11_6,
				R.drawable.pic_s11_7,
				R.drawable.pic_s11_8,
				R.drawable.pic_s11_9,
				R.drawable.pic_s11_10,
				R.drawable.pic_s11_11,
				R.drawable.pic_s11_12,
				R.drawable.pic_s11_13,
				R.drawable.pic_s11_14,
				R.drawable.pic_s11_15,
				R.drawable.pic_s11_16,
				R.drawable.pic_s11_17,
				R.drawable.pic_s11_18,
				R.drawable.pic_s11_19,
				R.drawable.pic_s11_20,
				R.drawable.pic_s11_21,
				R.drawable.pic_s11_22,
				R.drawable.pic_s11_23,
				R.drawable.pic_s11_24,
				R.drawable.pic_s11_25,
				R.drawable.pic_s11_26,
				R.drawable.pic_s11_27,
				R.drawable.pic_s11_28,
				R.drawable.pic_s11_29,
				R.drawable.pic_s11_30,
				R.drawable.pic_s11_31,
				R.drawable.pic_s11_32,
				R.drawable.pic_s11_33,
				R.drawable.pic_s11_34,
				R.drawable.pic_s11_35,
				R.drawable.pic_s11_36,
				R.drawable.pic_s11_37,
				R.drawable.pic_s11_38,
				R.drawable.pic_s11_39,
				R.drawable.pic_s11_40,
				R.drawable.pic_s11_41,
				R.drawable.pic_s11_42
			};
		}
		return background;
	}
	
	
	/*
	 * 获取气泡图片数组
	 */
	public int [] getPop(){
		if(pop == null){
			pop = new int[]{
				R.drawable.show_no,
				R.drawable.pic_s12_1,
				R.drawable.pic_s12_2,
				R.drawable.pic_s12_3,
				R.drawable.pic_s12_4,
				R.drawable.pic_s12_5,
				R.drawable.pic_s12_6,
				R.drawable.pic_s12_7,
				R.drawable.pic_s12_8,
				R.drawable.pic_s12_9,
				R.drawable.pic_s12_10,
				R.drawable.pic_s12_11,
				R.drawable.pic_s12_12,
				R.drawable.pic_s12_13,
				R.drawable.pic_s12_14,
				R.drawable.pic_s12_15,
				R.drawable.pic_s12_16,
				R.drawable.pic_s12_17,
				R.drawable.pic_s12_18,
				R.drawable.pic_s12_19,
				R.drawable.pic_s12_20,
				R.drawable.pic_s12_21,
				R.drawable.pic_s12_22,
				R.drawable.pic_s12_23,
			};
		}
		return pop;
	}
	/**
	 * 获取默认boy图片数组
	 */
	public int [] getBoyDefault(){
		if(boy_default==null){
			boy_default = new int[]{
					R.drawable.pic_rs1_29, 	//默認髮型
					R.drawable.pic_s2_20006,//默認臉型
					R.drawable.pic_s3_1,   //默認眉毛
					R.drawable.pic_s4_34,	//默認眼睛
					R.drawable.pic_s5_59,	//默認嘴巴
					R.drawable.show_nothing,//默認特征----無
					R.drawable.show_nothing,//默認眼鏡----無
					R.drawable.pic_s8_1,	//默認衣服
					R.drawable.show_nothing,//默認帽子----無
					R.drawable.show_nothing,//默認愛好----無
					R.drawable.pic_s11_26,	//默認背景----藍色
					R.drawable.show_nothing	//默認氣泡 ----無	
			};
		}
		return boy_default;
	}
	/**
	 * 获取默认girl图片数组
	 */
	public int[] getGirlDefault(){
		if(girl_default == null){
			girl_default = new int[]{
					R.drawable.pic_rs1_g_16, 
					R.drawable.pic_s2_20006,
					R.drawable.pic_s3_1,
					R.drawable.pic_s4_34,
					R.drawable.pic_s5_59,
					R.drawable.show_nothing,
					R.drawable.show_nothing,
					R.drawable.pic_s8_1,
					R.drawable.show_nothing,
					R.drawable.show_nothing,
					R.drawable.pic_s11_26,
					R.drawable.show_nothing
			};
			
		}
		return girl_default;
	}
}
