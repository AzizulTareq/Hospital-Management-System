
package project;


public class Staff extends People{
    
    
    //Variables of Staff class
    
    protected String StaffID;
    protected double StaffSalary;
    protected String StaffDesignation;
    protected String StaffRoom;
    protected String InitialRecruitmentDate;

    //Constructor for Staff class
    public Staff(String UserName, int UserAge, String UserAddress, int UserContactNumber,
               String StaffID, double StaffSalary, String StaffDesignation, String StaffRoom, String InitialRecruitmentDate) {
        
        
        
        super(UserName, UserAge, UserAddress, UserContactNumber);
        
        this.InitialRecruitmentDate = InitialRecruitmentDate;
        this.StaffDesignation = StaffDesignation;
        this.StaffID = StaffID;
        this.StaffSalary = StaffSalary;
        this.StaffRoom  = StaffRoom;
    }
    
    
    
    
    
    //Getter method for StaffID
    public String getStaffID(){
    
        return StaffID;
    }
    
    //Setter method for StaffID
    public void setStaffID(String SetterString){
    
        this.StaffID = SetterString;
    }
    
    //Getter method for StaffSalary
    public double getStaffSalary(){
    
        return StaffSalary;
    }
    
    //Setter method for StaffSalary
    public void setStaffSalary(double SetterDouble){
    
        this.StaffSalary = SetterDouble;
    }
        
    //Getter method for StaffDesignation
    public String getStaffDesignation(){
    
        return StaffDesignation;
    }
    
    //Setter method for StaffDesignation
    public void setStaffDesignation(String SetterString){
    
        this.StaffDesignation = SetterString;
    }
    
    //Getter method for InitialRecruitmentDate
    public String getInitialRecruitmentDate(){
    
        return InitialRecruitmentDate;
    }
    
    //Setter method for InitialRecruitmentDate
    public void setInitialRecruitmentDate(String SetterString){
    
        this.InitialRecruitmentDate = SetterString;
    }
    
    //Getter method for StaffRoom
    public String getStaffRoom(){
    
        return StaffRoom;
    }
    
    //Setter method for StaffRoom
    public void setStaffRoom(String SetterString){
    
        this.StaffRoom = SetterString;
    }
   
    
}
