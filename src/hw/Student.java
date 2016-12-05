package hw;

import java.util.*;

public class Student {
	int id;
	private String name;
	private ArrayList<Course> couList = new ArrayList<Course>();

	public Student(String name1, int id1) {
		name = name1;
		id = id1;
	}

	public void showInfo() {
		System.out.print(name + "\t");
		System.out.print(id + "\t");
		 System.out.println("#of course: "+couList.size());
		 for (int i =0;i<couList.size();i++){
		 System.out.println("course name:"+couList.get(i).getName());
		 }
		float[] s = new float[4];
		for(int i = 0;i<couList.size();i++){
		s = couList.get(0).getScore();}
		for (int i = 0; i < 4; i++) {
			System.out.print(s[i] + "\t");
		}
		System.out.println();
	}

	public float getavg() {
		float sum=0;
		float css=0;
		for(int i = 0 ;i<couList.size();i++){
			 sum += couList.get(i).getSc();}
		for(int i = 0 ;i<couList.size();i++){
			 css += couList.get(i).getCs();}

		return avg;
	}

	public void addCourse(String name1,String id1,int cs1,String teacher1,int sc1) {
		couList.add(new Course(name1,id1,cs1,teacher1,sc1));
	}

}
