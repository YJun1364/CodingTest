package level1;

import java.util.ArrayList;

public class 나누어떨어지는숫자배열 {
	public 나누어떨어지는숫자배열(){
		
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

// Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray(); --> 람다 강의 먼저 보고오기... (이해불가)

