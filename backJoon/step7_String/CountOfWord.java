package step7_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountOfWord {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String stringLine = br.readLine();
		st = new StringTokenizer(stringLine);
		int count = 0;
		while(st.hasMoreTokens()){
			count++;
			String nextToken = st.nextToken();
		}
		System.out.println(count);
	}
}
/*
 * ����
���� ��ҹ��ڿ� ���⸸���� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.

�Է�
ù �ٿ� ���� ��ҹ��ڿ� ����� �̷���� ���ڿ��� �־�����. �� ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�. �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����. ���� ���ڿ��� �հ� �ڿ��� ������ ���� ���� �ִ�.

���
ù° �ٿ� �ܾ��� ������ ����Ѵ�.

���� �Է� 1 
The Curious Case of Benjamin Button
���� ��� 1 
6
*/
