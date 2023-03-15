package Operators;

import java.util.Scanner;

public class TriangleAreaEx 

                            {	
	
	public static void main(String[] args) 
		
	{        
		      		      
	        Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter base of triangle");
			System.out.println("Enter height of triangle");
			double a =sc1.nextDouble();
			double b =sc1.nextDouble();
			double area= 0.5*a*b;
			
		           
	    
		System.out.println("Area of triangle= "+area);
				
	       
	}   
		
}


