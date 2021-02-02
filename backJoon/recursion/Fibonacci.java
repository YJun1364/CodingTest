package recursion;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(fibo(n));
	}
	
	public static int fibo(int n){
		return n = (n <= 1) ? n : fibo(n-1)+fibo(n-2) ;
	}
}
/*int a = 0;4\
int b = 1;
int c =0;
for(int i =1;i<n;i++){
	c = a+b;
	a=b;
	b=c;
}
c=(n==0)? 0 : c;
c=(n==1)? 1 : c;		*/
