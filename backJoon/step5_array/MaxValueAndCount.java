package step5_array;

import java.util.Scanner;

/*����
9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ���, ���� �ٸ� 9���� �ڿ��� 3, 29, 38, 12, 57, 74, 40, 85, 61
�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.

�Է�
ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.-enter

���
ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.

���� �Է� 1 
3 29 38 12 57 74 40 85 61

���� ��� 1 
85 8
 */
public class MaxValueAndCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int count = 0;
		int resultCount = 0;
		
		for(int i=0;i<9;i++){
			count++;
			int val = sc.nextInt();
			if(val>max){
				max = val;
				resultCount = count;
			}			
		}
		System.out.println(max+" "+resultCount);
	}
}
