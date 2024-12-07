package javaprogram;

import java.util.Scanner;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enetr A String");
		String str=sc.next();
		String rev="";
		
		int len=str.length();
		System.out.println("String Length is "+len);
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}	
		System.out.println("Reverse String is "+rev);
		
	
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome String");
		}	
		else
		{
			System.out.println("Not Palindrome String");
		}	
	}
}
