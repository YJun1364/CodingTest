package study;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriter_study {
	public static void main(String[]args){
		PrintWriter hi = null;
		System.out.println("안녕하세요. PrintWriter입니다.");
		try{
			hi = new PrintWriter(new FileWriter("data.txt"));
			String text = "안녕하세요. PrintWriter입니다.";			
			hi.println(text);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			hi.close();
		}

	}
}
