import java.util.Scanner;

public class IT24101789Lab4Q3{
	public static void main(String[] args) {
		
		String result;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		result = (num > 0) ? "The Number is Positive":
		         (num < 0) ? "The Number is Negative":
				 "The Number is Zero";
				 
	    System.out.println(result);		
    }	
}	
