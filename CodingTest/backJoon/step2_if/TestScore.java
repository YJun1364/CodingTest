package step2_if;

import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score>=0&&score<=100){			
			String rank="";
			if(score>=90 && score<=100){
				rank="A";
			}else if(score>=80 && score<=89){
				rank="B";
			}else if(score>=70 && score<=79){
				rank="C";
			}else if(score>=60 && score<=69){
				rank="D";
			}else{
				rank="F";
			}				
			System.out.println(rank);
		}
	}
}
//18372	260