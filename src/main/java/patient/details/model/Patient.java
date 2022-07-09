package patient.details.model;

public class Patient {

	private int patientMRN;
	private String firstName;
	private String LastName;
	private String email;
	private int MobileNo;
	private String address;
	
	
	public Patient(int patientMRN, String firstName, String lastName, String email, int mobileNo, String address) {
		super();
		this.patientMRN = patientMRN;
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
		MobileNo = mobileNo;
		this.address = address;
	}
	public int getPatientMRN() {
		return patientMRN;
	}
	public void setPatientMRN(int patientMRN) {
		this.patientMRN = patientMRN;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String adress) {
		this.address = adress;
	}
	@Override
	public String toString() {
		return "Patient [MRN=" + patientMRN + ", firsrName=" + firstName + ", LastName=" + LastName + ", email=" + email
				+ ", MobileNo=" + MobileNo + ", adress=" + address + "]";
	}
	


}
