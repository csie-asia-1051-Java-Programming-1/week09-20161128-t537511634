package hw;
/*
 * Topic: 霈蝙��撓�銝�甇���嚗��撘���銝���蝥�����府�����甇支�甇���嚗��迤��銝虫�����蝥�嚗�銝������o���
 靘��: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author: 105021029 瘙芸�筒
 */
import java.util.*;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt(),sum=1,flag=0;
		while(flag!=1){
			if(sum>n){
				System.out.println("NO");
				flag++;
			}else if(sum==n){
				System.out.println(sum);
			}
			sum++;
		}
	}

}
