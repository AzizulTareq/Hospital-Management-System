
package project;


public class Patient extends People {
    
    // Variable of Patient class
    private String DateOfEntry;
    private String TypeOfTest;
    private String AssignedDoctor;
    private String AssignedNurse;
    private String PatientUniqueNumber;
    

    
     //Constructor for Patient class
    public Patient(String UserName, int UserAge, String UserAddress, int UserContactNumber, 
            String DateOfEntry, String TypeOfTest, String AssignedDoctor, String AssignedNurse, String PatientUniqueNumber) {
        
        super(UserName, UserAge, UserAddress, UserContactNumber);
        
        this.DateOfEntry = DateOfEntry;
        this.TypeOfTest = TypeOfTest;
        this.AssignedDoctor = AssignedDoctor;
        this.AssignedNurse = AssignedNurse;
        this.PatientUniqueNumber  = PatientUniqueNumber;  
    }
    
    
    
    
    
    
    //Getter method for DateOfEntry
    public String getDateOfEntry(){
    
        return DateOfEntry;
    }
    
    //Setter method for DateOfEntry
    public void setDateOfEntry(String SetterString){
    
        this.DateOfEntry = SetterString;
    }
    
    
    
    //Getter method for TypeOfTest
    public String getTypeOfTest(){
    
        return TypeOfTest;
    }
    
    
    //Setter method for TypeOfTest
    public void setTypeOfTest(String SetterString){
    
        this.TypeOfTest = SetterString;
    }

    
    //Getter method for AssignedDoctor
    public String getAssignedDoctor(){
    
        return AssignedDoctor;
    }
    
    //Setter method for AssignedDoctor
    public void setAssignedDoctor(String SetterString){
    
        this.AssignedDoctor  = SetterString;
    }
    
    
    //Getter method for AssignedNurse
    public String getAssignedNurse(){
    
        return AssignedNurse;
    }
    
    //Setter method for AssignedNurse
    public void setAssignedNurse(String SetterString){
    
        this.AssignedNurse = SetterString;
    }
    
    //Getter method for PatientUniqueNumber
    public String getPatientUniqueNumber(){
    
        return PatientUniqueNumber;
    }
    
    //Setter method for PatientUniqueNumber
    public void setPatientUniqueNumber(String SetterString){
    
        this.PatientUniqueNumber = SetterString;
    }
    
    
}
