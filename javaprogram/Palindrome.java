package javaprogram;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		
		//A Palindrome number is number that remains the same
		//when its digit are reversed eg-16461
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number ");
		int num=sc.nextInt();
		
		int org_num=num;
		int rev=0;
		
		
		while(num!=0)
		{
			//num=123
			//0+3,3*10+2=32,32*10+1=321
			rev=rev*10+num%10;
			num=num/10;
			
		}
		
		System.out.println("Reverse Number is "+rev);
		
		if(org_num==rev)
		{
			System.out.println("Palindrome Number");
		}	
		else
		{
			System.out.println("Not Palindrome Number");
		}	
		
		
	}
}
