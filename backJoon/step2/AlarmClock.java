package step2;
import java.util.Scanner;

public class AlarmClock {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Q �Է��� �ð����� 45�� �����ð� ����ϱ�	
		int h= sc.nextInt();	//�ð� �Է�
		int m=sc.nextInt();		//�� �Է�
		int timeH=0;
		int timeM=0;
		if(h>=0||h<=23||m>=0||m<=59){
			if(h==0 && m<45){
				h=23;
				m=m+60;
				//System.out.println(timeH+" "+timeM);
			}else if(m<45){
				h=h-1;
				m=m+60;
			}
			timeH=h;
			timeM=m-45;	
			System.out.println(timeH+" "+timeM);	//�ð����
		}			
	}
}
//19912KB	272ms