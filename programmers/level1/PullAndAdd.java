package level1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class PullAndAdd {
	public static void main(String[] args) {
		int [] numbers = new int[]{2, 1, 3, 4, 1};
		PullAndAdd two = new PullAndAdd();
		System.out.println(Arrays.toString(two.solution(numbers)));
	}
	
	public int[] solution(int[] numbers) {
		TreeSet<Integer> set = new TreeSet<>(); //중복을 걸러주는 역할
		for(int i=0;i<numbers.length;i++){
			//System.out.print("i : "+numbers[i]+"\t");
			for(int j=0;j<numbers.length;j++){
				//System.out.print(numbers[j]+" ");
				if(i!=j){			
					//System.out.println(numbers[i]+" "+numbers[j]);
					int value = numbers[i]+numbers[j];
					set.add(value);
				}
			}		
		}

		int[] answer = new int[set.size()];
		int i=0;
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			answer[i]=it.next();
			i++;
		}
		return answer;
	}
}
