public class StudentBean {
	
	private int id;
	private String fname;
	private String lname;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public void displayStudentService(int id, String fname, String lname) {
		System.out.println("Student Id: " + id + "\nStudent Name: " + fname + " " + lname);
	}
	
}
