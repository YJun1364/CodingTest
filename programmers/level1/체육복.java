package level1;

import java.util.Arrays;

public class ü���� {
	public static void main(String[] args) {
		ü���� test = new ü����();
		int n = 5;
		int [] lost = {1,2,4,5};
		int [] reserve = {3,4};
		System.out.println(test.solution(n, lost, reserve));
	}
	
	public  ü����(){

	}
	
	public int solution(int n, int[] lost, int[] reserve) {
		// n : ��ü �л��� 	lost : ü���� �Ҿ���� ���		reserve : ������ ü���� ������
		int answer = 0;
		int[] N = new int[n]; //�л� �迭 ����
		
		for(int lostor : lost){ //ü�������� ��� => -1 �� ����
			N[lostor-1] = -1;
		}
		
		for(int los : lost){ // ������ �ִ� ����� ü������ ���ϸ��� ��� ���� ���� ó��
			for(int i=0;i<reserve.length;i++){
				if(los == reserve[i]){
					N[los-1]++;
					reserve[i]=0;			
				}
			}
		}
		
		for(int reserver : reserve){ //ü���� �����ֱ�
			if(reserver <=0) //�����ִ� ����� ���ϸ������ �Ѿ��
				continue;
			if(reserver==1){ //ó��
				if(N[reserver]==-1)
					N[reserver]++;
			}else if(reserver >= n){ //������
				if(N[reserver-2] == -1)
					N[reserver-2]++;
			}else{ //�׿�
				if(N[reserver-2]==-1){
					N[reserver-2]++;
				}else if(N[reserver]==-1){
					N[reserver]++;
				}
			}
		}
		
		//System.out.println(Arrays.toString(reserver));
		for(int value : N){ // �� üũ
			if(value==0)
				answer++;
		}

		return answer;	//ü�� ������ ������ �ִ� �ִ�
	}
}
