package level1;

public class FindPrimeNumber {
	public static void main(String[] args) {
		FindPrimeNumber fpn = new FindPrimeNumber();
		int n=10;
		System.out.println(fpn.solution(n));
	}
	public FindPrimeNumber() {
		// TODO Auto-generated constructor stub
	}
	public int solution(int n) {
		int answer = 0;
		boolean[] arr = new boolean[n+1];	//default 값은 false 
		arr[0]=arr[1]=true; //true = 소수에서 제외

		for(int i=2; i*i<=n; i++) {// 다음 for 문에서 배수를 제거하니깐 i*i 가 n보다 작으면 ㅇㅋ 
			if(!arr[i])
				for(int j=i*i; j<=n; j+=i){//자기자신의 배수 에서 시작
					arr[j] = true;//소수가 아닌수  ture
				}
		}
		
		for(int i=2;i<n+1;i++){
			if(!arr[i]){
				//System.out.println(i);
				answer++;
			}
		}
		return answer;
	}

}
