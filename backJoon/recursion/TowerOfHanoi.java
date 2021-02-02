package recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		start(n);
		
	}
	public static void start(int n){
		int from = 1;
		int to = 3;
		int other = 2;
		hanoi(n, from, to, other);
	}
	public static void hanoi(int num, int from, int to, int other){
		System.out.println(from+" "+to);
		if(num==0){
			return;
		}
		hanoi(num-1,from,other,to);
		hanoi(num-1,other,to,from);
		
	}
}
