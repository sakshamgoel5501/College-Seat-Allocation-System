import java.util.HashMap;

public class HashMaps {

	private HashMap<String , String> name=new HashMap<>();
	private HashMap<String , String> phone=new HashMap<>();
	private HashMap<String , String> dob=new HashMap<>();
	private HashMap<String , String> rank=new HashMap<>();
	private HashMap<String , String> address=new HashMap<>();
	private HashMap<String , String> alloted_seat=new HashMap<>();
	private HashMap<String , String> roll_no=new HashMap<>();
	private HashMap<String , String> branch_numberOfSeats=new HashMap<>();
	private HashMap<String , String> branch_college=new HashMap<>();
	
	public String getName(String roll_no){
		return this.name.get(roll_no);
	}
	
	public String getPhone(String roll_no){
		return this.phone.get(roll_no);
	}
	
	public String getDOB(String roll_no){
		return this.dob.get(roll_no);
	}
	
	public String getRank(String roll_no){
		return this.rank.get(roll_no);
	}
	
	public String getAddress(String roll_no){
		return this.address.get(roll_no);
	}
	
	public String getAllottedSeat(String roll_no) {
		return this.alloted_seat.get(roll_no);
	}
	
	public String getRollNo(String rank) {
		return this.roll_no.get(rank);
	}
	
	public String getSeatsInBranch(String branch) {
		return this.branch_numberOfSeats.get(branch);
	}
	
	public String getCollege(String branch) {
		return this.branch_college.get(branch);
	}
	
	
	
	
	
	
	public void putName(String roll_no , String name) {
		this.name.put(roll_no, name);
	}
	
	public void putPhone(String roll_no , String phone) {
		this.phone.put(roll_no, phone);
	}
	
	public void putDOB(String roll_no , String dob) {
		this.dob.put(roll_no, dob);
	}
	
	public void putRank(String roll_no , String rank) {
		this.rank.put(roll_no, rank);
	}
	
	public void putAddress(String roll_no , String address) {
		this.address.put(roll_no, address);
	}
	
	public void putAllotedSeat(String roll_no , String alloted_seat) {
		this.alloted_seat.put(roll_no, alloted_seat);
	}
	
	public void putRollNo(String rank , String roll_no) {
		this.roll_no.put(rank, roll_no);
	}
	
	public void putSeatsInBranch(String branch , String Number_of_seats) {
		this.branch_numberOfSeats.put(branch, Number_of_seats);
	}
	
	public void putBranchInCollege(String branch , String college) {
		this.branch_college.put(branch, college);
	}
}
