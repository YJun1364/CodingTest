package greedy;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Lifeboat {
	public static void main(String[] args) {
		Lifeboat lb = new Lifeboat();
		int [] people = {70, 50, 80, 50}; // 10,10,9,8,7,6,6,6,5,4,3
		int limit = 100;
		lb.solution(people, limit);
	}
	public int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);
		ArrayDeque<Integer> dq = new ArrayDeque<>();

		for(int i=0; i<people.length; i++){
			dq.offerLast(people[i]);
		}
			System.out.println("dq "+dq.toString());
		int count = 0;
		while(dq.size()>0){
			int big = dq.getLast();
			int small = dq.getFirst();
			if(dq.size()>1){
				if(big+small<=limit){
					dq.pollFirst();
					dq.pollLast();
				}else{
					dq.pollLast();
				}
			}else{
				dq.pollFirst();
			}
			count++;
		}

			System.out.println(count);
		return count;
	}
}
