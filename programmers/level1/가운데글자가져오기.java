package level1;

public class ������ڰ������� {
	public static void main(String[] args) {
		������ڰ������� center = new ������ڰ�������();
		String s="abcd";
		System.out.println(center.solution(s));
	}

	public ������ڰ�������(){

	}

	public String solution(String s) {
		//�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.  
		String answer = "";
		int size = s.length();

		int center = size/2;
		//System.out.println(center);
		if(size%2==1){ //Ȧ��
			answer = Character.toString(s.charAt(center));		        	
		}else{
			answer = s.substring(center-1, center+1);
		}
		return answer;

	}
}
/* ��ü  + ������ �̿��� �ڵ� ����ȭ
	public String getMiddle(String str){
    String middle = str.substring((str.length()-1)/2,str.length()/2+1);
        return middle;
	}
  	public String solution(String s) {
      //�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.  
      	Solution getM = new Solution();

      	return getM.getMiddle(s);
 	}
 */