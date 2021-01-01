package step7_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAlphabet {
	public static void main(String[] args) throws IOException {
		//ASCII : a=97 ~Z=122 	�� 26�� 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] arr = new int [26]; //0~25 ���� 26���� �迭 �⺻�� = 0
		for(int i=0;i<26;i++){
				arr[i]=-1;
			}
		String alphabet = br.readLine();
		for(int i=0;i<alphabet.length();i++){
			int asc = (int)alphabet.charAt(i);
			//System.out.println(asc);
			int num = asc-97;
			if(arr[num]==-1){
				arr[num]=i;					
			}
		}
		String message = "";
		for(int i=0;i<26;i++){
			message += arr[i]+" ";
		}
		System.out.println(message);
	}
}
/*����
���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.

���
������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ� ����Ѵ�.

����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�. �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��° ��ġ�̴�.

���� �Է� 1 
baekjoon
���� ��� 1 
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1*/