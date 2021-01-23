package study;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;


public class TimeExam{
	/*public static void main(String[] args){
		//지금이 몇월인지를 영어로(예. 1월이면 JANUARY, 2월이면 FEBRUARY) 출력하세요
		LocalDateTime timePoint= LocalDateTime.now();
		Month month = timePoint.getMonth();
		System.out.println(month);


	}*/
	public int findKim(String[] seoul){
		int i=0;
		for(String value:seoul){
			if(value.equals("Kim")){
				i++;
				break;
			}
		}
		return i;
	}

	public String solution(String[] seoul) {
		TimeExam s = new TimeExam();
		String answer = "김서방은 "+s.findKim(seoul)+"에 있다";
		return answer;
	}

}