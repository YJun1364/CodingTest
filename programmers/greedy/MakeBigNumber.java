package greedy;

public class MakeBigNumber {
	public static void main(String[] args) {
		MakeBigNumber mbn = new MakeBigNumber();
		mbn.solution("4177252841", 4);
	}

	public String solution(String number, int k) {
		StringBuffer answer = new StringBuffer(); 
		int index=0;
		char max;
		
		for(int i=0; i < number.length()-k; i++){// �� �ڸ������� k���� ���￹����
			max = '0'; // for���������� max �ʱ�ȭ
			for(int j=index; j<=k+i; j++){//k���� ����� �����ϱ� k+1 ��ŭ �� �ڸ����� ���ؾ���, 
				if(number.charAt(j)>max){
					max = number.charAt(j);	//�ִ� ����
					index = j+1;	//���ϴ� index�� �ִ밪���� ���� �״��� ���������� - ���� ���ڴ� �� ����
				}				
			}
			answer.append(max);	// k+1 ��ŭ�� �ڸ��� �߿� �ִ��� answer�� ������		
		}
		//System.out.println(answer.toString());
		return answer.toString();
	}
}
