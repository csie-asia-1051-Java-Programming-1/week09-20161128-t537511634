package ex;

public class Score {
private int c1=0,e1=0,m1=0;
public Score(int c,int e,int m){
	c1=c;e1=e;m1=m;
}

public float[] getScore(){
	float str[]={c1,e1,m1,(float)(c1+e1+m1)/(float)3};
	for(int i =0;i<4;i++){
//		return str[i];
	}
	return str;
}

}
