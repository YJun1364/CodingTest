package level1;

public class GuessTheColatz {
	public static void main(String[] args) {
		GuessTheColatz gc = new GuessTheColatz();
		int num = 16;
		System.out.println(gc.solution(num));
	}

	/*1-1. 입력된 수가 짝수라면 2로 나눕니다. 
	1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
	2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.*/

	public int solution(int num) {
		long answer = num;
		
		for(int i = 0; i <= 500; i++){
			if(answer==1){
				System.out.println("answer = "+i);
				return i;		
			}
			answer = (answer%2==0) ? answer/2 : answer*3+1 ;
			System.out.println(answer + " " + i);

		}

		return -1;
	}

}
