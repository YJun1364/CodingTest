package level1;

public class ��õ������ {
	public static void main(String[] args) {
		��õ������ year = new ��õ������();
		int a = 5;
		int b = 1;
		year.solution(a, b);
	}
	
	public ��õ������(){

	}   
	
	public String solution(int a, int b) {
		// a : �� 	b : ��		1�� 1�� �� �ݿ��� �϶� a�� b�� ��  ���� �����ϱ�  (SUN,MON,TUE,WED,THU,FRI,SAT)
		String answer = "";

		switch(a){
		case 3: case 11:
			b += 1;
			break;
		case 6:
			b += 2;
			break;
		case 9: case 12:
			b += 3;
			break;
		case 1: case 4: case 7:
			b += 4;
			break;		
		case 10:
			b+= 5;
			break;
		case 5:
			b += 6;
			break;
		}

		int day = b%7;
		System.out.println(day);
		switch(day){
		case 0:
			answer="SUN";
			break;	
		case 1:
			answer ="MON";
			break;
		case 2:
			answer="TUE";
			break;
		case 3:
			answer="WED";
			break;
		case 4:
			answer="THU";
			break;
		case 5:
			answer="FRI";
			break;
		case 6:
			answer="SAT";
			break;
		}
		return answer;
	}
}
/* ��ģ Ǯ��;;
public String solution(int a, int b) {
    String answer = "";

    int[] c = {31,29,31,30,31,30,31,31,30,31,30,31};	//	�� ���� ������ ��
    String[] MM ={"FRI","SAT","SUN","MON","TUE","WED","THU"};	// ���� �迭
    int Adate = 0;
    for(int i = 0 ; i< a-1; i++){  Adate �� a�� ������ ���ڱ��� ��� ��¥�� ������
        Adate += c[i];
    }
    Adate += b-1;	// ��糯¥ ���Ѱ��� ���� ���� ������ ���� (�迭������ -1 ����)
    answer = MM[Adate %7];	// ���������� �̿��� ������ ����

    return answer; // ����ϴ�.
}
*/