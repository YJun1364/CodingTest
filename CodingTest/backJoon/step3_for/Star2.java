/*����
ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����

������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.

�Է�
ù° �ٿ� N(1 �� N �� 100)�� �־�����.

���
ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.*/
package step3_for;

import java.util.Scanner;

public class Star2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=1;i<=N;i++){
			for(int j=N-2;j>=i-1;j--){
				System.out.print(" ");
			}for(int l=1;l<=i;l++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

