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
	//실패
	public ArrayList<String> solution (String[] strings, int n){
		ArrayList<String> answer = new ArrayList<>(); // 정답 바구니
		int length = strings.length;
		String [] chars = new  String [length]; //n번째 알파벳 바구니
		HashSet<String> set = new HashSet<>();//중복검사
		
		for(int i=0;i<length;i++){
			String charN = strings[i].substring(n, n+1); //n번째 추출
			chars[i]=charN;	// 바구니에 삽입
		}//for
		
		Arrays.sort(chars); // 오름차순 정렬

		for(int i=0;i<length;i++){ // for 1
			ArrayList<String> list = new ArrayList<>(); //n번째가 겹치는 부분 처리 담당
			
			for(int j=0;j<length;j++){ // for 2-1
				if(strings[j].substring(n, n+1).equals(chars[i])){
					if(!list.contains(strings[j]))
						list.add(strings[j]);					
				}// if 1	
				Collections.sort(list);//list 에 저장된 값들을 오름차순 정렬
			}// for 2-1
			

			for(int k=0;k<list.size();k++){ // for 2-2 후처리 담당
				if(set.add(list.get(k))) // set으로 중복확인하여 없을때만 정답 리스트에 삽입
					answer.add(list.get(k));
			}// for 2-2
			list.clear();
			
		}// for 1
		return answer;
	}

	/*public ArrayList solution(String[] strings, int n) {
		ArrayList<String> answer = new ArrayList <String> (); //정답을 담을 변수
		String[] chars = new String [strings.length];  //strings의 원소에서 char값을 모아놓을 배열
		HashSet <String> set = new HashSet <String> (); //중복검사를 위한 set

		for (int i = 0; i < strings.length; i++){ 
			String getChar = strings[i].substring(n,n + 1); //strings 원소에서 자릿수의 char 추출
			chars[i] = getChar; //chars[]에 추출 char을 넣어줌
		}//for

		Arrays.sort(chars); //원소들을 사전순으로

		for (int i = 0; i < chars.length; i++){
			ArrayList <String> list = new ArrayList <String> (); //strings 원소들중 n자릿수 알파벳이 동일한 원소들만 담을 배열

			for (int j = 0; j < strings.length; j++){
				boolean b = strings[j].substring(n,n + 1).equals(chars[i]); //n번째 자릿수가 같은지 비교
				if (b){ //원소의 n번째 자릿수가 동일하다면
					if (!list.contains(strings[j])) {  //원소를 list에 넣기전에 들어있는지 확인
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

