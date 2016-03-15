package com.cloudgensys.training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class File {
	public static void main(String[] args) throws Exception{
		
		
		try {
		FileInputStream input=new FileInputStream("C://training.workspace/sample.txt");
		Bufferreader br =new Bufferreader("C://training.workspace/sample.txt");
		int c;
		while((c=input.read())!=-1)
		{
			System.out.print(Character.toString ((char) c));
		}
		}
		catch(FileNotFoundException e)	{
			System.out.println("File not Found ! Provide Coeerct url");
		}
}

}
