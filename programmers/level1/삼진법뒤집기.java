package level1;

import java.util.ArrayList;

public class 삼진법뒤집기 {
	public 삼진법뒤집기(){

	}
	public int solution(int n) {
		int remainder=0;
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(n>2){		
			remainder = n%3;
			n=n/3;
			list.add(remainder);
		}
		list.add(n);
		//System.out.println(list.toString());
		int j=0;
		for(int i=list.size()-1;i>=0;i--){
			answer += Math.pow(3, j)*list.get(i); //Math.pow(i,j) : i의 j 제곱 값
			j++; 
			//System.out.println(answer);
		}
		return answer;
	}
}
