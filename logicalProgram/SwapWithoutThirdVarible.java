package logicalProgram;

public class SwapWithoutThirdVarible 
{
	public static void main(String[] args) 
	{
		//Swapping Two Number with out using Third variable
		int a=101,b=202;
		System.out.println("Before Swapping :"+a+" "+b);
		a=a+b;  //10+20--->30
		b=a-b;  //30-20--->10
		a=a-b;  //30-10--->20
		System.out.println("After Swapping :"+a+" "+b);
		
		
		
	}
}
