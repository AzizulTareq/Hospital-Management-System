
package project;


public class Nurse extends Staff{
    
    
    //Variable for Nurse class
    private String AssignedPatient;
    private String AssignedDoctor;
    private int PatientsUnderCare;
    private String PatientRoomNumber;
    private String AssignedPatientUniqueNumber;
    
    //Constructor for Nurse class

    public Nurse(String UserName, int UserAge, String UserAddress, int UserContactNumber, 
                    String StaffID, double StaffSalary, String StaffDesignation, String StaffRoom, String InitialRecruitmentDate,
                        String AssignedPatient,String AssignedDoctor,  String PatientRoomNumber , String AssignedPatientUniqueNumber) {
        
        
        super(UserName, UserAge, UserAddress, UserContactNumber, StaffID, StaffSalary, StaffDesignation, StaffRoom, InitialRecruitmentDate);
        
        this.AssignedPatient = AssignedPatient;
        this.AssignedDoctor = AssignedDoctor;
        this.PatientRoomNumber = PatientRoomNumber;
        this.AssignedPatientUniqueNumber = AssignedPatientUniqueNumber;
    }
    
    
    //Getter method for AssignedPatient 
    public String getAssignedPatient(){
    
        return AssignedPatient;
    }
    
    //Setter method for AssignedPatient
    public void setAssignedPatient(String SetterString){
    
        this.AssignedPatient = SetterString;
    }
    
    
    //Getter method for AssignedDoctor
    public String getAssignedDoctor(){
    
        return AssignedDoctor;
    }
    
    //Setter method for AssignedDoctor
    public void setAssignedDoctor(String SetterString){
    
        this.AssignedDoctor = SetterString;
    }
    
    
    
    
    //Getter method for PatientRoomNumber
    public String getPatientRoomNumber(){
    
        return PatientRoomNumber;
    }
    
    //Setter method for PatientRoomNumber
    public void setPatientRoomNumber(String SetterString){
    
        this.PatientRoomNumber = SetterString;
    }
    
    //Getter method for AssignedPatientUniqueNumber
    public String getAssignedPatientUniqueNumber(){
    
        return AssignedPatientUniqueNumber;
    }
    
    //Setter method for AssignedPatientUniqueNumber
    public void setAssignedPatientUniqueNumber(String SetterString){
    
        this.AssignedPatientUniqueNumber = SetterString;
    }
}
