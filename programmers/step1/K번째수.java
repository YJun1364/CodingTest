package step1;

import java.util.ArrayList;


public class K번째수 {
	public K번째수(){

	}
	public int[] solution(int[] array, int[][] commands) {
		// commands : [i,j,k] 가 여러개 있는 다중배열  array 중에 i~j의 수를 정렬해서 그중 k번째 수 추출 
		int[] answer = new int[commands.length];
		 
		for(int i=0;i<commands.length;i++){
			ArrayList<Integer> list = new ArrayList<>();
			for(int j=commands[i][0]-1;j<commands[i][1];j++){
				list.add(array[j]);
				list.sort(null);
			}
			answer[i]=list.get(commands[i][2]-1);
			//System.out.println(list.toString());
		}
		//System.out.println(Arrays.toString(answer));		
		return answer;
	}
}
//4점짜리 풀이 ㅠㅠㅠ	 Arrays.copyOfRange 메서드와 퀵정렬에 대해 알게 됨
