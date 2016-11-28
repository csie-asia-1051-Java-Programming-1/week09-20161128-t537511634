package ex;

/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021029 汪元浩
 */
import java.util.*;

public class ex03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(), flag = 0, v = 1, c = 0;
		ArrayList<Integer> aa = new ArrayList<Integer>();
		while (flag != 1) {
			if (n % v == 0) {
				System.out.print(v + "\t");
				aa.add(v);
			}
			if (v == n) {
				flag++;
			}
			v++;
		}
		System.out.println();
		if (aa.size()==2) {
			System.out.println("It's a prime number");
		} else {
			System.out.println("It's not a prime number");
		}
		// TODO Auto-generated method stub

	}

}
