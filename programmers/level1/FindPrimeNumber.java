package level1;

public class FindPrimeNumber {
	public static void main(String[] args) {
		FindPrimeNumber fpn = new FindPrimeNumber();
		int n=10;
		System.out.println(fpn.solution(n));
	}
	public FindPrimeNumber() {
		// TODO Auto-generated constructor stub
	}
	public int solution(int n) {
		int answer = 0;
		boolean[] arr = new boolean[n+1];	//default ���� false 
		arr[0]=arr[1]=true; //true = �Ҽ����� ����

		for(int i=2; i*i<=n; i++) {// ���� for ������ ����� �����ϴϱ� i*i �� n���� ������ ���� 
			if(!arr[i])
				for(int j=i*i; j<=n; j+=i){//�ڱ��ڽ��� ��� ���� ����
					arr[j] = true;//�Ҽ��� �ƴѼ�  ture
				}
		}
		
		for(int i=2;i<n+1;i++){
			if(!arr[i]){
				//System.out.println(i);
				answer++;
			}
		}
		return answer;
	}

}
