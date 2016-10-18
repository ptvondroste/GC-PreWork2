import java.util.Scanner;

public class TransposeNumber {

	public static void main(String[] args) {
		// Author P.Droste
		//Program to transpose or reverse user inputed number
		// program will only work with whole integers
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any 5 digit number excluding 0: ");
		int number = input.nextInt();
		System.out.println("Number Entered: " + number);
		
		int transpose1 = 0;
		while (number != 0) { // runs loop until number is = 0
			transpose1 = transpose1*10; // "indexing left" pushing number to the left
			transpose1 = transpose1 + number%10; // placing the remainder value as the reverse number sequence
			number = number/10; // "indexing right" removes rightmost digit then loops back
			
		}
		System.out.println("Transposed Number is: " + transpose1);
		
	/*	Ignore just modulus test
	 * int number2 = 897%10;
	 * System.out.println("modulus "+ number2);
		*/
	}

}
