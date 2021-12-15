package Assignment;

public class nCr_nPr {

	public static int factorial (int n)
		
		{
			int i=1;
			int fact =1;
			for(i=1;i<=n;i++) 
				fact = fact*i;
			
			return fact;
		}

		public static int combination(int n, int r)
		
		{
			
			int result = factorial(n) / (factorial(r)*factorial(n-r));
					return result;
										
			
		}
	
	
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
System.out.println(factorial(5));
System.out.println(combination(5,3));
	}

}
