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

		int [] score = new int [3];	// ���� �ٱ��� 
		int count=0;
		
		while(matcher.find()){ // 1,2,3  �� ��Ʈ�� ���� ���ڿ� �и�.
			String str = matcher.group();
			//System.out.println(matcher.group());
			int tmp = Integer.parseInt(str.replaceAll("[^0-9]+", "")); // �ʱ� ����(���ڸ�) ����

			switch(str.replaceAll("[^S|D|T]?", "")){ // bonus �� ���� ó��		
			case "D" : 
				tmp = (int)Math.pow(tmp, 2);
				break;
			case "T" : 
				tmp = (int)Math.pow(tmp, 3);
				break;
			}// switch - bonus
			
			//System.out.println("option: "+str.replaceAll("[^*|#]", ""));
			switch(str.replaceAll("[^*|#]?", "")){ // option �� ���� ó��
			case "*" :
				tmp = tmp*2; // ���� ���� 2��		
				if(count !=0)
					score[count-1] = score[count-1] * 2; // ���� ���� 2��
				
				break;
			case "#" : 
				tmp = -(tmp);
				break;
			}// switch - option
			
			score[count]=tmp;	//�迭�� ���� �Է�		
			count++;
		}// while
		//System.out.println(Arrays.toString(score));
		for(int i=0; i<3 ; i++){ // �� ���� ���ϱ� 
			answer+=score[i];
		}
		//System.out.println(answer);
		return answer;
	}
}
