package level1;

public class 가운데글자가져오기 {
	public static void main(String[] args) {
		가운데글자가져오기 center = new 가운데글자가져오기();
		String s="abcd";
		System.out.println(center.solution(s));
	}

	public 가운데글자가져오기(){

	}

	public String solution(String s) {
		//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.  
		String answer = "";
		int size = s.length();

		int center = size/2;
		//System.out.println(center);
		if(size%2==1){ //홀수
			answer = Character.toString(s.charAt(center));		        	
		}else{
			answer = s.substring(center-1, center+1);
		}
		return answer;

	}
}
/* 객체  + 수식을 이용한 코드 간결화
	public String getMiddle(String str){
    String middle = str.substring((str.length()-1)/2,str.length()/2+1);
        return middle;
	}
  	public String solution(String s) {
      //단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.  
      	Solution getM = new Solution();

      	return getM.getMiddle(s);
 	}
 */