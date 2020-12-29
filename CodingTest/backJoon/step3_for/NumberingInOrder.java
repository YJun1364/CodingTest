package step3_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/*����
�ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.

���
ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.*/
public class NumberingInOrder {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		for(int i=1;i<=N;i++){
			bw.write(i+"\n");
		}
		bw.flush();
		
	}
}
