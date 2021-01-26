package level1;

public class SumOfFactors {
	public static void main(String[] args) {
		SumOfFactors sof = new SumOfFactors();
		int n = 5;
		System.out.println(sof.solution(n));
	}

	public int solution(int n) {
		int answer = 0;
		for(int i=1;i<=n;i++){
			if(n%i==0)
				answer+=i;
		}		
		return answer;
	}
}
