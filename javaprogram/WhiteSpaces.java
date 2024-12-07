package javaprogram;


//Remove White Spaces From a String
public class WhiteSpaces 
{
	public static void main(String[] args) 
	{
	
		String str="Java Selenium Automation";
		str=str.replaceAll("\\s", ""); //White Spaces
	    System.out.println(str);
		
				
	}
}
