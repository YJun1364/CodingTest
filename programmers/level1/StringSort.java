package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class StringSort {
	public StringSort(){

	}
	//����
	
	public ArrayList solution(String[] strings, int n) {
		int length = strings.length;
		ArrayList<String> answer = new ArrayList<>();		
		char [] tmpArr = new char[length];
		for(int i=0;i<length;i++){//�������ǹ̷� ���� 
			tmpArr[i]=strings[i].charAt(n);			
		}
		Arrays.sort(tmpArr); // �迭 ����	

		for(int i=0;i<length;i++){
			for(int j=0;j<length;j++){ // ���� : ����, ��, n��° �� �� �˼� �ֳ�?
				if(strings[j]!=null){
					if((char)tmpArr[i]==strings[j].charAt(n)){
						answer.add(strings[j]);//answer �� �־��ְ� 
						strings[j]=null;//���� ���� strings ���� ��
					}
				}
			}
		}
		String [] compare = new String[2];
		String tmpStr="";
		for(int i=0;i<length;i++){
			for(int j=0;j<length;j++){
				if(answer.get(i).charAt(n)==answer.get(j).charAt(n)&&answer.get(i).length()>n && answer.get(j).length()>n){
					for(int k=0;k<=n+1;k++){
						try{
							if(answer.get(i).charAt(k)<answer.get(j).charAt(k)){
								tmpStr=answer.get(i);
								answer.set(i, answer.get(j));
								answer.set(j,tmpStr);
							}
						}catch(Exception e){

						}
					}
				}
			}
		}
		return answer;
	}
}
