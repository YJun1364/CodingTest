package step4_while;
/*����
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.

�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)

�Է��� ���������� 0 �� ���� ���´�.

���
�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.*/
import java.util.Scanner;

public class AplusB_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=1;
		int B=1;
		int sum=1;
		while (sum!=0) {		
			A = sc.nextInt();
			B = sc.nextInt();
			sum = A+B;
			if(sum!=0){
				System.out.println(sum);
			}else{
				break;
			}
		}
	}
}
// Ȯ�����ϰ� ���⿡ ������ ������ ������� ������ �����Ͱ���. 