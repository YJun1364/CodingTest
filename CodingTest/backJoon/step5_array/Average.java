package step5_array;
/*����
�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. 
�� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. 
�� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.

���
ù° �ٿ� ���ο� ����� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-2 �����̸� �����̴�.

���� �Է� 1 
3
40 80 60

���� ��� 1 
75.0*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Average {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // N<=1000
		String scores = br.readLine(); // 0<=scores<=100 ���� ��� �ϳ��� 0���� ũ��. 
		ArrayList<Double> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(scores+" ");
		for(int i=0;i<N;i++){// �迭�� �� ����
			Double score = Double.parseDouble(st.nextToken());
			list.add(score);
		}
		Collections.sort(list);
		Double max = list.get(N-1);
		//System.out.println(max);
		for(int i=0;i<N;i++){
			Double score= list.get(i)/max*100;
			list.set(i, score);
		}
		Double sum = 0.0;
		for (Double val : list) {
			sum += val;
		}
		Double average = Math.round(sum*100)/100.0/N; // �Ҽ��� �ݿø�
		System.out.println(average);
	}
}
