package hw;
/*
 * Topic: 輸入一個正整數 N，列舉如下數列，直到數字超過 N 為止。
數列一:1 2 4 7 11 16 22 29…
數列二:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 105021029 汪元浩
 */
import java.util.*;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt(),sum=1,sum1=1,i=0,c=0,r=1,flag=0;;
		while(sum<=n){
			sum+=i;
			System.out.print(sum+"\t");
			i++;
		}
		System.out.println();
		while(flag!=1){
			for(int i1 = 0;i1<r;i1++){
				System.out.print(sum1+"\t");
				c++;
				if(c>n){
					flag++;
					break;
				}
			}
			sum1++;
			r++;
		}

	}

}
