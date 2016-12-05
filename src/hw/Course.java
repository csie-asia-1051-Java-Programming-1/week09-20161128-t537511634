package hw;
import java.util.*;

public class Course {
private String couName,couId,teacher,id,name;
private int cs,sc;
public Course(String name1,String id1,int cs1,String teacher1,int sc1){
	name=name1;id=id1;cs=cs1;teacher = teacher1;sc=sc1;
}
public String getName(){
	return name;
}
public String getId(){
	return id;
}
public String getTeacher(){
	return teacher;
}
public int getSc(){
	return sc;
}
public int getCs(){
	return cs;
}

}
