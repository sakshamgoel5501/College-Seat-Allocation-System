import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SeatAllotment extends StudentInformation {
	
	public static void allot() throws FileNotFoundException {
		
		SeatMatrix.createSeatMatrix();
		
		Scanner scanner=new Scanner(new File("Choices.txt"));
		
		String rank="";
		String roll_no="";
		String college="";
		String branch="";
		int check=0;
		int i=1;
		int count=0;
		
		while(scanner.hasNextLine()) {
			count++;
			if(i==1) {
				check=0;
				rank=scanner.nextLine();
				i++;
			}
			
			roll_no=info.getRollNo(rank);
			
			college=scanner.nextLine();
			if(college=="") {
				i=1;
				continue;
			}
			
			branch=scanner.nextLine();
			
			if(check!=0)                       //means seat has already been allotted
				continue;
			
			try {
				if(Integer.parseInt(info.getSeatsInBranch(branch))>0 && check==0) {
					info.putAllotedSeat(roll_no,college+"\n"+branch);
					info.putSeatsInBranch(branch,""+(Integer.parseInt(info.getSeatsInBranch(branch))-1));
					check++;
					}
			}catch(NumberFormatException e) {
				System.out.println("Not a valid number !!!");
			}
		}
		
		if(count==0)
			System.out.println("FILE CONTAINING CHOICES OF STUDENTS IS EMPTY !!!");
		
		scanner.close();
	}
	
	
	public static void displayAllottedSeat() throws FileNotFoundException {
		allot();
		
		Scanner scanner=new Scanner(new File("Roll numbers.txt"));
		String roll_no="";
		
		while(scanner.hasNextLine()) {
			roll_no=scanner.nextLine();
			if(info.getName(roll_no)==null) {
				System.out.println("\nStudent with Roll Number "+roll_no+" not found !!!");
				continue;
			}
			
			if(info.getAllottedSeat(roll_no)==null)
				System.out.println("\nStudent with Roll number "+roll_no+" has not filled choices !!!");
			else {
				System.out.println("\nStudent with Roll number "+roll_no+" got->");
				System.out.println(info.getAllottedSeat(roll_no));
			}
		}
		
		scanner.close();
	}
}
