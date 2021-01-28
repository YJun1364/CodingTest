package level1;

public class IntegerSquareRoot {
	public static void main(String[] args) {
		IntegerSquareRoot isr = new IntegerSquareRoot();
		long n = 121;
		isr.solution(n);
	}

	public long solution(long n) {
		long answer = 0;
		double squareRoot = Math.sqrt(n);
		//System.out.println(squareRoot);
		answer = (squareRoot%1==0) ? answer=(long)Math.pow(squareRoot+1, 2) : -1 ;
		//System.out.println(answer);
		return answer;
	}
}
