package step1;

import java.util.*;

public class MainRunner {
	public static void main(String[] args)	{
		/*K번째수 Test*/
		int [] array =new int []{1, 5, 100, 6, 80, 7, 4};
		int [][] commands = new int [][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		//기댓값 〉	[5, 6, 3]
		K번째수 k = new K번째수();
		k.solution(array, commands);
		
		
		/*체육복 Test
		체육복 test = new 체육복();
		int n = 5;
		int [] lost = {1,2,4,5};
		int [] reserve = {3,4};
		System.out.println(test.solution(n, lost, reserve));
		*/
		
		/*모의고사 Test
		모의고사 test = new 모의고사();
		int [] answers = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		System.out.println(test.solution(answers));
		*/
		/* 두개뽑아서더하기  Test
		int [] numbers = new int[]{2, 1, 3, 4, 1};
		두개뽑아서더하기 two = new 두개뽑아서더하기();
		System.out.println(Arrays.toString(two.solution(numbers)));

		*/
		
		/* 크레인인형뽑기게임 Test
		int[][] board = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
		int moves[] = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
		크레인인형뽑기게임 test = new 크레인인형뽑기게임();
		System.out.println(test.solution(board, moves));
		return ;
		*/
	}
}
