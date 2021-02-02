package recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 1;
		for(int i=n ; i>0;i--){
			answer = answer*i;
		}
		System.out.println(answer);
	}
}
