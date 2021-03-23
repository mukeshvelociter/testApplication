package com.velociter.primeNumber;
public class FindPrimeNumber 
{
	
	public static void main (String[] args)   
	{
		
		int n=5;
		int count=0;
		int number=2;
		int startTime = (int)System.currentTimeMillis();
		if(n>0) 
		{
			while(count!= n) 
			{ 
					int m=(int) Math.sqrt(number);
		    		    boolean prime = true;
		    		    for (int i = 2; i <=m;i++)
		    		    { 
		    		        if (number % i == 0) 
		    		        {
		    		            prime = false; 
		    		            break;
		    		            
		    		        }
		    		        System.out.println("ith value="+i); 
		    		    }
		    		    if (prime)
		    		    {
		    		    	count++;
		    		         System.out.println(number);
		    		    }
		    		   
		    		    number++; 
		    		    
			   }
			int endTime = (int)System.currentTimeMillis();
	    	int executionTime = (endTime - startTime);
	    	System.out.println("Execution time   : " +(executionTime/1000.0)+" seconds");
		}else
		 System.out.println("please enter valid positive number");
	}
		
}
