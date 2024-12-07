package logicalProgram;

import java.util.Scanner;

public class Palindromenumber 
{
	public static void main(String args[])
	{
		//1221--->Palindrome Number
		
		int orig_num,rem;
		int sum=0;
		int num;
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		orig_num=num;
		while(num>0)
		{
			rem=num%10;  //121%10--->1(Reminder)
			sum=sum*10+rem; //
			//1221--->0*10+1=1,1*10+2=12,12*10+2=122,122*10+1=1221
			num=num/10;  //121/10---->12(Dividend)
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
