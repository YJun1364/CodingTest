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

		if(answer.isEmpty()) // 5. ���ڿ��̶��  a ����
			answer = "a";
		if(answer.length()>15){ // 6. ��ٸ� 15�ڸ��� �ڸ��� �糡 ��ħǥ �˻� 
			answer = answer.substring(0,15);
			answer = answer.replaceAll("^[.]|[.]$", "");
		}
		
		if(answer.length()<3){ // 7. 3���� ���̰� �۴ٸ� ������ ���ڷ� 3�� ���� ���� �ø���
			for(int i=answer.length();i<3;i++){
				answer+=answer.charAt(answer.length()-1);
			}
		}System.out.println(answer);

		return answer;
	}
	
	public String regex(String new_id){
		String answer = "";
		StringBuffer sb = new StringBuffer();
		new_id = new_id.toLowerCase(); // 1. �ҹ��ڷ� ġȯ
		new_id = new_id.replaceAll("[^-_.a-z0-9]", ""); // 2.Ư������ �Ÿ���
		new_id = new_id.replaceAll("[.]{2,}","."); // 3. �ݺ��Ǵ� ��ħǥ ����
		new_id = new_id.replaceAll("^[.]|[.]$", ""); // 4. ��ħǥ�� ���� or �����ٸ� ����
		if(new_id.isEmpty()) // 5. ���ڿ��̶��  a ����
			new_id = "a";
		if(new_id.length()>15){ // 6. ��ٸ� 15�ڸ��� �ڸ��� �糡 ��ħǥ �˻� 
			new_id = new_id.substring(0,15);
			new_id = new_id.replaceAll("^[.]|[.]$", "");
		}
		
		if(new_id.length()<3){ // 7. 3���� ���̰� �۴ٸ� ������ ���ڷ� 3�� ���� ���� �ø���
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
		
		new_id=new_id.toLowerCase(); // 1�ܰ� �ҹ��ڷ� ġȯ
		
		for(int i = 0; i < new_id.length(); i++){
			list.add(new_id.charAt(i));
		}
		
		for(int i = list.size()-1; i >= 0 ; i--){ //2�ܰ� Ư������ ����
			char getList = list.get(i);		
			
			getList = (Character.isLowerCase(getList)||Character.isDigit(getList)||getList=='.'||getList=='_'||getList=='-') ? getList : list.remove(i);		
			
		}		
		//print(2,list);
		
		for(int i = list.size()-1; i > 0 ; i--){ // 3�ܰ� ��ħǥ �ߺ� ����
			char getList = list.get(i);
			getList = (getList=='.' && list.get(i-1)=='.') ? list.remove(i) : getList; 
		}
		//print(3,list);
		
		removeDot(list);// 4�ܰ�	ó���� �� ��ħǥ ����		
		//print(4,list);
		
		if(list.isEmpty()) // 5�ܰ� ���ڿ��� ��� a����
			list.add('a');
		//print(5,list);
		
		ArrayList<Character> tmp = new ArrayList<>();
		if(list.size()>15){ // 6�ܰ� 15�ڸ��̳��� ���� �� ó���� �� ��ħǥ ����  			
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
		if(list.get(0)=='.') // 4�ܰ� ó���̳� ���� ��ġ�� ��ħǥ ����
			list.remove(0);
		if(list.get(list.size()-1)=='.')
			list.remove(list.size()-1);
		}else if(list.get(0)=='.'){
			list.remove(0);
			
		}
		return list;
	}
	
	public void print(int i,ArrayList<Character> list){
		 System.out.println(i+"�ܰ�:"+list.toString());
	}
}
//���� ǥ������ �����غ���

/*1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
     ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.*/