package study;

public class MainRunner {
	public static void main(String[] args)	{

		/*ArrayList arraylist = new ArrayList();
		for(int i=0; i<1000; i++){
			System.out.println(arraylist.addLast(i)+" "+ arraylist.get(i));
			//System.out.println(arraylist.add(i,i)+" "+ i+" "+arraylist.size());
		}*/
		// [[0, 0, 0, 0, 0], [0, 0, 1, 0, 3], [0, 2, 5, 0, 1], [4, 2, 4, 4, 2], [3, 5, 1, 3, 1]], [1, 5, 3, 5, 1, 2, 1, 4]
		int[][] board = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
		int moves[] = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
		KakaoTest test = new KakaoTest();
		System.out.println(test.solution(board, moves));
		return ;
	}
}
