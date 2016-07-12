import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// prompt user to input an integer 1-10
		Scanner input = new Scanner(System.in);
		String restart ="";
		
		do{
		long fact = 1;
		System.out.println("enter a positive integer 1-10");
		long userInt = input.nextLong();
		// display the factorial of the number entered by the user
		for (long i = 1; i <= userInt; i++) {
			fact = fact * userInt;}
			System.out.println("Factorial of " + userInt + " is : " + fact);

			// prompt the user to continue
			System.out.println("would you like to continue? Y or N");
			String garbage = input.nextLine();
			restart = input.nextLine();
		} while (restart.equalsIgnoreCase("y"));
		System.out.println("have a good day! bye");
		
			
			
			
			
			
		}

	}


