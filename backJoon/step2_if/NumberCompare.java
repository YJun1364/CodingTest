package step2_if;

import java.util.Scanner;

//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
public class NumberCompare {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		String operator="";
		if(A==B){ 
			operator="==";
		}else if(A>B){
			operator=">";
		}else{
			operator="<";
		}
		//operator="==";
		System.out.println(operator);
	}
}
//18256	220