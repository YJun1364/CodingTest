package step5_array;
/*����
�� ���� �ڿ��� A, B, C�� �־��� �� A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ��� A = 150, B = 266, C = 427 �̶�� 
A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.

�Է�
ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ���ų� ũ��, 1,000���� ���� �ڿ����̴�.

���
ù° �ٿ��� A��B��C�� ����� 0 �� �� �� �������� ����Ѵ�. ���������� ��° �ٺ��� �� ��° �ٱ��� A��B��C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.

���� �Է� 1 
150 266 427 

���� ��� 1 
3 1 0 2 0 0 0 2 0 0
 */
import java.util.Scanner;
public class NumberCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		String result = Integer.toString(A*B*C);
		int a0 = 0;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		int a7 = 0;
		int a8 = 0;
		int a9 = 0;

		for(int i=0;i<result.length();i++){
			int num = Character.getNumericValue(result.charAt(i));
			switch(num){
			case 0:a0++;
			break;
			case 1:a1++;
			break;
			case 2:a2++;
			break;
			case 3:a3++;
			break;
			case 4:a4++;
			break;
			case 5:a5++;
			break;
			case 6:a6++;
			break;
			case 7:a7++;
			break;
			case 8:a8++;
			break;
			case 9:a9++;
			break;
			}
		}
		System.out.println(a0+" "+a1+" "+a2+" "+a3+" "+a4+" "+a5+" "+a6+" "+a7+" "+a8+" "+a9);


	}
}
