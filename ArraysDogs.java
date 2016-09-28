import java.util.Scanner;

public class ArraysDogs {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String dog;
		
		String[] values;
		
		values = new String[3];
		
		values[0] = "Boadicea";
		values[1] = "Archie";
		values[2] = "Tallulah";
		
		System.out.println("The names of our dogs are:");
		System.out.println( );
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		do {
			System.out.println("Enter the name of the best dog:");
			dog = input.nextLine();
			
			switch (dog){
			
			case ("Boadicea"):
				System.out.println("Faking idiot wrong answer.");
			
			case ("Archie"):
				System.out.println("U dun good kid.");
			
			case ("Tallulah"):
				System.out.println("Close but no cigarette.");
			
			default:
				System.out.println("I even told you what their names were.  Try again.");
			
			}
			
		}
		while (dog != values[1]);
		
		input.close();
	}
}
