package study;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;


public class TimeExam{
	/*public static void main(String[] args){
		//������ ��������� �����(��. 1���̸� JANUARY, 2���̸� FEBRUARY) ����ϼ���
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
		String answer = "�輭���� "+s.findKim(seoul)+"�� �ִ�";
		return answer;
	}

}