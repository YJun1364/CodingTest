package step3_for;
/*
 ����
n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.

���
1���� n���� ���� ����Ѵ�.*/
import java.util.Scanner;

public class Sum {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int result=0;
		for(int i=1;i<=number;i++){
			result +=i;
		}
		System.out.println(result);
	}
}
