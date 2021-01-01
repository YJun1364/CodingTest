package step5_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxAndMin_ShortCoding {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine()); // 정수 한번 받기 사용은 안함
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");
		//2번째 입력 라인에 입력된 값을 st토근에 담아줌
		
		int max = -1000000;
		int min = 1000000;
		while(st.hasMoreTokens()){
			int tokenVal = Integer.parseInt(st.nextToken());
			if(tokenVal > max){
				max = tokenVal;
			}
			if(tokenVal < min){
				min =tokenVal;
			}
		}
		System.out.println(min+" "+max);
	}
}
