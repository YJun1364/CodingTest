package level1;

import java.util.Arrays;

public class SecretMap {
	public static void main(String[] args) {
		SecretMap sm = new SecretMap();
		int n =5;
		int [] arr1 = {9, 20, 28, 18, 11};
		int [] arr2 = {30, 1, 21, 17, 28};
		sm.solution(n, arr1, arr2);
		
	}

	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		int [][] array = new int[2][n];
		String[][] arrToBinary=new String[2][n];

		for(int i=0;i<n;i++){
			array[0][i] = arr1[i];
			array[1][i] = arr2[i];
		}
		
		for(int k=0;k<2;k++){
			for(int i = 0; i < n; i++ ){
				String binary = Integer.toBinaryString(array[k][i]);
				for(int j = 0; j < n-1; j++){
					binary = (binary.length()<n) ? "0"+binary : binary ;
					if(binary.length()==n){
						break;
					}
				}
				arrToBinary[k][i]=binary;
			}// for / arr1
		}
		//System.out.println(Arrays.toString(arrToBinary[0])+"\n"+Arrays.toString(arrToBinary[1]));
		
		for(int i=0;i<n;i++){
			String result = "";
			for(int j=0;j<n;j++){
				result += (arrToBinary[0][i].charAt(j)=='1' || arrToBinary[1][i].charAt(j)=='1') ? "#" : " " ;
			}
			answer[i]=result;
		}
		//System.out.println(Arrays.toString(answer));
		return answer;
	}
}
