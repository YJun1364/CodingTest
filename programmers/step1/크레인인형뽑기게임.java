package step1;

import java.util.ArrayList;


public class ũ���������̱���� {
	class Solution {
		public int solution(int[][] board, int[] moves) {
			// board : N*N ���� 5<=N<=30 (*������ ������ 100���� ���� ), moves : �̱����  1<=moves<=1000
			int answer = 0;
			ArrayList<Integer> basket = new ArrayList<>();
			//	Collection<String> test = new ArrayList<String>();

			for(int i=0;i<moves.length;i++){
				int dollNumber = 0;
				int lineNumber = moves[i];
				for(int j=0;j<board.length;j++){
					dollNumber = board[j][lineNumber];
					if(dollNumber!=0){
						board[j][lineNumber] = 0; // ���ڿ��� ���� ������ 0���� ǥ����
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
