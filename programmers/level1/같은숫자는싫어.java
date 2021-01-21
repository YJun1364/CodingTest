package level1;

import java.util.ArrayList;

public class 같은숫자는싫어 {
	public 같은숫자는싫어(){

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
