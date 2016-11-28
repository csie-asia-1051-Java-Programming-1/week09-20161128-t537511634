package ex;
import java.util.*;

public class Student {
private String id,name;
private ArrayList<Course>couList = new ArrayList<Course>();
private ArrayList<Score>scList = new ArrayList<Score>();
public Student(String name1, String id1){
	name = name1; id = id1;
}
public void showInfo(){
	System.out.print(name+"\t");
	System.out.print(id+"\t");
//	System.out.println("#of course: "+couList.size());
//	for (int i =0;i<couList.size();i++){
//		System.out.println("course name:"+couList.get(i).getName());
//	}
	float str[]=new float[4];
	for (int i =0;i<couList.size();i++){
		str = scList.get(i).getScore();
//	int str[]=scList.get(i).getScore();
}
	for (int i =0;i<couList.size();i++){
		System.out.print(str[i]+"\t");
	}
}
public void addCourse(String name1,String id1){
	couList.add(new Course(name1,id1));
}
public void addScore(int c,int e,int m){
	scList.add(new Score(c,e,m));
}
public void showScore(){
	
}
}
