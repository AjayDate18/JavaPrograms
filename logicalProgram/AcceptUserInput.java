package logicalProgram;

import java.util.Scanner;

public class AcceptUserInput 
{
	public static void main(String[] args) 
	{
		//create object of Scanner Class.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr First Number: ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number :");
		int b=sc.nextInt();
		
		System.out.println("Addtion of Two Number is :"+(a+b));
		System.out.println("Substraction Of two Number is"+(a-b));
		
	}
}
