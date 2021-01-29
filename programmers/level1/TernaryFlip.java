package level1;

import java.util.ArrayList;

public class TernaryFlip {
	public static void main(String[] args) {
		TernaryFlip sam = new TernaryFlip();
		int n = 125;
		sam.solution(n);
	}

	public TernaryFlip(){

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
			answer += Math.pow(3, j)*list.get(i); //Math.pow(i,j) : iÀÇ j Á¦°ö °ª
			j++; 
			//System.out.println(answer);
		}
		return answer;
	}
}
