package level1;

public class GuessTheColatz {
	public static void main(String[] args) {
		GuessTheColatz gc = new GuessTheColatz();
		int num = 16;
		System.out.println(gc.solution(num));
	}

	/*1-1. �Էµ� ���� ¦����� 2�� �����ϴ�. 
	1-2. �Էµ� ���� Ȧ����� 3�� ���ϰ� 1�� ���մϴ�.
	2. ����� ���� ���� ���� �۾��� 1�� �� ������ �ݺ��մϴ�.*/

	public int solution(int num) {
		long answer = num;
		
		for(int i = 0; i <= 500; i++){
			if(answer==1){
				System.out.println("answer = "+i);
				return i;		
			}
			answer = (answer%2==0) ? answer/2 : answer*3+1 ;
			System.out.println(answer + " " + i);

		}

		return -1;
	}

}
