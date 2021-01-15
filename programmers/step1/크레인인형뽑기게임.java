package step1;

import java.util.Stack;


public class ũ���������̱���� {
	class Solution {
		public int solution(int[][] board, int[] moves) {
			// board : N*N ���� 5<=N<=30 (*������ ������ 100���� ���� ), moves : �̱����  1<=moves<=1000
			Stack<Integer> stack = new Stack<>();
			stack.push(0);
			int answer = 0;

				for(int move :moves){ //���� ã��
					for(int i=0;i<board.length;i++){
						if(board[i][move]!=0){
							int doll = board[i][move];
							board[i][move] = 0;
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
}
