package exhaustiveSearch; // ���� Ž��

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//���� Ž���̶�? '�����ϰ� Ǭ��(brute-force)'�� ��ǻ���� ���� ��� �ɷ��� �̿��� ������ ����� ���� ������ �����ϸ鼭 ���� ã�� ����� �ǹ�. �̷��� ������ ����� ���� ����� ���� �˰���
/*���� ����
�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.

1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...  -> 12345
2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ... -> 21232425
3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ... -> 3311224455

1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.
����� ��
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
����� �� ����
����� �� #1

������ 1�� ��� ������ �������ϴ�.
������ 2�� ��� ������ Ʋ�Ƚ��ϴ�.
������ 3�� ��� ������ Ʋ�Ƚ��ϴ�.
���� ���� ������ ���� ���� ����� ������ 1�Դϴ�.

����� �� #2

��� ����� 2�������� ������ϴ�.*/
public class PracticeTest {// ���ǰ��


	public static void main(String[] args) {
		Random random=new Random();
		int randomAnswer1 = (int)(Math.random() * 5 + 1);
		int randomAnswer2 = (int)(Math.random() * 5 + 1);
		int randomAnswer3 = (int)(Math.random() * 5 + 1);
		int randomAnswer4 = (int)(Math.random() * 5 + 1);
		int randomAnswer5 = (int)(Math.random() * 5 + 1);
		//System.out.println(randomAnswer1+"/"+randomAnswer2);
		
		int q = (int)(Math.random() * 50 +1);
		ArrayList<Integer> answer = new ArrayList<Integer>(5);
		//System.out.println(q);
		for(int i=1;i<q;i++){
			int randomAnswer = (int)(Math.random() * 5 + 1);
			//System.out.println(randomAnswer);
			answer.add(randomAnswer);			
		}
		System.out.println(answer);	//������ ����� �Ϸ�
		
	}
	public int[] solution(int[] answers) {
		int[] answer = {};

		int person1 [] = {1,2,3,4,5};
		int person2 [] = {2,1,2,3,2,4,2,5};
		int person3 [] = {3,3,1,1,2,2,4,4,5,5};



		return answer;
	}


}
