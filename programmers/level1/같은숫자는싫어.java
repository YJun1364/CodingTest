package level1;

import java.util.ArrayList;

public class �������ڴ½Ⱦ� {
	public static void main(String[] args) {
		�������ڴ½Ⱦ� set = new �������ڴ½Ⱦ�();
		int[] arr = new int []{1, 1, 3, 3, 0, 1, 1};
		set.solution(arr);
	}
	
	public �������ڴ½Ⱦ�(){

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
