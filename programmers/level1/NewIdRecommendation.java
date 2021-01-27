package level1;

import java.util.ArrayList;


public class NewIdRecommendation {
	public static void main(String[] args) {
		NewIdRecommendation nir = new NewIdRecommendation();
		String new_id = "z-+.^.";
		//System.out.println("answer:"+nir.solution(new_id));
		//nir.regex(new_id);
		nir.regexAndSb(new_id);
		
	}
	
	public String regexAndSb(String new_id){
		String answer = "";
		StringBuffer sb = new StringBuffer();
		sb.append(new_id.toLowerCase().replaceAll("[^-_.a-z0-9]", "").replaceAll("[.]{2,}",".").replaceAll("^[.]|[.]$", ""));
		
		answer = sb.toString();

		if(answer.isEmpty()) // 5. 빈문자열이라면  a 대입
			answer = "a";
		if(answer.length()>15){ // 6. 길다면 15자리로 자르고 양끝 마침표 검사 
			answer = answer.substring(0,15);
			answer = answer.replaceAll("^[.]|[.]$", "");
		}
		
		if(answer.length()<3){ // 7. 3보다 길이가 작다면 마지막 문자로 3개 까지 길이 늘리기
			for(int i=answer.length();i<3;i++){
				answer+=answer.charAt(answer.length()-1);
			}
		}System.out.println(answer);

		return answer;
	}
	
	public String regex(String new_id){
		String answer = "";
		StringBuffer sb = new StringBuffer();
		new_id = new_id.toLowerCase(); // 1. 소문자로 치환
		new_id = new_id.replaceAll("[^-_.a-z0-9]", ""); // 2.특수문자 거르기
		new_id = new_id.replaceAll("[.]{2,}","."); // 3. 반복되는 마침표 수정
		new_id = new_id.replaceAll("^[.]|[.]$", ""); // 4. 마침표로 시작 or 끝난다면 삭제
		if(new_id.isEmpty()) // 5. 빈문자열이라면  a 대입
			new_id = "a";
		if(new_id.length()>15){ // 6. 길다면 15자리로 자르고 양끝 마침표 검사 
			new_id = new_id.substring(0,15);
			new_id = new_id.replaceAll("^[.]|[.]$", "");
		}
		
		if(new_id.length()<3){ // 7. 3보다 길이가 작다면 마지막 문자로 3개 까지 길이 늘리기
			for(int i=new_id.length();i<3;i++){
				new_id+=new_id.charAt(new_id.length()-1);
			}
		}
		answer=new_id;
		return answer;
	}
	
	public String solution(String new_id) {
		String answer = "";
		ArrayList<Character> list = new ArrayList<>();
		
		new_id=new_id.toLowerCase(); // 1단계 소문자로 치환
		
		for(int i = 0; i < new_id.length(); i++){
			list.add(new_id.charAt(i));
		}
		
		for(int i = list.size()-1; i >= 0 ; i--){ //2단계 특수문자 제거
			char getList = list.get(i);		
			
			getList = (Character.isLowerCase(getList)||Character.isDigit(getList)||getList=='.'||getList=='_'||getList=='-') ? getList : list.remove(i);		
			
		}		
		//print(2,list);
		
		for(int i = list.size()-1; i > 0 ; i--){ // 3단계 마침표 중복 제거
			char getList = list.get(i);
			getList = (getList=='.' && list.get(i-1)=='.') ? list.remove(i) : getList; 
		}
		//print(3,list);
		
		removeDot(list);// 4단계	처음과 끝 마침표 제거		
		//print(4,list);
		
		if(list.isEmpty()) // 5단계 빈문자열의 경우 a삽입
			list.add('a');
		//print(5,list);
		
		ArrayList<Character> tmp = new ArrayList<>();
		if(list.size()>15){ // 6단계 15자리이내로 정리 후 처음과 끝 마침표 제거  			
			for(int i = 0; i < 15; i++){
				tmp.add(list.get(i));
			}
			removeDot(tmp);
			list.clear();
			list = tmp;
		}
		//print(6,list);
		
		if(list.size()<3){
			for(int i = list.size(); i <3 ; i++){
			list.add(list.get(list.size()-1));
			}
		}
		//print(7,list);
		for(int i = 0; i < list.size(); i++){
			answer+=list.get(i);
		}
		
		return answer;
	}
	
	public ArrayList<Character> removeDot(ArrayList<Character> list){
		if(list.size()>1){
		if(list.get(0)=='.') // 4단계 처음이나 끝에 위치한 마침표 제거
			list.remove(0);
		if(list.get(list.size()-1)=='.')
			list.remove(list.size()-1);
		}else if(list.get(0)=='.'){
			list.remove(0);
			
		}
		return list;
	}
	
	public void print(int i,ArrayList<Character> list){
		 System.out.println(i+"단계:"+list.toString());
	}
}
//정규 표현식을 공부해보자

/*1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.*/