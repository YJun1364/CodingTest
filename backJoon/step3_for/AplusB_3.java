package step3_for;
/*
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.

�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
*/
import java.util.Scanner;

public class AplusB_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
			int A=sc.nextInt();
			int B=sc.nextInt();
//			int A=(int)(Math.random()*9+1);
//			int B=(int)(Math.random()*9+1);
			System.out.println(A+B);
		}
	}
}
//18500	284
