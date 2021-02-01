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
		int[] answer = new int [N]; // N 은 스테이지수
		ArrayList<Double> rate = new ArrayList<>();
		int total = stages.length;       // 총 인원 

		for(int i=0;i<N;i++){ // 각 스테이지별로 실패율을 계산 하여 정렬한다.  
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

		}// for : 실패율 계산
		//System.out.println(rate.toString());

		for(int i=0;i<N;i++){
			double max =-1;
			int index =0;
			for(int j =0;j<N;j++){
				if(rate.get(j) > max){
					max = rate.get(j); // 현재 가장 큰 실패율 
					index = j;	// 해당 인덱스 추출
				}
			}
			answer[i]=index+1; // answer 에 실패율 가장높은 스테이지 번호 삽입
			rate.set(index, (double)-1);// 삽입한 번호의 배열을 (-1)로 표시
			//System.out.println(rate.toString());
		}
		//System.out.println(Arrays.toString(answer));
		return answer;
	}
}
