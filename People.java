
package project;


public class People {
    
    
    //Variables of People class
    protected String UserName;
    protected int UserAge;
    protected String UserAddress;
    protected int UserContactNumber;
    
    
    
    //Constructor for People class
    public People(String UserName , int UserAge , String UserAddress, int UserContactNumber){
    
        this.UserName = UserName;
        this.UserAddress = UserAddress;
        this.UserAge = UserAge;
        this.UserContactNumber = UserContactNumber;
    }
    
    
    //Getter method for UserName
    public String getUserName(){
    
        return UserName;
    }
    
    //Setter method for UserName
    public void setUserName(String SetterString){
    
        this.UserName = SetterString;
    }
    
    
    //Getter method for UserAddress
    public String getUserAddress(){
    
        return UserAddress;
    }
    
    //Setter method for UserAddress
    public void setUserAddress(String SetterString){
    
        this.UserAddress = SetterString;
    }
    
    
    //Getter method for UserAge
    public int getUserAge(){
    
        return UserAge;
    }
    
    //Setter method for UserAge
    public void setUserAge(int SetterInt){
    
        this.UserAge = SetterInt;
    }
    
    //Getter method for UserContactNumber
    public int getUserContactNumber(){
    
        return UserContactNumber;
    }
    
    //Setter method for UserContaceNumber
    public void setUserContactNumber(int SetterInt){
    
        this.UserContactNumber = SetterInt;
    }
}
