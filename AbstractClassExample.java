package Assignment;

import java.util.Scanner;


 abstract class Emailchecklist 
 {
	 public abstract void emailto();
	 public abstract void writemsg();
	 public abstract void sendmsg();
	 public abstract void printmsg();
 }

 class Emailfn extends Emailchecklist
{
	Scanner obj = new Scanner(System.in); 
	String emailadd;
	String message;	
		
	 public void emailto()
	   
	 {
		
		System.out.println("Enter Email Address: ");
		this.emailadd = obj.next();
		boolean isFoundat = emailadd.indexOf("@") !=-1? true: false;
		boolean isFounddot = emailadd.indexOf(".") !=-1? true: false;
		while (isFoundat == false ||  isFounddot == false)
		{
			System.out.println("Incorrect Email, re-enter Email");
			emailadd = obj.next();
			isFoundat = emailadd.indexOf("@") !=-1? true: false;
			isFounddot = emailadd.indexOf(".") !=-1? true: false;
		}
		
	 }
	
		 public void writemsg()
		 {
			
			 System.out.println("Enter message of a minimum of 50 characters: "); 
			 this.message = obj.nextLine();
			 message = obj.nextLine();
				message.length();
				
			 while (message.length() < 50)
			 { System.out.println("Msg Less than 50 characters, Enter message of at least 50 characters: ");
				message = obj.nextLine();
				message.length();
				
			 }
			 System.out.println("\n");
		 }
		
		 public void sendmsg()
		 {
			
			 System.out.println("Sending Email "); 
			 System.out.println("Email Sent "); 
			 System.out.println("\n"); 
			 
		 }
	
		 public void printmsg()
		 {
			
			 System.out.println("Recepient:" + emailadd ); 
			 System.out.println("\n"); 
			 System.out.println("Message:" + "\n" + message);
			 
		 }
}
// Home work for 3rd and 4 th lesson 
public class AbstractClassExample extends Emailfn {

	
	public static void main(String[] args) {
		
	    Emailfn email = new AbstractClassExample(); 
	    email.emailto();
	    email.writemsg(); 
	    email.sendmsg();
	    email.printmsg();
	    
	   
	
	
	  }

	
}
