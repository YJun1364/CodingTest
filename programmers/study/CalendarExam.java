package study;
import java.util.*;

public class CalendarExam{
    public String hundredDaysAfter(){
        //���ú��� 100�� ���� ��¥�� "2016��1��1��"�� �������� return�ϼ���.
        Calendar cal =	Calendar.getInstance(); //���� ��¥ ����
        cal.add(Calendar.DATE, 100); // ���� ��¥�� 100���� ����
        StringBuffer sb = new StringBuffer();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DATE);
        sb.append(year).append("��").append(month).append("��").append(day).append("��");
        return sb.toString();
    }
    public static void main(String[] args){
    	CalendarExam hd = new CalendarExam();
    	String cal = hd.hundredDaysAfter();
    	System.out.println(cal);
    }
}