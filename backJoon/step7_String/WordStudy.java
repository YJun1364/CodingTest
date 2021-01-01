package step7_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordStudy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		word = word.toUpperCase();	
		
		//test
//		String test = "aaaBbbCccceeetttGGGdddFff";
//		String word = test;
//		word = word.toUpperCase();
		//test end
		
		// �Էµ� ���ĺ��� ������ map ���·� ����
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<word.length();i++){
			char alp = word.charAt(i);
			if(map.get(alp)==null){
				map.put(alp, 1);
			}else{
				map.put(alp, map.get(alp)+1);
			}
		}
//		for (char key : map.keySet()) {//����Ʈ��
//			System.out.println(key+" "+map.get(key)); 
//		}
		//map�� �ִ� value�� ����
		Map.Entry<Character, Integer> maxEntry = null;
		for (Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
				maxEntry = entry;	
			}
		}
		//System.out.println("maxEntry : "+maxEntry);
		
		// map ���� �ִ� ���� ���� ���� �����ִ� Ű�� ī����
		int count = 0;
		for (char key : map.keySet()) {
			if(maxEntry.getValue()==map.get(key)){
				count++;
			}
		}	
		
		if(count==1){ // �ִ밪�� �ڱ� �ڽ� �ϳ��� ���� count = 1
			System.out.println(maxEntry.getKey());
		}else{
			System.out.println("?");
		}
	}
}

/*����
���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.

�Է�
ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.

���
ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.

���� �Է� 1 
Mississipi
���� ��� 1 
?

���� �Է� 2 
zZa
���� ��� 2 
Z
 */