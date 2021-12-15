package Assignment;


public class Factorial

{
	
	public static int factorial (int n)
	
	{
		int i=1;
		int fact =1;
		for(i=1;i<=n;i++) 
			fact = fact*i;
		
		return fact;
	}

	public static void main(String[] args) 
	
	{
		System.out.println(factorial(5));

	
		
		
	}

}
