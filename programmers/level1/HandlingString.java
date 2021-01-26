package level1;

public class HandlingString {
	public static void main(String[] args) {
		HandlingString hs = new HandlingString();
		String s = "1+23ASDFQWefasdfqwer";
		hs.solution(s);
	}
	public HandlingString(){

	}
	
	public boolean solution(String s) {
		boolean answer = true;
		s.toLowerCase();

		if(s.length()!=4 &&s.length()!=6)
			answer=false;
		if(s.charAt(0)=='+' || s.charAt(0)== '-' ){
			answer=false;
		}
		try{
		Integer.parseInt(s);
		}catch(Exception e){
			answer=false;
		}
	
		return answer;
	}
}
