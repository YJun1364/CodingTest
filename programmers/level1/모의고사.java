package level1;

import java.util.ArrayList;

public class ���ǰ�� {
	public ���ǰ��(){

	}
	public ArrayList<Integer> solution(int[] answers) {
		ArrayList<Integer> answer = new ArrayList<>();
	
		int[][] people = new int[][]{{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
		int[] score = new int[3];
		int iterator = 0;
		int count = 0;
		for(int k=0;k<3;k++){ //�������ŭ �ݺ�
				for(int j=0;j<answers.length;j++){//�Է¹��� ������ ��ŭ �ݺ�			
					if(iterator==people[k].length) //���� ��ƾ �ʱ�ȭ
						iterator=0;
					if(people[k][iterator]==answers[j]){//���� ��ġ�ϸ� ī��Ʈ ���� 
						count++;
					}	
					iterator++;	
				}//second for
				iterator =0;
				score[k] = count; // ���� ���� �Է�			
			count =0;
		}//first for

		int max = -1;
		for(int i=0;i<score.length;i++){ //�ִ� ����
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
