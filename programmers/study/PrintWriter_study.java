package study;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriter_study {
	public static void main(String[]args){
		PrintWriter hi = null;
		System.out.println("�ȳ��ϼ���. PrintWriter�Դϴ�.");
		try{
			hi = new PrintWriter(new FileWriter("data.txt"));
			String text = "�ȳ��ϼ���. PrintWriter�Դϴ�.";			
			hi.println(text);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			hi.close();
		}

	}
}
