package javaprogram;

import java.util.Arrays;
import java.util.Collections;

public class SortingElement 
{
	public static void main(String[] args) 
	{
		//Approach-1
		int a[]= {30,50,20,40,10,60};
		System.out.println("Before Sort "+Arrays.toString(a));
		
		Arrays.parallelSort(a);
		System.out.println("After Sorting "+Arrays.toString(a));
		
		//Approach-2
	    Arrays.sort(a);
        System.out.println("After Sort :"+Arrays.toString(a));
		
		//Approach-3
		Integer b[]= {30,50,20,10,60};
	  Arrays.sort(b,Collections.reverseOrder());
	  System.out.println("After Sort "+Arrays.toString(b));
	  
	}
}
