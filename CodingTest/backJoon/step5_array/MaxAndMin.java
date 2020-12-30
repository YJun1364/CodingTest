package step5_array;
/*����
N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. 
��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.

���
ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.*/
//���ۻ��

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
		int [] arr = new int [N];//���̰� N�� int �� �迭 ����
		String numberLine = br.readLine();
		StringTokenizer st = new StringTokenizer(numberLine);
		for(int i=0;i<N;i++){
			arr[i]=Integer.parseInt(st.nextToken()); // �迭�ȿ� �� ����
		}
		Arrays.sort(arr); // �迭�� ������  > ������ �� ���� ��
		//System.out.println(arr[0]); //�迭Ȯ��				
		System.out.println(arr[0]+" "+arr[N-1]);
	}
}
