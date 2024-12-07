package javaprogram;

import java.util.Random;

public class Random1 
{
	public static void main(String[] args) 
	{
		//Approach-1 Random class
		Random rand=new Random();
		int rand_int=rand.nextInt(100);//Between 0-100
		System.out.println(rand_int);
		
		double rand_dbl=rand.nextDouble();
		System.out.println(rand_dbl); //0.0 and less than 1.0
		
		
		//Approach-2
		System.out.println(Math.random()); //Only Decimal Value
		
	}
}
