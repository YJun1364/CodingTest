package level1;

import java.util.ArrayList;

public class NaturalNumberFlip {
	public static void main(String[] args) {
		NaturalNumberFlip nnf= new NaturalNumberFlip();
		long n=1009876545;
		System.out.println(nnf.solution(n));
	}

	public ArrayList<Integer> solution(long n) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		while(n>0){
			int N = (int)(n%10);
			answer.add(N);
			n=n/10;
		}
		return answer;
	}
}
