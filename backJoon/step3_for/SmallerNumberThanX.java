package step3_for;
/*����
���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)

��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.

���
X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SmallerNumberThanX {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line1 = br.readLine();
		StringTokenizer st = new StringTokenizer(line1);
		int N = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());

		String line2 = br.readLine(); // N�� �°� �ڿ��� �� �Է�����
		String array[] = line2.split(" "); // split �Լ��� �����͸� �̾� �迭�� �־��ش�.
		for(int i=0;i<N;i++){
			if(Integer.parseInt(array[i])<A){
			//bw.write(array[i]+" "); // �� �ȳ��ñ�..?
			System.out.print(array[i]+" "); // write ��ü
			}
		}
	}
}
// �±��ߴµ� ���۶����� ����� �� �ȵǴ��� �𸣰��� ��
