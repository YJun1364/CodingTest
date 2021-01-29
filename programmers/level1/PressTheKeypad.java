package level1;

public class PressTheKeypad {

	public static void main(String[] args) { // Test 용도
		PressTheKeypad ptk = new PressTheKeypad();
		int [] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		System.out.println(ptk.solution(numbers, hand));
	}

	public String leftSide = "147*";
	public String rightSide = "369#";
	public String center = "2580";
	public String Llocation = "*" ;
	public String Rlocation = "#" ;

	public String solution(int[] numbers, String hand) {
		StringBuffer sb = new StringBuffer();	
		String [] press = new String[numbers.length];

		for(int i = 0; i < numbers.length; i++){	// numbers 배열을 String 배열로 옮겨 담음
			press[i] = String.valueOf(numbers[i]);
		}

		for(int i = 0; i < press.length; i++){		// 함수를 이용해서 각 배열에 해당하는 사용 손을 리턴 함
			String num = press[i];
			if(leftSide.contains(num)){	// 왼편 = L
				sb.append("L");
				Llocation = num;
			}else if(rightSide.contains(num)){	// 오른편  = R
				sb.append("R");
				Rlocation = num;
			}else{	// 그외 는 구분하여 리턴
				sb.append(leftOrRight(num, hand));	 
			}	
		}

		return sb.toString();
	}

	public String leftOrRight(String press, String hand){	// 왼손과 오른손의 거리를 비교하여 거리가 더 작은 쪽을 리턴 함
		double left = leftHand(press);	// leftHand 함수를 이용해 거리 구하기 
		double right = rightHand(press);// rightHand 함수를 이용해 거리구하기 

		if(hand.equals("left")){ //손잡이  구분 - 거리를 줄여서 우선순위 부여 
			left -=0.5;
		}else{
			right -=0.5;
		}
		Llocation = (left < right) ? press : Llocation;
		Rlocation = (left < right) ? Rlocation : press ;
		String result = (left < right) ? "L" : "R";
		
		return result;
	}

	public int leftHand(String press){	// 왼쪽 거리 계산
		int C = center.indexOf(press);
		int L = (leftSide.contains(Llocation)) ? leftSide.indexOf(Llocation) : center.indexOf(Llocation);
		int leftDistance = (leftSide.contains(Llocation)) ? Math.abs(C-L)+1 : Math.abs(C-L) ; // 왼쪽에서 가운데로 넘어올 경우에 +1
		return leftDistance;
	}

	public int rightHand(String press){	// 오른쪽 거리 계산
		int C = center.indexOf(press);
		int R = (rightSide.contains(Rlocation)) ? rightSide.indexOf(Rlocation) : center.indexOf(Rlocation);
		int rightDistance = (rightSide.contains(Rlocation)) ? Math.abs(C-R)+1 : Math.abs(C-R);
		return rightDistance;
	}
}
/*

1	2	3
4	5	6
7	8	9
 *	0	#

 *	1부터 
 * */
