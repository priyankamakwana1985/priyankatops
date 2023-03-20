package Assignment18032023;

import java.util.Scanner;

public class Task5 {
	
			
		public static void main(String[] args) 
		{
			
			
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Enter Your Marks of Maths");
			int Maths = sc.nextInt();
			
			System.out.println("Enter Your Marks of Science");
			int Science = sc.nextInt();
			
			System.out.println("Enter Your Marks of English");
			int English = sc.nextInt();
			
			System.out.println("Enter Your Marks of Sanskrit");
			int Sanskrit = sc.nextInt();
			
			System.out.println("Enter Your Marks of Gujarati");
			int Gujarati = sc.nextInt();
			
			int s = Maths+Science+English+Sanskrit+Gujarati;
			int p = (Maths+Science+English+Sanskrit+Gujarati)*5/100;
			
			System.out.println(s);
			System.out.println(p);
			
						
		}
	}

		
		
		
		




