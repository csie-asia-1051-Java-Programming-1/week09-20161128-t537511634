﻿package ex;
/*
 * Topic: 請設計一樂透亂數選號程式，由 1~42 中選出 6個不重覆的數字組合並輸出。 請使用已下方式,(setSeed就是設定亂數種子，可以使每次跑出的亂數序列，都會是一樣的)
 例如:輸入 23323456會得到 39  17  32  13  41  15 
	Random randnum = new Random();
	randnum.setSeed(23323456)
 * Date: 2016/11/28
 * Author: 105021029 汪元浩
 */
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		Random randnum = new Random();
//		randnum.setSeed(23323456);
		int n[]=new int[6];
		for(int i=0;i<6;i++){
			n[i]=randnum.nextInt(42)+1;
			for(int j =0;j<i;j++){
				if(n[j]==n[i]){
					i--;
				}
			}
		}for(int i=0;i<6;i++){
		System.out.print(n[i]+"\t");
	}
		System.out.println();
	}
}
