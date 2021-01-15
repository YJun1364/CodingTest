package study;

public class MainRunner {
	public static void main(String[] args)	{

		ArrayList arraylist = new ArrayList();
		for(int i=0; i<1000; i++){
			System.out.println(arraylist.addLast(i)+" "+ arraylist.get(i));
			//System.out.println(arraylist.add(i,i)+" "+ i+" "+arraylist.size());
		}
		return ;
	}
}
