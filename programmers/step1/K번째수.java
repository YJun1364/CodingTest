package step1;

import java.util.ArrayList;


public class K��°�� {
	public K��°��(){

	}
	public int[] solution(int[] array, int[][] commands) {
		// commands : [i,j,k] �� ������ �ִ� ���߹迭  array �߿� i~j�� ���� �����ؼ� ���� k��° �� ���� 
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
//4��¥�� Ǯ�� �ФФ�	 Arrays.copyOfRange �޼���� �����Ŀ� ���� �˰� ��
