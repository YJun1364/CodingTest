package level1;

import java.util.Arrays;

public class StringReposition {
	public StringReposition() {
		
	}

	public String solution(String s) {
		int [] arr = new int[s.length()];
		for(int i=0;i<s.length();i++){
			arr[i]=s.charAt(i);
		}
		Arrays.sort(arr);
		StringBuffer sb = new StringBuffer();		
		for(int i=arr.length-1;i>=0;i--){
			sb.append((char)arr[i]); // append �� char ��  String �Ѵ� ���Ҽ� ����.!!!!
		}

		return sb.toString();
	}
}
