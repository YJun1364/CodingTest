package step5_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OverTheAverage {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int C = Integer.parseInt(br.readLine());
		
		for(int i=0;i<C;i++){
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int [] array = new int[N];
			int sum = 0;
			int count = 0;
			for(int j=0;j<N;j++){ // ��ձ��ϱ�
				int score = Integer.parseInt(st.nextToken());
				array[j] = score;
				sum += score;
			}
			double avg = (double)sum/N; // ��� ��
			for(int k=0;k<N;k++){// ����̻� �� ���ϱ�
				if(array[k]>avg)
					count++;				
			}
			double a = (double)count/N*100;
			
			System.out.printf("%.3f", a);
			System.out.println("%");
		}
	}	
}
/*����
���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.

�Է�
ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.

��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. 
������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.

���
�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.

���� �Է� 1 
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91

���� ��� 1 
40.000%
57.143%
33.333%
66.667%
55.556%
 */