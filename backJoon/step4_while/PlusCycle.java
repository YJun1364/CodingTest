package step4_while;
/*문제
0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 
각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.

26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.

위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.

N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.

출력
첫째 줄에 N의 사이클 길이를 출력한다.*/

import java.util.Scanner;
public class PlusCycle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int IntN = sc.nextInt(); // 0 =< N <=99
		String N = "";
		int cycle = 0;

		if(IntN==0){
			cycle++;
			System.out.println(cycle);
			return;
		}else if(IntN<10){
			IntN = IntN*10;
		}
		N=Integer.toString(IntN);
		boolean trigger=true;

		while(trigger){

			int A = Character.getNumericValue(N.charAt(0));
			int B = Character.getNumericValue(N.charAt(1));
			String sum = Integer.toString(A+B);
			N = Integer.toString(B)+sum.charAt(sum.length()-1);
			A = Character.getNumericValue(N.charAt(0));
			B = Character.getNumericValue(N.charAt(1));
			cycle++;

			if(Integer.parseInt(N)==IntN){
				System.out.println(cycle);
				break;
			}
		}		
	}
}
/* 형변환에 대해 알게됨 
 integer > String 	: Integer.toString()
 char 	 > integer 	: Character.getNumericValue() - 아스키코드 때문에 고생하다 알게됨 ㅠㅠ
 char 	 > String	: char+char
 String  > integer 	: Integer.parseInt()
 String  > char 	: String.charAt() 

IntN % 10 = B ;;라는 사실을 다른사람 코드를 보고 알게됨 */


/*public class PlusCycle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int IntN = sc.nextInt(); // 0 =< N <=99
		String N = null;

		if(IntN<10){
			IntN = IntN*10;
			N=Integer.toString(IntN);
			//System.out.println(IntN);
		}else{
			N=Integer.toString(IntN);
			//System.out.println(IntN);			
		}

		//System.out.println("N:"+N);
		boolean trigger=true;
		int cycle = 0;
		while(trigger){
			//System.out.println(N.charAt(0)+"/"+N.charAt(1));
			int A = Character.getNumericValue(N.charAt(0));
			int B = Character.getNumericValue(N.charAt(1));
			String sum = Integer.toString(A+B);
			//int sum = Character.toString(A)+Character.toString(B)""; 	// 실패
			//System.out.println(sum.length()-1); 	// 문자열 sum의 길이확인
			//System.out.println("A:"+A+" B:"+B+" sum:"+sum);	// 값 확인

			N = Integer.toString(B)+sum.charAt(sum.length()-1);
//			System.out.println("B:"+Character.toString(B)+" sum:"+sum.charAt(sum.length()-1));
			//System.out.println("N:"+N);
			A = Character.getNumericValue(N.charAt(0));
			B = Character.getNumericValue(N.charAt(1));
			cycle+=1;
			//System.out.println("A:"+A+" B:"+B+" cycle:"+cycle);	

			if(Integer.parseInt(N)==IntN){
				System.out.println(cycle);
				break;
			}

		}		
	}
}*/

