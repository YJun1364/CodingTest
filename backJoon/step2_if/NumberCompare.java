package step2_if;

import java.util.Scanner;

//�� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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