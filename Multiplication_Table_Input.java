package Assignment;


import java.util.Scanner;

public class Multiplication_Table_Input {



	
		
	
	
	public static void main(String[] args) 
	
	{
		
		// variable declaration
		Scanner obj = new Scanner(System.in);
		int number;
		
		//Read Data from user
		System.out.println("Enter the number to be multiplied");
		number = obj.nextInt();
		
		
		// Print output
		for(int i =1;i<=10;i++)
		System.out.println(number+"x"+i+"="+(number*i));

		// close object
		obj.close();
		
	}

}




