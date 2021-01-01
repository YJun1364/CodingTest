package step5_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Average_ShortCoding {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int [] score = new int [N];
		st = new StringTokenizer(br.readLine());
		int max = 0;
		int sum = 0;
		
		for(int i=0;i<N;i++){
			score[i] = Integer.parseInt(st.nextToken());
			if(score[i]>max){
				max = score[i];
			}
			sum += score[i];
		}
		double average = (double)sum/max*100/N;
		System.out.println(average);
	}
}
