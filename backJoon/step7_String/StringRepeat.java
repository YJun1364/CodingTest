package step7_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringRepeat {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++){
			String read = br.readLine();
			st = new StringTokenizer(read);
			int R = Integer.parseInt(st.nextToken());	// �ݺ��Ǵ� ����
			String S = st.nextToken();	// ���ڿ�
			String message = "";
			for(int j=0;j<S.length();j++){
				char ch = S.charAt(j);
				for(int k=0;k<R;k++){
					message += ch;
				}
			}
			System.out.println(message);
		}
	}
}
/*����
���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, ù ��° ���ڸ� R�� �ݺ��ϰ�, 
�� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. S���� QR Code "alphanumeric" ���ڸ� ����ִ�.

QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. �� �׽�Ʈ ���̽��� �ݺ� Ƚ�� R(1 �� R �� 8), 
���ڿ� S�� �������� ���еǾ� �־�����. S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 

���
�� �׽�Ʈ ���̽��� ���� P�� ����Ѵ�.

���� �Է� 1 
2
3 ABC
5 /HTP

���� ��� 1 
AAABBBCCC
/////HHHHHTTTTTPPPPP
 */
