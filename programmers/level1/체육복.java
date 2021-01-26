package level1;

import java.util.Arrays;

public class 체육복 {
	public static void main(String[] args) {
		체육복 test = new 체육복();
		int n = 5;
		int [] lost = {1,2,4,5};
		int [] reserve = {3,4};
		System.out.println(test.solution(n, lost, reserve));
	}
	
	public  체육복(){

	}
	
	public int solution(int n, int[] lost, int[] reserve) {
		// n : 전체 학생수 	lost : 체육복 잃어버린 사람		reserve : 여분의 체육복 소유자
		int answer = 0;
		int[] N = new int[n]; //학생 배열 생성
		
		for(int lostor : lost){ //체육복없는 사람 => -1 로 변경
			N[lostor-1] = -1;
		}
		
		for(int los : lost){ // 여분이 있는 사람이 체육복을 도둑맞은 경우 여분 없음 처리
			for(int i=0;i<reserve.length;i++){
				if(los == reserve[i]){
					N[los-1]++;
					reserve[i]=0;			
				}
			}
		}
		
		for(int reserver : reserve){ //체육복 빌려주기
			if(reserver <=0) //여분있는 사람이 도둑맞은경우 넘어가기
				continue;
			if(reserver==1){ //처음
				if(N[reserver]==-1)
					N[reserver]++;
			}else if(reserver >= n){ //마지막
				if(N[reserver-2] == -1)
					N[reserver-2]++;
			}else{ //그외
				if(N[reserver-2]==-1){
					N[reserver-2]++;
				}else if(N[reserver]==-1){
					N[reserver]++;
				}
			}
		}
		
		//System.out.println(Arrays.toString(reserver));
		for(int value : N){ // 값 체크
			if(value==0)
				answer++;
		}

		return answer;	//체육 수업을 들을수 있는 최댓값
	}
}
