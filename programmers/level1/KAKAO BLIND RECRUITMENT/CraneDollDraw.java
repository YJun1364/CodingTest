package level1;

import java.util.Stack;

public class CraneDollDraw {
	public static void main(String[] args) {
		int[][] board = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
		int moves[] = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
		CraneDollDraw test = new CraneDollDraw();
		System.out.println(test.solution(board, moves));
	}
 
	public int solution(int[][] board, int[] moves) {
		// board : N*N 격자 5<=N<=30 (*인형의 종류는 100가지 이하 ), moves : 뽑기순서  1<=moves<=1000
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		int answer = 0;

		for(int move :moves){ //인형 찾기
			for(int i=0;i<board.length;i++){
				if(board[i][move-1]!=0){
					int doll = board[i][move-1];
					board[i][move-1] = 0;
					if(stack.peek()!=0 && stack.peek()==doll){
						stack.pop();
						answer+=2;
					}else{
						stack.push(doll);
					}
					break;
				}
			}
		}
		return answer;	
	}
}

