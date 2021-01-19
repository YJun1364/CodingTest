package level1;

import java.util.ArrayList;

public class 모의고사 {
	public 모의고사(){

	}
	public ArrayList<Integer> solution(int[] answers) {
		ArrayList<Integer> answer = new ArrayList<>();
	
		int[][] people = new int[][]{{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
		int[] score = new int[3];
		int iterator = 0;
		int count = 0;
		for(int k=0;k<3;k++){ //사람수만큼 반복
				for(int j=0;j<answers.length;j++){//입력받은 정답지 만큼 반복			
					if(iterator==people[k].length) //정답 루틴 초기화
						iterator=0;
					if(people[k][iterator]==answers[j]){//답이 일치하면 카운트 증가 
						count++;
					}	
					iterator++;	
				}//second for
				iterator =0;
				score[k] = count; // 정답 개수 입력			
			count =0;
		}//first for

		int max = -1;
		for(int i=0;i<score.length;i++){ //최댓값 구함
			if(max<score[i])
				max = score[i];
		}
		
		for(int i=0;i<score.length;i++){
			if(max==score[i]){
				answer.add(i+1);
			}
		}
		return answer;
	}
}
