package project;

public class IT extends Staff {
	
	 //Variable for IT class
	
	
	private int NumberOfComputer;
	private String StaffEmailAddress;
	private String PatientEmailAddress;
	private String DoctorEmailAddress;
	private int CurrentCashInHand;
	
	 //Constructor for IT class
	
	public IT(String UserName, int UserAge, String UserAddress, int UserContactNumber, String StaffID,
			double StaffSalary, String StaffDesignation, String StaffRoom, String InitialRecruitmentDate,
                        int NumberOfComputer,String StaffEmailAddress,String PatientEmailAddress,String DoctorEmailAddress,int CurrentCashInHand ){
		
		
		super(UserName, UserAge, UserAddress, UserContactNumber, StaffID, StaffSalary, StaffDesignation, StaffRoom,
				InitialRecruitmentDate);
		
		this.NumberOfComputer= NumberOfComputer;
		this.StaffEmailAddress= StaffEmailAddress;
		this.PatientEmailAddress= PatientEmailAddress;
		this.DoctorEmailAddress= DoctorEmailAddress;
		this.CurrentCashInHand= CurrentCashInHand;
	}

	public int getNumberOfComputer() {
		return NumberOfComputer;
	}

	public void setNumberOfComputer(int NumberOfComputer) {
		this.NumberOfComputer = NumberOfComputer;
	}

	public String getStaffEmailAddress() {
		return StaffEmailAddress;
	}

	public void setStaffEmailAddress(String StaffEmailAddress) {
		this.StaffEmailAddress = StaffEmailAddress;
	}

	public String getPatientEmailAddress() {
		return PatientEmailAddress;
	}

	public void setPatientEmailAddress(String patientEmailAddress) {
		this.PatientEmailAddress = patientEmailAddress;
	}

	public String getDoctorEmailAddress() {
		return DoctorEmailAddress;
	}

	public void setDoctorEmailAddress(String DoctorEmailAddress) {
		this.DoctorEmailAddress = DoctorEmailAddress;
	}

	public int getCurrentCashInHand() {
		return CurrentCashInHand;
	}

	public void setCurrentCashInHand(int CurrentCashInHand) {
		this.CurrentCashInHand = CurrentCashInHand;
	}
	
		

}
