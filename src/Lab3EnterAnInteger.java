import java.util.Scanner;

public class Lab3EnterAnInteger {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char userInput = 'y';
		do {
		System.out.println("Please enter an interger between 1 and 100");

		int userNum = scan.nextInt();
	
		// if((x%2)==0)
		// even
		// if ((x%2!=0))
		// odd

		if ((userNum % 2 != 0)) {
			System.out.println("Odd");
		} else if ((userNum % 2 == 0 && userNum < 25)) {
			System.out.println("Even and less than 25");
		} else if ((userNum % 2 != 0 && userNum >= 26 && userNum < +60)) {
			System.out.println("Even");
		} else if ((userNum % 2 == 0 && userNum >= 60)) {
			System.out.println("Even");
		} else if ((userNum % 2 != 0 && userNum > 60)) {
			System.out.println("Odd and over 60.");
		}
		
		System.out.println("Would you like to continue?");
		userInput = scan.next().charAt(0);
		userInput = Character.toLowerCase(userInput);
		
		} while(userInput == 'y');
		System.out.println("goodbye");
		scan.close();
		

}
}