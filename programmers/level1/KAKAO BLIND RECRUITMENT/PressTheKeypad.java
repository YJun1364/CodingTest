package level1;

public class PressTheKeypad {

	public static void main(String[] args) { // Test �뵵
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

		for(int i = 0; i < numbers.length; i++){	// numbers �迭�� String �迭�� �Ű� ����
			press[i] = String.valueOf(numbers[i]);
		}

		for(int i = 0; i < press.length; i++){		// �Լ��� �̿��ؼ� �� �迭�� �ش��ϴ� ��� ���� ���� ��
			String num = press[i];
			if(leftSide.contains(num)){	// ���� = L
				sb.append("L");
				Llocation = num;
			}else if(rightSide.contains(num)){	// ������  = R
				sb.append("R");
				Rlocation = num;
			}else{	// �׿� �� �����Ͽ� ����
				sb.append(leftOrRight(num, hand));	 
			}	
		}

		return sb.toString();
	}

	public String leftOrRight(String press, String hand){	// �޼հ� �������� �Ÿ��� ���Ͽ� �Ÿ��� �� ���� ���� ���� ��
		double left = leftHand(press);	// leftHand �Լ��� �̿��� �Ÿ� ���ϱ� 
		double right = rightHand(press);// rightHand �Լ��� �̿��� �Ÿ����ϱ� 

		if(hand.equals("left")){ //������  ���� - �Ÿ��� �ٿ��� �켱���� �ο� 
			left -=0.5;
		}else{
			right -=0.5;
		}
		Llocation = (left < right) ? press : Llocation;
		Rlocation = (left < right) ? Rlocation : press ;
		String result = (left < right) ? "L" : "R";
		
		return result;
	}

	public int leftHand(String press){	// ���� �Ÿ� ���
		int C = center.indexOf(press);
		int L = (leftSide.contains(Llocation)) ? leftSide.indexOf(Llocation) : center.indexOf(Llocation);
		int leftDistance = (leftSide.contains(Llocation)) ? Math.abs(C-L)+1 : Math.abs(C-L) ; // ���ʿ��� ����� �Ѿ�� ��쿡 +1
		return leftDistance;
	}

	public int rightHand(String press){	// ������ �Ÿ� ���
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

 *	1���� 
 * */
