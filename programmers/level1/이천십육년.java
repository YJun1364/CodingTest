package level1;

public class 이천십육년 {
	public static void main(String[] args) {
		이천십육년 year = new 이천십육년();
		int a = 5;
		int b = 1;
		year.solution(a, b);
	}
	
	public 이천십육년(){

	}   
	
	public String solution(int a, int b) {
		// a : 월 	b : 일		1월 1일 은 금요일 일때 a월 b일 의  요일 리턴하기  (SUN,MON,TUE,WED,THU,FRI,SAT)
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
/* 미친 풀이;;
public String solution(int a, int b) {
    String answer = "";

    int[] c = {31,29,31,30,31,30,31,31,30,31,30,31};	//	각 달의 마지막 일
    String[] MM ={"FRI","SAT","SUN","MON","TUE","WED","THU"};	// 요일 배열
    int Adate = 0;
    for(int i = 0 ; i< a-1; i++){  Adate 에 a달 이전의 일자까지 모든 날짜를 더해줌
        Adate += c[i];
    }
    Adate += b-1;	// 모든날짜 더한값에 현제 달의 날까지 더함 (배열때문에 -1 해줌)
    answer = MM[Adate %7];	// 나머지값을 이용해 요일을 추출

    return answer; // 대단하다.
}
*/