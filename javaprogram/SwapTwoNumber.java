package javaprogram;

public class SwapTwoNumber 
{
	public static void main(String[] args) 
	{
		//Swap Two Number
		int a=10,b=20;
		int temp;
		
		System.out.println("Brfore Swapping a and b are "+a+"  "+b);
		//Method-1--->Without Using Third Variable
		
//		a=a+b;  //10+20=30
//		b=a-b;  //30-20=10
//		a=a-b;  //30-10=20
		
		
		//Method-2--->Without Using Third Variable
		
//	    a=a*b; //10*20=200
//	    b=a/b; //200/20=10
//	    a=a/b; //200/10=20
		
		
		//Method-3 -->Using Third Variable
		
//		temp=a; //temp=10
//		a=b;    //a=20
//		b=temp;  //b=10
		
		//Method-4 Bitwise xor operator (^)
		
		
//		a=a^b; //
//		System.out.println("Value Of a is:"+a);    //30
//		b=a^b; //
//		System.out.println("Value of b is: "+b);    //10
//		a=a^b;//
//		System.out.println("Value of a is :"+a);   //20
	

	//Method-5
	//Single Statement
	
	b=a+b-(a=b); //(a=b)---->20
	//a+b=30
	//30-20=10
		
		
		
		
		
		System.out.println("After Swapping a and b are "+a+" "+b);
		
		
		
	}
}
