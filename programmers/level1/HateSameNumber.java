package level1;

import java.util.ArrayList;

public class HateSameNumber {
	public static void main(String[] args) {
		HateSameNumber set = new HateSameNumber();
		int[] arr = new int []{1, 1, 3, 3, 0, 1, 1};
		set.solution(arr);
	}
	
	public ArrayList<Integer> solution(int []arr) {
		ArrayList<Integer> list = new ArrayList<>();
		int j =0;
		list.add(arr[0]);

		for(int i=1;i<arr.length;i++){
			if(list.get(j)!= arr[i]){
				list.add(arr[i]);
				j++;
			}		
		}
		return list;
	}
}
