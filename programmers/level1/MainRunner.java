package level1;

import java.util.*;

public class MainRunner {
	public static void main(String[] args)	{
		
		/*나누어떨어지는숫자배열 Test*/
		나누어떨어지는숫자배열 div = new 나누어떨어지는숫자배열();
		int [] arr = {5, 9, 7, 10};
		int divisor = 5;
		System.out.println(div.solution(arr, divisor));
		
		/*같은숫자는싫어 Test
		같은숫자는싫어 set = new 같은숫자는싫어();
		int[] arr = new int []{1, 1, 3, 3, 0, 1, 1};
		set.solution(arr);
		*/
		
		
		/*가운데글자가져오기 Test
		가운데글자가져오기 center = new 가운데글자가져오기();
		String s="abcd";
		System.out.println(center.solution(s));
		*/
				
		/*3진법뒤집기
		삼진법뒤집기 sam = new 삼진법뒤집기();
		int n = 125;
		sam.solution(n);
		*/
		
		/* 2016년 Test
		이천십육년 year = new 이천십육년();
		int a = 5;
		int b = 1;
		year.solution(a, b);
		*/
		
		
		/*K번째수 Test
		int [] array =new int []{1, 5, 100, 6, 80, 7, 4};
		int [][] commands = new int [][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		//기댓값 〉	[5, 6, 3]
		K번째수 k = new K번째수();
		k.solution(array, commands);
		*/
		
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
