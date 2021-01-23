package study;
import java.util.*;

public class CalendarExam{
    public String hundredDaysAfter(){
        //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
        Calendar cal =	Calendar.getInstance(); //현재 날짜 생성
        cal.add(Calendar.DATE, 100); // 현재 날짜에 100일을 더함
        StringBuffer sb = new StringBuffer();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DATE);
        sb.append(year).append("년").append(month).append("월").append(day).append("일");
        return sb.toString();
    }
    public static void main(String[] args){
    	CalendarExam hd = new CalendarExam();
    	String cal = hd.hundredDaysAfter();
    	System.out.println(cal);
    }
}