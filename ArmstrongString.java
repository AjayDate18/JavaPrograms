package logicalProgram;

import java.util.Arrays;

public class ArmstrongString 
{
	public static void main(String args[])
	{
		String s1="ajayd";
		String s2="dyaja";
		
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		System.out.println(Arrays.equals(arr1, arr2));		
	}
}
