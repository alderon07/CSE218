package p2StudentBag;

public class Student {
	private String fName;
	private String lName;
	private double gpa;
	private String id;

	public Student(String fName, String lName, double gpa, String id) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.gpa = gpa;
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [fName=" + fName + ", lName=" + lName + ", gpa=" + gpa + ", id=" + id + "]";
	}

}
