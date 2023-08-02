import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VacantSeats extends StudentInformation {
	public static void showVacantSeats() throws FileNotFoundException {
		
		SeatAllotment.allot();
		Scanner scanner=new Scanner(new File("Available choices.txt"));
		
		String college="";
		String branch="";
		int count=0;
		int i=1;
		int number_of_seats=0;          //equal to 0 just for initialization
		int atleast_one=0;
		
		while(scanner.hasNextLine()) {
			count++;
			
			if(i==1) {
				college=scanner.nextLine();
				System.out.println("\n"+college);
				i++;
			}
			
			branch=scanner.nextLine();
			if(branch=="") {
				i=1;
				
				if(atleast_one==0)
					System.out.println("No vacant seat !!!");
				
				atleast_one=0;
				continue;
			}
			
			try {
				number_of_seats = Integer.parseInt(info.getSeatsInBranch(branch));
			}catch(NumberFormatException e){
				System.out.println("Not a valid number !!!");
			}
				
			scanner.nextLine();
			
			if(number_of_seats>0) {
				System.out.println(branch+"\n"+number_of_seats);
				atleast_one++;
			}
		}
		
		scanner.close();
		
		if(count==0)
			System.out.println("FILE CONTAINING CHOICES AVAILABLE FOR STUDENTS IS EMPTY !!!");
	}
}
