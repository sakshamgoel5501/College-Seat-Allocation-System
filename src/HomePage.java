import java.io.FileNotFoundException;
import java.util.Scanner;

public class HomePage {

	public static void main(String[] args) throws FileNotFoundException {
		
		StudentInformation.storeInfo();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Press ‘I’ to see the information (like age,dob,phone no.,etc.) of the student");
		System.out.println("Press 'C' to see the available choices");
		System.out.println("Press 'A' to see the seat alloted to you");
		System.out.println("Press 'V' to see the vacant seats");
		
		char operation=scanner.next().charAt(0);
		
		scanner.close();
		
		switch(operation) {
		case 'I':StudentInformation.displayInfo();
			     break;
			
		case 'C':SeatMatrix.display();
		         break;
		         
		case 'A':SeatAllotment.displayAllottedSeat();
			     break;
			     
		case 'V':VacantSeats.showVacantSeats();
		         break;
			     
		default:System.out.println("Invalid key pressed !!!");
		}
	}

}
