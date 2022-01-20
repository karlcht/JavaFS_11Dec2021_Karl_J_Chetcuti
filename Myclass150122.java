package Assignment;

/*
import java.util.InputMismatchException;
import java.util.Scanner;

public class Myclass150122 {

	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);	


	
	try { 
		

		float a,b,c; 
	
		System.out.println("Enter first no:");
		a = obj.nextFloat();
		System.out.println("Enter second no: ");
		b = obj.nextFloat();
		c = a/b;
		System.out.println("Answer: " +c);
	
	
		}
	
	catch(InputMismatchException ex)
		{
			System.out.println("Please double check and enter only digits");
			System.out.println(ex.getStackTrace());
			//ex.printStackTrace();   //another example
		}

	catch(ArithmeticException ex)
	{
		System.out.println("Cannot Divide by 0, please retry");
	
	}
	
	// super exception - declaring only one exception that  handles all exception or put at the last and not first - else if first it handles all exceptions  
	catch(Exception ex)
	{
		System.out.println("Some error occured. Please call admin");
	}
	
	// usually done to close the resources - will run as the last part of any program 
	finally {
		obj.nextLine();
		obj.nextLine();
		obj.close();
	}
		
		
		
		
		}

}
*/

//---------------------------------------------------------------

// Learning Linked List 

import java.util.InputMismatchException;
import java.util.Scanner;

/*
class Node
{
	public  String  data; 
	public Node next;  // to link each different nodes - like a pointer (not a variable) - data type of node is class - class is node 
	
	public void printData() 
	{
		System.out.println(data);
	}

}

class SingleLinkedList 
{
	public Node head;
	
	public boolean isEmpty()
	{
		return (head==null);
	}
	
	
	public void insertFirst(String data)
	{
		
		// create a new node for new data
		
	Node n = new Node();
	
	// store data in new node 
	n.data = data;
	// assign the next of this node to head 
	n.next = head;
	// make the new node to head 
	head = n;
	
		
		
	}
	
	public Node deleteFirst()
	{
		
		head = head.next;
		return head ;
		
	}
	
	public void printElements()
	{
		Node current = head;  // temporary variable current 
		while(current != null)
		{
			current.printData();
			current = current.next;
			
		}
		
		
	}
		
	public void insertLast(String data)
	{
		
		Node n = new Node();
		n.next = null;
		n.data = data; 
		
		
		//Loop Through
		
		if( head ==null)
			head = n;
		else
		{
			
		Node current = head;
			
			while(current != null)
			{
				
				current = current.next;
				
			}
			
			current.next = n;
		
		}
		
	}
		
	
}

public class Myclass150122 {

	
	public static void main(String[] args) {
		
		SingleLinkedList sl = new SingleLinkedList();
		
		sl.insertLast("Infosys");
		sl.insertFirst("Cognisant");
		
		
		if(sl.isEmpty())
			System.out.println("List is empty");
		else
			System.out.println("List is NOT empty");
		
	sl.deleteFirst();
	sl.printElements();
		
	}
}
*/ 

//---------------------------------------------------------------

// Learning Stack 


class MyStack 
{
	int MAX = 20;
	int top = -1;
	int data[] = new int[MAX];
	
	public void push(int d)
	{
		data[top+1] = d;
		top = top+1; 
		
	}
	
	public  int pop()
	{
		int temp = data[top];
		top = top-1;
		return temp;
		
	}
	
	public void printValues()
	{
		for(int i =0; i<=top;i++)
			System.out.println(data[i]);
		
	}
	
	public boolean isEmpty()
	{
		return(top ==-1);
			
	}
	
	public int size()
	{
		return top +1;
		
	}
	
	public int peek()
	
	{
		return data[top+1];
	}
	
}
public class Myclass150122 {

	
	public static void main(String[] args) {
		
	
		MyStack ms = new MyStack(); 
		
		ms.push(50);
		ms.push(60);
		
		
		System.out.println(ms.size());
		
		ms.printValues();
		if(ms.isEmpty())
			System.out.println("is empty");
		else 
			System.out.println("not empty ");
		
		System.out.println(ms.pop());
		System.out.println(ms.peek());
		
		
		ms.printValues();
		ms.pop();
		
		if(ms.isEmpty())
			System.out.println("is empty");
		else 
			System.out.println("not empty ");
		
		System.out.println(ms.size());
		
		
		
	}
	
}

	