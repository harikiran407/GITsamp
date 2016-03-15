package com.cloudgensys.training;                                                                                                                                                                                   

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.IIOException;

public class Trainee {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String thisline = "";
		
		BufferedReader br = null;
		StringBuilder fileContent = new StringBuilder();
		
		try {
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream("C://training.workspace/sample.txt")));
			String line="";
			
		    line = br.readLine();
			
			while((line)!=null)
			{
				fileContent.append(line);
				line = br.readLine();
				
			}
		}
		catch(IIOException e){
			System.out.println("cannot read the file");
		}catch(FileNotFoundException ex){
			System.out.println("File not found");
		}finally{
			
			if(br!=null){
				try{
					br.close();
				}catch(EOFException e){
					System.out.println("cannot close the buffer");
				}
			}	
		}	
	System.out.println("File contents are : " +fileContent.toString());
	Pattern userPattern = Pattern.compile("<user>(.+)</user>");
	Matcher usermatcher= userPattern.matcher(fileContent.toString());
	if(usermatcher.find()) System.out.println(usermatcher.group(1));
	else System.out.println("error");
	
	Pattern IDPattern = Pattern.compile("<ID>([a-z0-9]*?)</ID>");
	Matcher IDmatcher= IDPattern.matcher(fileContent.toString());
	Pattern ContentPattern = Pattern.compile("<content>([0-9]*?)</Content>");
	Matcher Contentmatcher= ContentPattern.matcher(fileContent.toString());
	}
}


			
			
			
	


