package level1;

import java.util.ArrayList;

public class ����������¼��ڹ迭 {
	public static void main(String[] args) {
		����������¼��ڹ迭 div = new ����������¼��ڹ迭();
		int [] arr = {5, 9, 7, 10};
		int divisor = 5;
		System.out.println(div.solution(arr, divisor));
	}
	
	public ����������¼��ڹ迭(){
		
	}
	
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int value : arr){
        	if(value%divisor ==0){
        		answer.add(value);
        	}
        }
        if(answer.isEmpty())
        	answer.add(-1);
        answer.sort(null);
        return answer;
    }
}

// Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray(); --> ���� ���� ���� �������... (���غҰ�)

