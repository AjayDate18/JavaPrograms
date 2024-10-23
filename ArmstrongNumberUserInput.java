package logicalProgram;

import java.util.Scanner;

public class ArmstrongNumberUserInput 
{
	public static void main(String args[])
	{
		int orig_num,cubesum=0,rem;
		System.out.println("Enter Number "); //153
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		orig_num=number;
		
		while(orig_num>0)
		{
			
			rem=orig_num%10;
			cubesum=cubesum+(rem*rem*rem);
			orig_num=orig_num/10;
		}	
		if(number==cubesum)
		{
			System.out.println("ArmStrrong Number");
		}
		else
		{
			System.out.println(" Not --->ArmStrrong Number");
		}	
		
		
	}
}
