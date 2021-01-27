package level1;

import java.util.Arrays;
import java.util.StringTokenizer;

public class MakeStrangeString {
	public static void main(String[] args) {
		MakeStrangeString mss = new MakeStrangeString();
		String s = "try hello world  my name is   yongjun";
		mss.solution(s);
	}

	public String solution(String s) {
		StringBuffer answer = new StringBuffer();
		char [] charArr = s.toCharArray();
		System.out.println(Arrays.toString(charArr));

		int count = 0;
		for(int i=0;i<charArr.length;i++){
			if(charArr[i]==32){
				answer.append(" ");
				count = 0;
			}else{
				if(count%2==0){
					answer.append(Character.toUpperCase(charArr[i]));
					count++;
				}else if(count%2==1){
					answer.append(Character.toLowerCase(charArr[i]));
					count++;
				}	
			}

		}// for

		System.out.println(answer);
		return answer.toString();
	}
}
