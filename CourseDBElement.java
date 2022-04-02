
public class CourseDBElement implements Comparable {

	String id="";
	
	public String ID() {
		return id;
		
	}
	
	public void saveID(String id) {
		this.id = id;
	}
	
	public int getCredits() {
		return numCredits;
		
	}
	
	public void setCredits(int credits) {
		this.numCredits = credits;
		
	}
	
	public String getRoomNum() {
		return roomNum;
		
	}
	
	public void saveRoomNum(String roomNumber) {
		this.roomNum = roomNumber;
		
	}
	
	public String getInstructor() {
		return instructor;
		
	}
	
	public void saveInstructor(String instructor) {
		this.instructor = instructor;
		
	}
	
	int crn;
	int numCredits;
	String roomNum="";
	String instructor="";
	
	/**
	 * @param id
	 * @param crn
	 * @param numCredits
	 * @param roomNumber
	 * @param instructor
	 */
	
	public CourseDBElement(String id, int crn, int numCredits, String roomNumber, String instructor) {
		this.id = id;
		this.crn = crn;
		this.numCredits = numCredits;
		this.roomNum = roomNumber;
		this.instructor = instructor;
		
	}

	public CourseDBElement() {
		
		this("",0,0,"","");
		
	}

	@Override
	public int compareTo(CourseDBElement element) {
		return this.crn-element.crn;
		
	}

	@Override
	public int hashCode(){
		String temp = Integer.toString(this.crn); 
		
		int hashrate = temp.hashCode();
		
		return hashrate;
		
	}
	
	public void placeCRN(int crn) {
		
		this.crn=crn;	
		
	}

	public int getCRN() {
		
		return this.crn;
		
	}

	@Override
	public String toString() {
		
		return "Course:" + id + " CRN:" + crn + " Credits:" + numCredits + " Instructor:" + instructor + " Room:" + roomNum;
		
	}
	
 }