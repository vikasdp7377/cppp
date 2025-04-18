package io_programming;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data = 0;
		//String filepath = "C:\\Users\\CDAC\\Desktop\\vikas_java\\RahulBarveSir\\src\\fileHandling\\greetings.txt";
		String filepath="./src/fileHandling/greetings.txt";
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(filepath);
			System.out.println("file Located....");
			while(true)
			{
				data = fin.read();
				if(data==-1)
				{
					break;
				}
				char ch=(char)data;
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
