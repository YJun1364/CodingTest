package step5_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.StringTokenizer;

/*����
N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. 
��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.

���
ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.*/
//���ۻ��
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
		//System.out.println(arr); �迭Ȯ��				
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
