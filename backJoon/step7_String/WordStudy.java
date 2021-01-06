package step7_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WordStudy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		word = word.toUpperCase();	
		
		// 입력된 알파벳과 개수를 map 형태로 저장
		Map<Character,Integer> map = new HashMap<>(26);
		for(int i=0;i<word.length();i++){
			char alp = word.charAt(i);
			if(map.containsKey(alp)){
				map.put(alp, map.get(alp)+1);
			}else{
				map.put(alp, 1);
				
			}
		}
//		for (char key : map.keySet()) {//프린트용
//			System.out.println(key+" "+map.get(key)); 
//		}
		
		//map의 최대 value를 선정
		Map.Entry<Character, Integer> maxEntry = null;
		for (Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
				maxEntry = entry;	
			}
		}
		
//		System.out.println("maxEntry : "+maxEntry);
		
		// map 에서 최대 값과 같은 값을 갖고있는 키값 카운팅
		int count = 0;
		for (char key : map.keySet()) {
			if(maxEntry.getValue()==map.get(key)){
				count++;
			}
		}	
		
		if(count==1){ // 최대값이 자기 자신 하나일 경우는 count = 1
			System.out.println(maxEntry.getKey());
		}else{
			System.out.println("?");
		}

	}
}

/*문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

예제 입력 1 
Mississipi
예제 출력 1 
?

예제 입력 2 
zZa
예제 출력 2 
Z
 */