package step7_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int N = Integer.parseInt(br.readLine());	
		int sum = 0;
		String number = br.readLine();
		for(int i=0;i<N;i++){
			int num = Character.getNumericValue(number.charAt(i));
			sum += num;
		}
		System.out.println(sum);
	}
}
//scanner 는 왜 오류가날까?

/*
문제

N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

출력
입력으로 주어진 숫자 N개의 합을 출력한다.
*/