package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMinimum {
	public static void main(String[] args) {
		RemoveMinimum rm = new RemoveMinimum();
		int [] arr = {5,2,56,23,4,3};
		rm.solution(arr);
	}
	public ArrayList<Integer> solution(int[] arr) {
		ArrayList<Integer>  list = new ArrayList<>();
		int min = 9999;
		if(arr.length > 1){
			for(int i = 0; i < arr.length; i++){
				list.add(arr[i]);
				min = (arr[i] < min) ? arr[i] : min ;
			} 

			list.remove(list.indexOf(min));
		}else{
			list.add(-1);
		}

		//System.out.println(min + " " + list.toString());
		return list;
	}
}
