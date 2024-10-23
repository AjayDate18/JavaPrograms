package logicalProgram;

import java.util.HashMap;

public class EachCharOccurance 
{
	public static void main(String args[])
	{
		String str="google";
		//Hashmap char as key and occurrence as value
		HashMap<Character, Integer> charcount=new HashMap<>();
		for(int i=str.length()-1;i>=0;i--)
		{
			if(charcount.containsKey(str.charAt(i)))
			{
				int count=charcount.get(str.charAt(i));
				charcount.put(str.charAt(i), ++count);
			}	
			else
			{
				charcount.put(str.charAt(i), 1);
			}	
		}
		System.out.println(charcount);
		
	}
}
