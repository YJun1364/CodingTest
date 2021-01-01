package step7_String;

import java.io.IOException;

public class ASCII {
	public static void main(String[] args) throws IOException {
		int asc = System.in.read();		
		System.out.println(asc);
	}
}
//System.in.read >> scanner 가 생기기전(java5 이전 버전)에서 쓰던 입력방법 아스키코드로 받는다.
/*문제
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

입력
알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

출력
입력으로 주어진 글자의 아스키 코드 값을 출력한다.

예제 입력 1 
A
예제 출력 1 
65
*/