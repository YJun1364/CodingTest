package step7_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()+" ");
		String [] arr = new String [3];
		int [] sangSooNum = new int [2];

		
		for(int i=0;i<2;i++){
			String num  = st.nextToken();
//			System.out.println(num);
			for(int j=0;j<3;j++){
				arr[j]=num.charAt(j)+"";
//				System.out.println(arr[j]);
				
			}		
			sangSooNum[i] = Integer.parseInt((arr[2]+arr[1]+arr[0]));	
		}
		//System.out.println(sangSooNum[0]+" "+sangSooNum[1]);	
		if(sangSooNum[0]>sangSooNum[1]){
			System.out.println(sangSooNum[0]);
		}else{
			System.out.println(sangSooNum[1]);
		}
	}
}
/*����
������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. �̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. ����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.

����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�. ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.

�� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. �� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.

���
ù° �ٿ� ����� ����� ����Ѵ�.

���� �Է� 1 
734 893
���� ��� 1 
437*/