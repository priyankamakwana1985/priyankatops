package Assignment18032023;

import java.util.Scanner;

public class Task2 {
	
	
	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter First Number");
		int fnumber = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int snumber = sc.nextInt();
		
		int add = fnumber+snumber;
		int sub = fnumber-snumber;
		int multi = fnumber*snumber;
		int div = fnumber/snumber;
		
				
		
		System.out.println("\n Addition is :"+add+" \n Subtraction is:"+sub+" \n Multiplication is:"+multi+" \n Division is:"+div);
		
		
		
	}
}

	
	

