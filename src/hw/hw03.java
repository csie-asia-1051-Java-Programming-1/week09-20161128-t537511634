package hw;

/*
 * Topic: 設計Student與course 兩個 class，Student Class包含下列資訊:學號、姓名與課程(Course)，Course的class包含 課程名稱、課程代號、課程分數、授謀老師、學分數，並於主程式讓使用者輸入位學生的資料及修課資料，並根據平均成績由高至低輸出這些同學的資料
 * Date: 2016/11/28
 * Author: 105021029 汪元浩
 */
import java.util.*;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		ArrayList<Student>studList= new ArrayList<Student>();
		int flag = 0,flag1 = 0;
		while(flag!=1){
			int id= scn.nextInt();
			String name=scn.next(),cn=scn.next();
			int ci=scn.nextInt(),cs=scn.nextInt();
			String ct=scn.next();
			int num=scn.nextInt();
			studList.add(new Student(name,id));
			while(flag1!=1)
			studList.get()addCourse(name1,id1,cs1,teacher1,sc1)
		}
	}

}
