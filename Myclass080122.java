package Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Myclass080122 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//File Reader 
		
					/*
			File f = new File("C:\\Users\\Karl Chetcuti\\eclipse File Handling Example\\Mydetails.txt");
			System.out.println(f.getName());
			System.out.println(f.getPath());
			System.out.println(f.length());
			System.out.println(f.exists());
			
			
			
			
			
			FileReader fr = new FileReader(f);
			int i = fr.read();
			while (i!=-1)
			{
				System.out.print((char)i);
				i = fr.read();
			}
			
			fr.close();
			
			*/
		
		// Buffer Reader
		
		/*
		
			File f = new File("C:\\Users\\Karl Chetcuti\\eclipse File Handling Example\\Mydetails.txt");
			FileReader fr = new FileReader(f);
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line!= null) {
				
				System.out.println(line);
				line =br.readLine();
			}
	 
			br.close();

	*/
		
	/*	
		// Read all Lines - If file to huge variable may not hold that size 
		
		var result = Files.readAllLines(Paths.get("C:\\Users\\Karl Chetcuti\\eclipse File Handling Example\\Mydetails.txt"));
		
		for(var s:result)
			System.out.println(s);
		
	*/ 
	
		/*
			String name;
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter name");
			name = obj.nextLine();
			System.out.println("Your name is: " +name);
			
		FileWriter fw = new FileWriter("C:\\Users\\Karl Chetcuti\\eclipse File Handling Example\\Name.txt", true);
		fw.write(name + "\n");
		fw.close();
		System.out.println("Written into File");
		obj.close();


*/
		
/* 
 
		int score=0, ans; 
		String name; 
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = obj.nextLine();
		
		System.out.println("Q1. Biggest land animal: ");
		System.out.println("1. Elephent  2. Giraffe  3. Rhino  4. Hippo");
		System.out.println("Enter answer: ");
		ans = obj.nextInt();
		if (ans == 1)
			score += 20;
		
		System.out.println("Q2. Biggest Sea animal: ");
		System.out.println("1. Sea Horse  2. Blue Whale  3. Shark  4. Hippo");
		System.out.println("Enter answer: ");
		ans = obj.nextInt();
		if (ans == 2)
			score += 20;
		
		System.out.println("Q3. Fastest Bird: ");
		System.out.println("1. Eagle  2. Parrot  3. Falcon  4. Canary");
		System.out.println("Enter answer: ");
		ans = obj.nextInt();
		if (ans == 3)
			score += 20;
		
		System.out.println("Q4. Fastest Land Animal: ");
		System.out.println("1. Elephent  2. Giraffe  3. Cheetah  4. Hippo");
		System.out.println("Enter answer: ");
		ans = obj.nextInt();
		if (ans == 3)
			score += 20;
		
		System.out.println("Q5. Which is pet animal: ");
		System.out.println("1. Elephent  2. Dog  3. Cheetah  4. Hippo");
		System.out.println("Enter answer: ");
		ans = obj.nextInt();
		if (ans == 2)
			score += 20;
		
		if(score>=60)
			System.out.println("Congratulations " +name + ", you got " +score);
		else
			System.out.println("Sorry, " +name+", you got "+score);
			
		FileWriter fw = new FileWriter("C:\\Users\\Karl Chetcuti\\eclipse File Handling Example\\Scores.txt",true);
		fw.write(name + "," +score + "\n");
		System.out.println("Your score is stored. Thank you for taking quiz.");
		fw.close();
		
		obj.close();
		
		*/
		
		
		/*
		
		String name;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter student name: ");
		name=obj.nextLine();
		boolean isFound=false;
		
		var result = Files.readAllLines(Paths.get("C:\\Users\\Karl Chetcuti\\eclipse File Handling Example\\Scores.txt"));
		for (var r:result)
		{
			var data = r.split(",");
			if (name.equalsIgnoreCase(data[0]))
			{
			System.out.println("Score="+data[1]);
			isFound = true;
			break;
			
		}
		
    }
	if (isFound == false)
		System.out.println("Name not found.");
	obj.close();
	
	
		 */

		
		
		
		}
		
		
    	
}

