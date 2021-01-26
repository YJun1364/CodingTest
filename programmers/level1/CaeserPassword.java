package level1;

public class CaeserPassword {
	public static void main(String[] args) {
		CaeserPassword cp = new CaeserPassword();
		String s = 	"a B z  e qef qddf d";
		int n = 1;
		cp.solution(s, n);
	}
	public CaeserPassword(){

	}
	public String solution(String s, int n) {
		StringBuffer answer = new StringBuffer();

		for(int i=0;i<s.length();i++){
			int charN  = (int)s.charAt(i); // 대문자 / 소문자 / 공백  구분 해줘야함
			int result;

			if(charN==32){ // 공백 구분
				result = charN;			
			}else{
				result = charN+n;
			}

			if(charN>=65 && charN<=90){// 대문자 구분
				if(result>90)
					result-=26;
			}else if(charN>=97 && charN<=122){// 소문자 구분
				if(result>122)
					result-=26;
			}	

			char resultChar = (char)result;
			answer.append(resultChar);
		}
		System.out.println(answer.toString());
		return answer.toString();
	}
}
