package Day_1;

import java.util.Scanner;

public class Main {
	static
	{
		init();
	}
	public static void init()
	{
		System.out.println("The method is called from staic block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("=================");

		String myInput;
		Scanner scanner = new Scanner(System.in); 		
		
		Distributer dis = new Distributer();
		
		while(true)
		{
			myInput = scanner.nextLine();
			switch(myInput)
			{
			case "encaptulation": 
				dis.encaptulation();
				break;
			case "polymorphism":
				dis.polymorphism();
				break;
			case "abstract":  
				dis.abstractandInterface();
				break;
			case "inheritance":
				dis.inheritance();
				break;
			case "association":
				dis.association();
				break;
			}
			System.out.println("=================");
			if(myInput.compareTo("0")!= 0)
			{
				System.out.println("Input 0 to close the program");
			}
			
			if(myInput.compareTo("0") == 0)
			{
				System.out.println("Program Closed");
				break;
			}
			
		}
	}

}
