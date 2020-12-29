package step5_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.StringTokenizer;

/*문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.*/
//버퍼사용
public class MaxAndMin {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<String> arr = new ArrayList();
		String line2 = br.readLine();
		StringTokenizer st = new StringTokenizer(line2);
		for(int i=0;i<N;i++){
			arr.add(st.nextToken());
		}
		//System.out.println(arr); 배열확인				
		String min = "";
		String max = "";
//		System.out.println(arr.getClass());
		for (String tmp : arr) {			
				System.out.println(tmp);
				for(int i=0;i<N;i++){
				if(Integer.parseInt(tmp)<Integer.parseInt(arr.get(i))){
					min = tmp;
				}
				
				}
//				if(Integer.parseInt(tmp)>Integer.parseInt(arr.get(i))){
//					max = tmp;
//				}			
		}
		System.out.println(min+" "+max);
	}
}
