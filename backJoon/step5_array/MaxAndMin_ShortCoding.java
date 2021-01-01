package step5_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxAndMin_ShortCoding {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine()); // ���� �ѹ� �ޱ� ����� ����
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");
		//2��° �Է� ���ο� �Էµ� ���� st��ٿ� �����
		
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
