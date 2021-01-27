package level1;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerDescending {
	public static void main(String[] args) {
		IntegerDescending id = new IntegerDescending();
		long n =118372;
		System.out.println(id.solution(n));
	}
	
    public long solution(long n) {
    	long answer = 0;
    	String result = "";
        ArrayList<Integer> list = new ArrayList<>();
        
        while(n>0){
        	int N = (int)(n%10);
        	list.add(N);       	
        	n=n/10;
        }
        Collections.sort(list);

        for(int i=list.size()-1;i>=0;i--){
        	result+=list.get(i);
        }
        
        answer = Long.parseLong(result);
        return answer;
    }
}
