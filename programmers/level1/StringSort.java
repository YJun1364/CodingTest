package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;


public class StringSort {
	public static void main(String[] args) {
		StringSort ss= new StringSort();
		String[] strings={"bed","sun",  "car"};
		int n=1;
		ss.solution(strings, n);
	}
	public StringSort(){

	}
	//����
	public ArrayList<String> solution (String[] strings, int n){
		ArrayList<String> answer = new ArrayList<>(); // ���� �ٱ���
		int length = strings.length;
		String [] chars = new  String [length]; //n��° ���ĺ� �ٱ���
		HashSet<String> set = new HashSet<>();//�ߺ��˻�
		
		for(int i=0;i<length;i++){
			String charN = strings[i].substring(n, n+1); //n��° ����
			chars[i]=charN;	// �ٱ��Ͽ� ����
		}//for
		
		Arrays.sort(chars); // �������� ����

		for(int i=0;i<length;i++){ // for 1
			ArrayList<String> list = new ArrayList<>(); //n��°�� ��ġ�� �κ� ó�� ���
			
			for(int j=0;j<length;j++){ // for 2-1
				if(strings[j].substring(n, n+1).equals(chars[i])){
					if(!list.contains(strings[j]))
						list.add(strings[j]);					
				}// if 1	
				Collections.sort(list);//list �� ����� ������ �������� ����
			}// for 2-1
			

			for(int k=0;k<list.size();k++){ // for 2-2 ��ó�� ���
				if(set.add(list.get(k))) // set���� �ߺ�Ȯ���Ͽ� �������� ���� ����Ʈ�� ����
					answer.add(list.get(k));
			}// for 2-2
			list.clear();
			
		}// for 1
		return answer;
	}

	/*public ArrayList solution(String[] strings, int n) {
		ArrayList<String> answer = new ArrayList <String> (); //������ ���� ����
		String[] chars = new String [strings.length];  //strings�� ���ҿ��� char���� ��Ƴ��� �迭
		HashSet <String> set = new HashSet <String> (); //�ߺ��˻縦 ���� set

		for (int i = 0; i < strings.length; i++){ 
			String getChar = strings[i].substring(n,n + 1); //strings ���ҿ��� �ڸ����� char ����
			chars[i] = getChar; //chars[]�� ���� char�� �־���
		}//for

		Arrays.sort(chars); //���ҵ��� ����������

		for (int i = 0; i < chars.length; i++){
			ArrayList <String> list = new ArrayList <String> (); //strings ���ҵ��� n�ڸ��� ���ĺ��� ������ ���ҵ鸸 ���� �迭

			for (int j = 0; j < strings.length; j++){
				boolean b = strings[j].substring(n,n + 1).equals(chars[i]); //n��° �ڸ����� ������ ��
				if (b){ //������ n��° �ڸ����� �����ϴٸ�
					if (!list.contains(strings[j])) {  //���Ҹ� list�� �ֱ����� ����ִ��� Ȯ��
						list.add(strings[j]); 
					}//if
					Collections.sort(list);

				}//if
			}//for j

			for (int k = 0; k < list.size(); k++){
				boolean b = set.add(list.get(k));
				if (b){
					answer.add(list.get(k));
				}
			}			
			list.clear();
		}//for i
		return answer;
	}*/
}

