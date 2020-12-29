package step3_for;
/*
 *����
���������� for�� ������ Ǯ�� ���� �����ؾ� �� ���� �ִ�. ����� ����� ������ ���� ���� �Է¹ްų� ����� �� �ð��ʰ��� �� �� �ִٴ� ���̴�.

Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�. 
BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.

���� �Է°� ��� ��Ʈ���� �����̹Ƿ�, �׽�Ʈ���̽��� ���� �Է¹޾Ƽ� ������ �� ���� ����� �ʿ�� ����. �׽�Ʈ���̽��� �ϳ� ���� �� �ϳ� ����ص� �ȴ�.

�ڼ��� ���� �� �ٸ� ����� ���� �� �ۿ� ����Ǿ� �ִ�.

�� ��α� �ۿ��� BOJ�� ��Ÿ ���� ���� ���� �� �� �ִ�.

 *�Է�
ù �ٿ� �׽�Ʈ���̽��� ���� T�� �־�����. T�� �ִ� 1,000,000�̴�. ���� T�ٿ��� ���� �� ���� A�� B�� �־�����.
 A�� B�� 1 �̻�, 1,000 �����̴�.

 *���
�� �׽�Ʈ���̽����� A+B�� �� �ٿ� �ϳ��� ������� ����Ѵ�.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FastAplusB {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase=Integer.parseInt(bf.readLine());	
		
		for(int i=1;i<=testCase;i++){
			String input = bf.readLine(); //String �Է� ��
			StringTokenizer st = new StringTokenizer(input); //StringTokenizer���ڰ��� �Է� ���ڿ� ����

			int A = Integer.parseInt(st.nextToken()); //Int�� ����ȯ
			int B = Integer.parseInt(st.nextToken()); //Int�� ����ȯ

			bw.write(A+B+"\n");
		}
		bw.flush();
	}
}
// scanner ��� ���Ǵ� �޼��� buffer �����ؼ� ������ �̰��� �����͸� �����ϴ� ������ ������̴�. 
// BufferedReader(��������� ����) -> bf.readLine(�Է°� �б�) -> bw.write(���� ���)
