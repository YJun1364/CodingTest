package step1;

import java.util.ArrayList;


public class 크레인인형뽑기게임 {
	class Solution {
		public int solution(int[][] board, int[] moves) {
			// board : N*N 격자 5<=N<=30 (*인형의 종류는 100가지 이하 ), moves : 뽑기순서  1<=moves<=1000
			int answer = 0;
			ArrayList<Integer> basket = new ArrayList<>();
			//	Collection<String> test = new ArrayList<String>();

			for(int i=0;i<moves.length;i++){
				int dollNumber = 0;
				int lineNumber = moves[i];
				for(int j=0;j<board.length;j++){
					dollNumber = board[j][lineNumber];
					if(dollNumber!=0){
						board[j][lineNumber] = 0; // 격자에서 인형 뽑은거 0으로 표시함
						basket.add(dollNumber);
						break;
					}
				}

				for(int j=basket.size()-1;j>=0;j--){	
					if(basket.size()>2)
					if(basket.get(j)==basket.get(j-1)){
						basket.remove(j);
						basket.remove(j-1);
						answer++;
					}
				}
			}

			return answer;	
		}
	}
}
