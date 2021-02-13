package greedy;

public class MakeBigNumber2 {
	public static void main(String[] args) {
		MakeBigNumber2 mbn = new MakeBigNumber2();
		mbn.solution("4725772841", 4);
	}
	public String solution(String number, int k) {
		int idx = 0;
		char max;
		StringBuilder answer = new StringBuilder();

		if(number.charAt(0) == '0') return "0";
		for(int i = 0; i < number.length() - k; i++) { // i = »Ì¾Æ¾ßÇÒ ÀÚ¸´¼ö
			max = '0';
			System.out.println(i+"¹øÂ°-----------");
			for(int j = idx; j <= k + i; j++) {
				System.out.println("max: "+max);
				System.out.println("!: "+j+" ~ "+(k+i)+"\t"+i);
				if(max < number.charAt(j)) {
					max = number.charAt(j);
					idx = j + 1;
					System.out.println("!: "+j+" ~ "+(k+i));
				}
				System.out.println("?");
				
			}    
			System.out.println("for1: "+max);
			answer.append(max);
			
		}
		System.out.println(answer.toString());
		return answer.toString();
	}

}
