package step3_for;

import java.util.Scanner;

//N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		for(int i=1;i<=9;i++){
			System.out.println(number+" * "+i+" = "+number*i);
		}
		
	}
}
//19788	268 