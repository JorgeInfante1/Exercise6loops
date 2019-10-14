package com.exercise6loops.app;


public class Loops 
{

	public static void main(String[] args) 
	{
		// Constant declaration
		
		// Variable declaration
		
		//Objects construction
		
		//Create a Series of 1-100 1 by 1
		for (int i=100;i>=1;i--)
		{
			System.out.println(i);
		}
		
		for(int i=0;i<=100;i+=2);
		{
			System.out.println(i);
		}
		for(int i=0;i<200;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Break point ");
		for(int i=100;i<200;i++)
		{
			System.out.println(i);
			if(i==150)
			{
				break;
			}
		}

	}

}
