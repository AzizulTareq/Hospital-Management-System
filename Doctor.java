
package project;

public class Doctor extends Staff{
    
    //Variable of Doctor class
    
    private String SpecialistField;
    private int    PatientsUnderCare;
    private String PatientRoomNumber;
    private String AssignedPatientName;
    private String AssignedPatientUniqueNumber;
            
    //Constructor for Doctor class     


    public Doctor(String UserName, int UserAge, String UserAddress, int UserContactNumber, 
            String StaffID, double StaffSalary, String StaffDesignation, String StaffRoom, String InitialRecruitmentDate,
              String SpecialistField,  String PatientRoomNumber, String AssignedPatientName, String AssignedPatientUniqueNumber ) {
       
        
        
        
        super(UserName, UserAge, UserAddress, UserContactNumber, StaffID, StaffSalary, StaffDesignation, StaffRoom, InitialRecruitmentDate);
        
         this.SpecialistField = SpecialistField;
       
        this.PatientRoomNumber = PatientRoomNumber;
        this.AssignedPatientName = AssignedPatientName;
        this.AssignedPatientUniqueNumber = AssignedPatientUniqueNumber;
    }
        
        
        
    
    
    
    //Getter methods for SpecialistField
    public String getSpecialistField(){
    
        return SpecialistField;
    }
    
    //Setter methods for SpecialistField
    public void setSpecialistField(String SetterString){
    
        this.SpecialistField = SetterString;
    }
    
    
   
    
   
    
    //Getter method for PatietnRoomNumber
    public String getPatientRoomNumber(){
    
        return PatientRoomNumber;
    }
    
    //Setter method for PatientRoomNumber
    public void setPatientRoomNumber(String SetterString){
    
        this.PatientRoomNumber = SetterString;
    }
    
    //Getter method for AssignedPatientName
    public String getAssignedPatientName(){
    
        return AssignedPatientName;
    }
    
    //Setter method for AssignedPatientName
    public void setAssignedPatientName(String SetterString){
    
        this.AssignedPatientName = SetterString;
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
