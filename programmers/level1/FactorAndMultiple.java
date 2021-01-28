package level1;

import java.util.Arrays;

public class FactorAndMultiple {
	public static void main(String[] args) {
		FactorAndMultiple tmp = new FactorAndMultiple();
		int n=8 ; 
		int m=999999 ;
		tmp.solution(n, m);
	}
	public long[] solution(int n, int m) {
		long[] answer = new long [2];

		if(m%n==0){
			answer[0] = n;
			answer[1] = m;
		}else{
			for(int i = 1; i < m; i++){
				if(n%i==0 && m%i==0){
					answer[0] = i;
				}
			}
			answer[1] = n*m/answer[0];
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}
