package logicalProgram;

import java.util.Scanner;

public class Palindromenumber 
{
	public static void main(String args[])
	{
		//1221--->Palindrom
		
		int orig_num,rem;
		int sum=0;
		int num;
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		orig_num=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum*10+rem;
			//11 ,1*10+2=112,112*10+2=1122,1122*10+2=1221
			num=num/10;
		}	
		System.out.println(sum);
		
		if(sum==orig_num)
		{
			System.out.println("palindrome Number");
		}	
		else
		{
			System.out.println("Not Palindrome Number");
		}	
	}
}
