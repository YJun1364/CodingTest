package step8_BasicMath;

import java.util.Scanner;

public class HoneyComb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int room = 1;
		if(N==1){
			System.out.println("1");
			return;
		}else{
			N = N-1;
		}
		
		int i=1;
		while(N>0){
			room = 6*i;
			N = N-room;
			
			i++;							
		}
		System.out.println(i);	
	}
}
/*����
���� �׸��� ���� ���������� �̷���� ������ �ִ�. �׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. ���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ���, 13������ 3��, 58������ 5���� ������.

�Է�
ù° �ٿ� N(1 �� N �� 1,000,000,000)�� �־�����.

���
�Է����� �־��� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� �������� ����Ѵ�.

���� �Է� 1 
13
���� ��� 1 
3
��ó*/