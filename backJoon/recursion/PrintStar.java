package recursion;

import java.util.Scanner;

public class PrintStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 9;//sc.nextInt();
		printBox(n);
	}

	public static void printBox(int n){

		int column = n;
		int a = n/3;
		for(int row = 1;row <= n; row++){
			printRow(n, row);
		}

	}
	public static void printRow(int n,int row){
		int a = n/3;
		for(int column = 1; column <= n; column++){
			if(row%3==2 && column%3==2 || (column>n-2*a && column<=n-a) && (row>n-2*a && row<=n-a) )
				printSpace();
			else
				printStar();
		}
		System.out.println();
	}

	public static void printStar(){
		System.out.print("*");
	}

	public static void printSpace(){
		System.out.print(" ");
	}

}

