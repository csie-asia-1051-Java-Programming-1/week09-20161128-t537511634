package ex;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 105021029 汪元浩
 */
import java.util.*;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		ArrayList<Student>studList = new ArrayList<Student>();
		int flag=0;
		while(flag!=1){
			String name=scn.next(),num=scn.next();
			studList.add(new Student("name","num"));
			System.out.println("Continue? Y/N");
			char yn = scn.next().charAt(0);
			if(yn=='n'|| yn=='N'){
				flag++;
			}
		}
		studList.get(1).showInfo();
		studList.get(1).addCourse("程式1","1050807");
		studList.get(1).showInfo();
	}

}
