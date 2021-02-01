package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class FailureRate {
	public static void main(String[] args) {
		FailureRate fr = new FailureRate();
		int N =5;
		int [] stages = {4,4,4,4,4,4,4,4};
		fr.solution(N, stages);

	}

	public int[] solution(int N, int[] stages) {
		int[] answer = new int [N]; // N �� ����������
		ArrayList<Double> rate = new ArrayList<>();
		int total = stages.length;       // �� �ο� 

		for(int i=0;i<N;i++){ // �� ������������ �������� ��� �Ͽ� �����Ѵ�.  
			int fail = 0;
			for (int j=0;j<stages.length;j++) {
				fail =(stages[j]==i+1) ? fail+1 : fail;
			}
			if(total!=0){
				rate.add((double)fail/total);
			}else{
				rate.add((double)0);
			}
			//System.out.println(fail+"/"+total);
			total-=fail;

		}// for : ������ ���
		//System.out.println(rate.toString());

		for(int i=0;i<N;i++){
			double max =-1;
			int index =0;
			for(int j =0;j<N;j++){
				if(rate.get(j) > max){
					max = rate.get(j); // ���� ���� ū ������ 
					index = j;	// �ش� �ε��� ����
				}
			}
			answer[i]=index+1; // answer �� ������ ������� �������� ��ȣ ����
			rate.set(index, (double)-1);// ������ ��ȣ�� �迭�� (-1)�� ǥ��
			//System.out.println(rate.toString());
		}
		//System.out.println(Arrays.toString(answer));
		return answer;
	}
}
