package level1;

public class AddDigit {
	public static void main(String[] args) {
		AddDigit ad = new AddDigit();
		int n=987;
		System.out.println(ad.solution(n));
	}

	public int solution(int n) {
		int answer = 0;
		String str = Integer.toString(n);
		
		for(int i=0;i<str.length();i++){
			int N = Character.getNumericValue(str.charAt(i));
			answer+=N;
		}

		return answer;
	}
}
