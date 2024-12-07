package javaprogram;

import java.util.HashSet;

public class DuplicateElement2 
{
	public static void main(String[] args) 
	{
		//Approach-2
		//Using Hashset Data structure.
		String arr[]= {"Java","C","C++","Python","Jav"};
		HashSet<String> langs=new HashSet();
//		System.out.print(langs.add("Java"));
//		System.out.println(langs.add("Python"));
//		System.out.println(langs.add("C"));
//		System.out.println(langs.add("Java"));
//		System.out.println(langs.add("C++"));
		
		boolean flag=false;
		for(String l:arr)
		{
			//System.out.print(langs.add(l));
			
			if(langs.add(l)==false)
			{
				System.out.println("Duplicate Element Found");
				flag=true;
			}	
		}
		if(flag==false)
		{
			System.out.println("No Duplicate Element");
		}
		
		
		
	}
}
