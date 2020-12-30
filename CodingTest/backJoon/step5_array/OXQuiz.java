package step5_array;

import java.io.IOException;
import java.util.Scanner;

public class OXQuiz {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//Integer.parseInt(br.readLine());

		for(int i=0;i<N;i++){	
			String line = sc.next();//st.nextToken();
			int lineScore = 0;
			int l = line.length();
			int count = 0;
			for(int j=0;j<l;j++){

				char ox = line.charAt(j);
				if(ox=='O'){
					count++;
					lineScore += count;
				}else{
					count = 0;
				}
			}
			System.out.println(lineScore);
		}
	}		
}



/*����
"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.

���
�� �׽�Ʈ ���̽����� ������ ����Ѵ�.

���� �Է� 1 
5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX

���� ��� 1 
10
9
7
55
30*/