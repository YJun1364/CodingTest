package step4_while;
/*����
0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. ���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, 
�� �ڸ��� ���ڸ� ���Ѵ�. �� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�. ���� ���� ����.

26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. ���ο� ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.

���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.

N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� N�� �־�����. N�� 0���� ũ�ų� ����, 99���� �۰ų� ���� �����̴�.

���
ù° �ٿ� N�� ����Ŭ ���̸� ����Ѵ�.*/

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
/* ����ȯ�� ���� �˰Ե� 
 integer > String 	: Integer.toString()
 char 	 > integer 	: Character.getNumericValue() - �ƽ�Ű�ڵ� ������ ����ϴ� �˰Ե� �Ф�
 char 	 > String	: char+char
 String  > integer 	: Integer.parseInt()
 String  > char 	: String.charAt() 

IntN % 10 = B ;;��� ����� �ٸ���� �ڵ带 ���� �˰Ե� */


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
			//int sum = Character.toString(A)+Character.toString(B)""; 	// ����
			//System.out.println(sum.length()-1); 	// ���ڿ� sum�� ����Ȯ��
			//System.out.println("A:"+A+" B:"+B+" sum:"+sum);	// �� Ȯ��

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

