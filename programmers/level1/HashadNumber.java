package level1;


public class HashadNumber {
	public static void main(String[] args) {
		HashadNumber hn = new HashadNumber();
		int x = 13;
		hn.solution(x);

	}

	public boolean solution(int x) {
		boolean answer = true;
		String X = String.valueOf(x);
		//String[] X = String.valueOf(num).split(""); // split 이 있었네..
		int sum = 0;
		
		for(int i = 0; i < X.length(); i++){
			sum += Character.getNumericValue(X.charAt(i));			
		}
		
		answer = (x%sum==0) ? true : false ;
		
		return answer;
	}
}
