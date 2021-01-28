package level1;

public class NumberCover {
	public static void main(String[] args) {
		NumberCover nc = new NumberCover();
		String phone_number ="01033334444211453";
		//nc.solution(phone_number);
		System.out.println(nc.useRegex(phone_number));
	}
	
	public String useRegex(String phone_number){
		
		return phone_number.replaceAll(".(?=.{4})", "*");
	}
	
	public String solution(String phone_number) {
		for(int i = 0; i < phone_number.length()-4; i++){
			phone_number = phone_number.replaceFirst("[0-9]", "*");
		}
		//System.out.println(phone_number);
		return phone_number;
	}
}
