package logicalProgram;

public class ReverseOfString 
{
	public static void main(String args[])
	{
		String str="Hello Good Morning";
		StringBuffer sb=new StringBuffer("Hello Good Morning");
		System.out.println("Reverse String is "+sb.reverse());
		
		int length=str.length();
		System.out.println(length);
		String reverse="";
		System.out.println(reverse.length());
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}	
		System.out.println(reverse);
	}

			
}
