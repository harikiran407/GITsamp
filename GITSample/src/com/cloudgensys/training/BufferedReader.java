package com.cloudgensys.training;

import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class BufferedReader {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		String thisline = "";
		BufferedReader br = null;
		
		try {
			
		 br = new BufferedReader(new InputStreamReader(new FileInputstream(new File("C://training.workspace/sample.txt"))));
			String line="";
		    line = br.readLine();
			
			while((line)!=null)
			{
				FileContent.append(line);
				
			}
		}
		catch(IOException e){
			System.out.println("cannot read the file");
		}catch(fileNotFoundException ex){
			System.out.println("File not found");
		}finally{
			
			if(br!=null){
				try{
					br.close();
				}catch(exception e){
					System.out.println("cannot close the buffer");
				}
			}
		}
		System.out.println("File contents are : " +fileContent.toString());
		Pattern userpattern = Pattern.compile("<username>([a-z]*?)</username>");
		Pattern IDpattern = Pattern.compile("<ID>([a-z]*?)</ID>");
		Pattern contentpattern = Pattern.compile("<content>([a-z]*?)</Content>");
				}
			
			
			

	}


