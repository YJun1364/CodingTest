package step1;

import java.util.*;

public class MainRunner {
	public static void main(String[] args)	{
		/*K��°�� Test*/
		int [] array =new int []{1, 5, 100, 6, 80, 7, 4};
		int [][] commands = new int [][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		//��� ��	[5, 6, 3]
		K��°�� k = new K��°��();
		k.solution(array, commands);
		
		
		/*ü���� Test
		ü���� test = new ü����();
		int n = 5;
		int [] lost = {1,2,4,5};
		int [] reserve = {3,4};
		System.out.println(test.solution(n, lost, reserve));
		*/
		
		/*���ǰ�� Test
		���ǰ�� test = new ���ǰ��();
		int [] answers = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		System.out.println(test.solution(answers));
		*/
		/* �ΰ��̾Ƽ����ϱ�  Test
		int [] numbers = new int[]{2, 1, 3, 4, 1};
		�ΰ��̾Ƽ����ϱ� two = new �ΰ��̾Ƽ����ϱ�();
		System.out.println(Arrays.toString(two.solution(numbers)));

		*/
		
		/* ũ���������̱���� Test
		int[][] board = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
		int moves[] = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
		ũ���������̱���� test = new ũ���������̱����();
		System.out.println(test.solution(board, moves));
		return ;
		*/
	}
}
