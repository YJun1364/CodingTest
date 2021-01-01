package step5_array;
/*����
�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. �� ���ڴ� 1,000���� �۰ų� ����, ���� �ƴ� �����̴�.

���
ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.

���� �Է� 1 
1 2 3 4 5 6 7 8 9 10

���� ��� 1 
10
�� ���� 42�� ���� �������� 1, 2, 3, 4, 5, 6, 7, 8, 9, 10�̴�.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<10;i++){
			int N = sc.nextInt();
			int remainder = N % 42;
			if(!(list.contains(remainder))){
			list.add(remainder);
			}
		}
		System.out.println(list.size());
	}
}

