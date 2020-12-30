package step5_array;
/*문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.*/
//버퍼사용

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxAndMin {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int [N];//길이가 N인 int 형 배열 선언
		String numberLine = br.readLine();
		StringTokenizer st = new StringTokenizer(numberLine);
		for(int i=0;i<N;i++){
			arr[i]=Integer.parseInt(st.nextToken()); // 배열안에 값 삽입
		}
		Arrays.sort(arr); // 배열이 낮은수  > 높은수 로 정렬 됨
		//System.out.println(arr[0]); //배열확인				
		System.out.println(arr[0]+" "+arr[N-1]);
	}
}
