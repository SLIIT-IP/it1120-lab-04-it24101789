
import java.util.Scanner;

public class IT24101789Lab4Q2{
	public static void main(String[] args) {
		
			double examMarks;
			double labMarks;
			double examPercentage;
			double labPercentage;
			double finalExamMarks;
			double finalLabMarks;
			double finalMarks;
			
			
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter exam marks (Out of 100) : " );
			examMarks = input.nextDouble();
			
			if (examMarks<=100.0 && examMarks>=0.0) {
				
				System.out.print("Please enter Lab marks (Out of 100) : ");
				labMarks = input.nextDouble();
				
				if (labMarks <=100.0 && labMarks >= 0.0){
					
					System.out.print("Please enter the percentage given for the exam: ");
					examPercentage = input.nextDouble();
					
					System.out.print("Please enter the percentage given for the lab submission: ");
					labPercentage = input.nextDouble();
					
					if ((examPercentage+labPercentage)==100.0){
						
						finalExamMarks = (examMarks/100.0)*examPercentage;
						finalLabMarks = (labMarks/100.0)*labPercentage;
						
						finalMarks = finalExamMarks + finalLabMarks;
						
						System.out.println();
												
						System.out.print("Final Exam Marks : "+ finalMarks );
						
						System.out.println();													
					}
					else{
						System.out.print("The percentages must add up to 100. Terminating program. ");
						System.out.println();
					}
										
				}	
				else {
					System.out.print("Invalid input for exam marks. Terminating program. ");
					System.out.println();
				}
				
			}
			else {
				System.out.print("Invalid input for exam marks. Terminating program. ");
				System.out.println();
			}					
	}
}