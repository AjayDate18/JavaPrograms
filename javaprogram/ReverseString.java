package javaprogram;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		//Using String Concatenation Operator
		
		String str="ABCD";
		String rev=""; //Empty String
		
//		int len=str.length();//4
//		
//		for(int i=len-1;i>=0;i--)
//		{
//			rev=rev+str.charAt(i);
//		}	
//		System.out.println("Reverse String is :"+rev);
//		
		
		
		//Logic-2
		//Using Character Array
		
		char a[]=str.toCharArray();
		int len=a.length;
		
		for(int i=len-1;i>=0;i--)
	    {
			rev=rev+a[i];
	    }	
	
		System.out.println("Reversre is "+rev);
	
	
		
		
		//Logic-3-Using String Buffer Class
		
//		StringBuffer sb=new StringBuffer(str);
//		System.out.println("Reverse String is :"+sb.reverse());
		
		
	}
}
