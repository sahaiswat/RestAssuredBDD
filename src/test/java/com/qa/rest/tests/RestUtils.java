package com.qa.rest.tests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

	public static String getemail()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(1);
		return(generatedString+"gmail.com");
	}
	
	public static String getname()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(2);
		return ("John"+generatedString);
	}
	
	public static String getsalary()
	{
		String generatedString=RandomStringUtils.randomNumeric(3);
		return(generatedString);
	}
	
	
	public static String getage()
	{
		String generatedString=RandomStringUtils.randomNumeric(2);
		return (generatedString);
	}
	
}
