package step7_String;

import java.io.IOException;

public class ASCII {
	public static void main(String[] args) throws IOException {
		int asc = System.in.read();		
		System.out.println(asc);
	}
}
//System.in.read >> scanner �� �������(java5 ���� ����)���� ���� �Է¹�� �ƽ�Ű�ڵ�� �޴´�.
/*����
���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, �־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
���ĺ� �ҹ���, �빮��, ���� 0-9 �� �ϳ��� ù° �ٿ� �־�����.

���
�Է����� �־��� ������ �ƽ�Ű �ڵ� ���� ����Ѵ�.

���� �Է� 1 
A
���� ��� 1 
65
*/