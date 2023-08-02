import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SeatMatrix extends StudentInformation {
	
	public static void createSeatMatrix() throws FileNotFoundException {
		
		Scanner scanner=new Scanner(new File("Available choices.txt"));
		String college="";
		String branch="";
		int count=0;
		int i=1;
		String number_of_seats="";
		
		while(scanner.hasNextLine()) {
			count++;
			
			if(i==1) {
				college=scanner.nextLine();
				i++;
			}
			
			branch=scanner.nextLine();
			if(branch=="") {
				i=1;
				continue;
			}
				
			number_of_seats=scanner.nextLine();
				
			info.putSeatsInBranch(branch, number_of_seats);
			info.putBranchInCollege(branch, college);
		}
		
		scanner.close();
		
		if(count==0)
			System.out.println("FILE CONTAINING CHOICES AVAILABLE FOR STUDENTS IS EMPTY !!!");
	}
	
	
	public static void display() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("Available choices.txt"));
        while (scanner.hasNextLine()) 
        	System.out.println(scanner.nextLine());
	}
	
}
