package level1;

import java.util.ArrayList;

public class DividedNumberArray {
	public static void main(String[] args) {
		DividedNumberArray div = new DividedNumberArray();
		int [] arr = {5, 9, 7, 10};
		int divisor = 5;
		System.out.println(div.solution(arr, divisor));
	}
	
	public DividedNumberArray(){
		
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

