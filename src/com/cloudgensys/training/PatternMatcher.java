package com.cloudgensys.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String t = " it was the best of times " ;
		Pattern pattern = Pattern.compile("b(..)t");
		Matcher matcher = pattern.matcher(t);
		if(matcher.find()){
			System.out.println("Found match !"+matcher.group());
		}
		else{
			System.out.println("no match found !");
		}

	}

}
