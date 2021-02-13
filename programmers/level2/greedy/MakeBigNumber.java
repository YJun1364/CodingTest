package greedy;

public class MakeBigNumber {
	public static void main(String[] args) {
		MakeBigNumber mbn = new MakeBigNumber();
		mbn.solution("4177252841", 4);
	}

	public String solution(String number, int k) {
		StringBuffer answer = new StringBuffer(); 
		int index=0;
		char max;
		
		for(int i=0; i < number.length()-k; i++){// 총 자리수에서 k개를 지울예정임
			max = '0'; // for문돌때마다 max 초기화
			for(int j=index; j<=k+i; j++){//k개를 지울수 있으니까 k+1 만큼 의 자리수를 비교해야함, 
				if(number.charAt(j)>max){
					max = number.charAt(j);	//최댓값 추출
					index = j+1;	//비교하는 index는 최대값으로 뽑은 그다음 순서여야함 - 뽑은 숫자는 비교 ㄴㄴ
				}				
			}
			answer.append(max);	// k+1 만큼의 자리수 중에 최댓값을 answer을 더해줌		
		}
		//System.out.println(answer.toString());
		return answer.toString();
	}
}
