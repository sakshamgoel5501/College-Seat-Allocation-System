import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentInformation {

	static HashMaps info=new HashMaps();
	
	public static void storeInfo() throws FileNotFoundException {
				
		Scanner scanner=new Scanner(new File("Information.txt"));        //Information.txt contains information of the students who gave exam
		
		String roll_no="";
        String name="";
        String phone="";
        String dob="";
        String rank="";
        String address="";
        
        int count=0;
        
        while(scanner.hasNextLine()) {
        
        count++;
        roll_no=scanner.nextLine();
        name=scanner.nextLine();
        phone=scanner.nextLine();
        dob=scanner.nextLine();
        rank=scanner.nextLine();
        address=scanner.nextLine();
       
        info.putRollNo(rank, roll_no);
        info.putName(roll_no, name);
        info.putPhone(roll_no, phone);
        info.putDOB(roll_no, dob);
        info.putRank(roll_no, rank);
        info.putAddress(roll_no, address);
        
        }
        
        scanner.close();
        
        if(count==0) {
        	System.out.println("NO INFORMATION IN THE INPUT FILE !!!");
        	return;
        }
    }
	
	
	
	
	public static void displayInfo() throws FileNotFoundException {
		Scanner scanner=new Scanner(new File("Roll numbers.txt"));        //Roll numbers.txt contains the roll numbers of students of whom information we want to get 
		String roll_no="";
		
		while(scanner.hasNextLine()) {
		roll_no=scanner.nextLine();
		
		if(info.getName(roll_no)==null) {
			System.out.println("\nStudent with Roll Number "+roll_no+" not found !!!\n");
			continue;
		}
		System.out.println("Name : "+info.getName(roll_no));
        System.out.println("Roll no. : "+roll_no);
        System.out.println("Phone number : "+info.getPhone(roll_no));
        System.out.println("Date of Birth : "+info.getDOB(roll_no));
        System.out.println("Rank : "+info.getRank(roll_no));
        System.out.println("Address : "+info.getAddress(roll_no));
        System.out.println("\n");
		}
	}
}
