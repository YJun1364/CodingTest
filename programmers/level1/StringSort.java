package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class StringSort {
	public StringSort(){

	}
	//실패
	
	public ArrayList solution(String[] strings, int n) {
		int length = strings.length;
		ArrayList<String> answer = new ArrayList<>();		
		char [] tmpArr = new char[length];
		for(int i=0;i<length;i++){//사전적의미로 정렬 
			tmpArr[i]=strings[i].charAt(n);			
		}
		Arrays.sort(tmpArr); // 배열 정렬	

		for(int i=0;i<length;i++){
			for(int j=0;j<length;j++){ // 정보 : 순서, 값, n번째 값 다 알수 있네?
				if(strings[j]!=null){
					if((char)tmpArr[i]==strings[j].charAt(n)){
						answer.add(strings[j]);//answer 에 넣어주고 
						strings[j]=null;//넣은 값은 strings 에서 뺌
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
