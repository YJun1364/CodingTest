package level1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Darts {
	public static void main(String[] args) {
		Darts d = new Darts();
		String dartResult = "1S*2T*3S";
		d.solution(dartResult);
	}

	public int solution(String dartResult) {
		int answer = 0;
		Pattern p = Pattern.compile("[0-9]+[S|D|T][*|#]?");
		Matcher matcher = p.matcher(dartResult);

		int [] score = new int [3];	// 점수 바구니 
		int count=0;
		
		while(matcher.find()){ // 1,2,3  각 다트에 대한 문자열 분리.
			String str = matcher.group();
			//System.out.println(matcher.group());
			int tmp = Integer.parseInt(str.replaceAll("[^0-9]+", "")); // 초기 점수(숫자만) 추출

			switch(str.replaceAll("[^S|D|T]?", "")){ // bonus 에 대한 처리		
			case "D" : 
				tmp = (int)Math.pow(tmp, 2);
				break;
			case "T" : 
				tmp = (int)Math.pow(tmp, 3);
				break;
			}// switch - bonus
			
			//System.out.println("option: "+str.replaceAll("[^*|#]", ""));
			switch(str.replaceAll("[^*|#]?", "")){ // option 에 대한 처리
			case "*" :
				tmp = tmp*2; // 현재 점수 2배		
				if(count !=0)
					score[count-1] = score[count-1] * 2; // 앞의 점수 2배
				
				break;
			case "#" : 
				tmp = -(tmp);
				break;
			}// switch - option
			
			score[count]=tmp;	//배열에 점수 입력		
			count++;
		}// while
		//System.out.println(Arrays.toString(score));
		for(int i=0; i<3 ; i++){ // 총 점수 구하기 
			answer+=score[i];
		}
		//System.out.println(answer);
		return answer;
	}
}
