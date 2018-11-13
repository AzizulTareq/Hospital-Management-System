
package project;

import java.util.Scanner;

public class Hospital {
    
    
    
    public static Scanner input = new Scanner(System.in);
    public static final int PatientNumber = 100;
    public static final int DoctorNumber = 50;
    public static final int NurseNumber = 60;
    public static final int ITNumber = 10;
    
    public static Patient[] patients = new Patient[PatientNumber];
    public static Doctor[] doctors = new Doctor[DoctorNumber];
    public static Nurse[] nurses = new Nurse[NurseNumber];
    public static IT[] IT = new IT[ITNumber];

    
    
    
    
    
    
    public static void main(String[] args){

         int ArrayCounter = 0;
         
         
         //default inputs for patient
         while(ArrayCounter<PatientNumber){
         
             patients[ArrayCounter] = new Patient("Name",100,"Address",1001,"01/01/1000","normal","doctor","nurse","123456");
             ArrayCounter++;
         }
         patients[0] = new Patient("Tester",10,"address",1001,"Date","normal","doctor","nurse","patient");
         
         
         
         
         
         
         
         
         //default inputs for doctor 
         ArrayCounter = 0;
         while(ArrayCounter<DoctorNumber){
         
             doctors[ArrayCounter] = new Doctor("Name",100,"Address",1001,"StaffID",1000.1,"cardiologist","StaffRoom","Date",
                     "Cardiologist","PatientsRoomNumber one","PatietnOne PatientTwo","UniqueNumberOne UniqueNumberTwo");
             ArrayCounter++;
         }
         doctors[0].setUserName("Tester");
         doctors[0].setStaffID("doctor");
         
         
         
         
         
         
         
         
         //default inputs for nurses
         ArrayCounter = 0;
         while(ArrayCounter<NurseNumber){
         
             nurses[ArrayCounter] = new Nurse("Name",100,"Address",1001,"StaffID",1000.1,"Nurse","StaffRoom","01/01/1000","PatientNumberOne","doctor","PatientRoomNumber","PatientUnique");
             ArrayCounter++;
         }
         
         nurses[0].setUserName("Tester");
         nurses[0].setStaffID("nurse");
        
         
         
         
         
         
         //default inputs for IT
         ArrayCounter = 0;
        while(ArrayCounter<ITNumber){
         
             IT[ArrayCounter] = new IT("Name",100,"Address",1001,"StaffID",1000.1,"Nurse","StaffRoom","01/01/1000",60,"StaffEmail@email.com","PatientEmail@email.com","DoctorEmail@email.com",600);
             ArrayCounter++;
         } 
        
        
        IT[0].setUserName("Tester");
         IT[0].setStaffID("it");
        
        
        //Main menu method for Users is called.
        SignInSignUp();                             
        
        
    }
    
    //For users to Sign In or Sign up 
    public static void SignInSignUp(){
    
        
        
        int UserSelection;
        System.out.println("\t\t\t\t\tWELCOME\t\t\t");
        System.out.println("\n\t\t\t\t1 SIGN IN FOR PATIENTS");
        System.out.println("\t\t\t\t2 SIGN IN FOR STAFF");
        System.out.println("\t\t\t\t3 SIGN UP");
        System.out.println("\t\t\t\t4 EXIT");
        System.out.println("\n\n\n\n");
        
        
        
        
       UserSelection = input.nextInt();
        
        
        
        
        
        //Swtich for Users to select menu option
        switch(UserSelection){                    
        
            case 1 : SignInForPatients(); 
                     break;
            case 2 : SignInForStaff();
                    break;
            case 3 : SignUp();    
                    break;
            case 4 : Exit();
                    break;
            default : System.out.println("Wrong selection. Try again");
                        SignInSignUp();
                        break;
                       
        }
    }
    
    public static void SignInForPatients(){
                                    
        
         String[] UsernameStringArray = new  String[PatientNumber];
        String[] PasswordStringArray = new String[PatientNumber];
        
                                        

        int CounterArray;  String  SignInUsername ; String SignInPassword; int flag = 0;
        for(CounterArray = 0 ;CounterArray<PatientNumber;CounterArray++){
        
            UsernameStringArray[CounterArray] = patients[CounterArray].getUserName();
            PasswordStringArray[CounterArray] = patients[CounterArray].getPatientUniqueNumber();
        }
        
        UsernameStringArray[0] = patients[0].getUserName();
        PasswordStringArray[0] = patients[0].getPatientUniqueNumber();
        
        System.out.println("\t\t\tENTER YOUR USERNAME:");
        SignInUsername = input.next();
        System.out.println("\t\t\tENTER YOUR UNIQUE NUMBER: ");
        SignInPassword = input.next();
        
        CounterArray = 0;
        while(CounterArray<PatientNumber){
        
            
            if((UsernameStringArray[CounterArray].compareTo(SignInUsername) == 0) && (PasswordStringArray[CounterArray].compareTo(SignInPassword) == 0)){
            
                
                System.out.println("\n\n\n\t\t\tYOU HAVE ENTERED CORRECTLY");
                flag = -1;
                MainDashboardForPatient(CounterArray);
                break;
            }
            
            CounterArray++;
        }
        if(flag == 0){
        
            System.out.println("\n\n\n\t\t\tWRONG USERNAME OR PASSWORD TRY AGAIN");
            System.out.println("\n\n\n\n");
            SignInSignUp();
        }
        
        
        
    }
    
    
    
    public static void SignInForStaff(){
    
        
        
        
         String[]  DoctorUsernameStringArray = new String[DoctorNumber];
        String[] DoctorPasswordStringArray = new String[DoctorNumber];
        
        String[] NurseUsernameStringArray = new String[NurseNumber];
        String[] NursePasswordStringArray = new String[NurseNumber];
        
        
        String[] ITUsernameStringArray = new String[ITNumber];
        String[] ITPasswordStringArray = new String[ITNumber];
        
        
        
        int CounterArray; String SignInUsername ; String SignInPassword; int flag = 0;
        
        
        
        for(CounterArray = 0 ;CounterArray<DoctorNumber;CounterArray++){
        
            DoctorUsernameStringArray[CounterArray] = doctors[CounterArray].getUserName();
            DoctorPasswordStringArray[CounterArray] = doctors[CounterArray].getStaffID();
        }
        
        for(CounterArray = 0 ;CounterArray<NurseNumber;CounterArray++){
        
            NurseUsernameStringArray[CounterArray] = nurses[CounterArray].getUserName();
            NursePasswordStringArray[CounterArray] = nurses[CounterArray].getStaffID();
        }
        
        for(CounterArray = 0 ;CounterArray<ITNumber;CounterArray++){
        
            ITUsernameStringArray[CounterArray] = IT[CounterArray].getUserName();
            ITPasswordStringArray[CounterArray] = IT[CounterArray].getStaffID();
        }
        
        
        
        
        
        
        
        
        System.out.println("\t\t\tENTER YOUR USERNAME: ");
        SignInUsername = input.next();
        
        System.out.println("\t\t\tENTER YOUR STAFF ID: ");
        SignInPassword = input.next();
        
        
        int ITFlag = 0 , DoctorFlag = 0 , NurseFlag=0 , ITCounterArray = 0 , DoctorCounterArray = 0 , NurseCounterArray = 0;
        
        
        CounterArray = 0; 
        while(flag == 0 && CounterArray<DoctorNumber){
            
            if((DoctorUsernameStringArray[CounterArray].compareTo(SignInUsername) == 0) && (DoctorPasswordStringArray[CounterArray].compareTo(SignInPassword) == 0)){
            
                DoctorCounterArray = CounterArray;
                DoctorFlag = 1;
                
            }
            CounterArray++;
         }
        
        
        
        
        CounterArray = 0;
        while(flag == 0 && CounterArray<NurseNumber){
        
             if((NurseUsernameStringArray[CounterArray].compareTo(SignInUsername) == 0) && (NursePasswordStringArray[CounterArray].compareTo(SignInPassword) == 0)){
        
            NurseCounterArray = CounterArray;
            NurseFlag = 1;
            }
             CounterArray++;
        }
        
        CounterArray = 0; 
        while(flag == 0 && CounterArray<ITNumber){
            if((ITUsernameStringArray[CounterArray].compareTo(SignInUsername) == 0) && (ITPasswordStringArray[CounterArray].compareTo(SignInPassword) == 0)){
            
                ITCounterArray = CounterArray;
                ITFlag = 1;
            }
            CounterArray++;
        }
            if((DoctorFlag == 0) && (NurseFlag == 0) && (ITFlag == 0)){
            
                System.out.println("\t\t\tWRONG INPUT ");
                SignInForStaff();
            }   
            
     if(DoctorFlag == 1 && NurseFlag == 0 && ITFlag == 0){
     
         MainDashboardForDoctor(DoctorCounterArray);
     } 
     
     else if (DoctorFlag == 0 && NurseFlag == 1 && ITFlag == 0){
     
         MainDashboardForNurse(NurseCounterArray);
     }
     else if (DoctorFlag == 0 && NurseFlag == 0 && ITFlag == 1){
     
         MainDashboardForIT(ITCounterArray);
     }
    
    
    
 }   
    
        public static int Exit(){
       
        System.out.println("\nExiting ");
        return 0;
    }
    
    public static void MainDashboardForPatient(int PatientCounter){
        
        
        System.out.println("\t\t\tWELCOME "+ patients[PatientCounter].getUserName());
        
        String PatientInfo = "\nYour info"+"\t"+"\n"+"\tUnique Number : "+patients[PatientCounter].getPatientUniqueNumber()+"\n"+"\t"+"User name : "
                +patients[PatientCounter].getUserName()+"\n"+"\t"+"Assigned nusre : "+patients[PatientCounter].getAssignedNurse()+"\n"+"\t"+"Assigned Doctor : "+patients[PatientCounter].getAssignedDoctor();
        
        System.out.println(PatientInfo);
         System.out.println("\t\t\tCHOOSE YOUR OPTION: ");
        System.out.println("\n\n\t\t\t1 EDIT INFO");
        System.out.println("\n\t\t\t2ADD INFO");
    }
    
    
    
    
    
    public static void MainDashboardForDoctor(int DoctorCounter){
    
        System.out.println("\t\t\tWELCOME "+doctors[DoctorCounter].getUserName());
        
        String PeopleDoctorInfo = "\n\t"+" USERNAME: "+doctors[DoctorCounter].getUserName()+"\n\t"+" AGE: "+doctors[DoctorCounter].getUserAge()+"\n\t"+" ADDRESS: "+doctors[DoctorCounter].getUserAddress()
                +"\n\t"+"YOUR CONTACT NUMBER: "+doctors[DoctorCounter].getUserContactNumber();
                
         String StaffDoctorInfo = "\n\t"+ " STAFF ID : "+doctors[DoctorCounter].getStaffID()+"\n\t"+" SALARY : "+doctors[DoctorCounter].getStaffSalary()+"\n\t"+" DESIGNATION : "
                 +doctors[DoctorCounter].getStaffDesignation()+"\n\t"+" DESIGNATED ROOM : "+doctors[DoctorCounter].getStaffRoom()+"\n\t"+" INITIAL DATE OF RECRUITMENT : "+doctors[DoctorCounter].getInitialRecruitmentDate();
        
         String MainDoctorInfo = "\n\t"+" SPECIALIST FIELD : "+doctors[DoctorCounter].getSpecialistField()
                 +"\n\t"+"PATIENTS ROOM NUMBER : "+doctors[DoctorCounter].getPatientRoomNumber()+"\n\t"+"ASSIGNED PATIENTS NAMES : "+doctors[DoctorCounter].getAssignedPatientName()
                 +"\n\t"+"ASSIGNED PATIENT UNIQUE NUMBER : "+doctors[DoctorCounter].getAssignedPatientUniqueNumber();
         
         System.out.println("\n"+PeopleDoctorInfo+"\n"+MainDoctorInfo+"\n"+StaffDoctorInfo);
         
    }
    
    
    
    
    
    
    public static void MainDashboardForNurse(int NurseCounter){}
    public static void MainDashboardForIT(int ITCounter){}
    
    public static void SignUp(){
    
        System.out.println("\t\t\t\t\t\tWELCOME\n\n");
        System.out.println("\t\t\t\t\t1 SIGN UP FOR PATIENTS");
        System.out.println("\t\t\t\t\t2 SIGN UP FOR STAFF");
        
        int UserInput  = input.nextInt();
        
        switch(UserInput){
        
            case 1:
                SignUpForPatients();
                break;
            case 2: 
                SignUpForStaff();
                break;
            default:
                System.out.println("\t\t\t\t\tWRONG INPUT TRY AGAIN");
                SignUp();
                break;
        }
    }
    
    public static void SignUpForPatients(){
    
        System.out.println("\n\n\n");
        int PatientCounter=0,ArrayCounter=0;
        while(ArrayCounter<PatientNumber){
        
            if(patients[ArrayCounter].getUserName().compareTo("Name")==0 && ArrayCounter !=0){
                break;
            }
            
            ArrayCounter++;
        }
       
        patients[ArrayCounter].setUserName(EnterUserName());
        patients[ArrayCounter].setUserAge(EnterAge());
        patients[ArrayCounter].setUserAddress(EnterAddress());
        patients[ArrayCounter].setUserContactNumber(ContactNumber());
        patients[ArrayCounter].setDateOfEntry(EnterDate());
        patients[ArrayCounter].setTypeOfTest(EnterTypeOfTest());
        patients[ArrayCounter].setAssignedDoctor(EnterAssignedDoctor());
        patients[ArrayCounter].setAssignedNurse(EnterAssignedNurse());
        patients[ArrayCounter].setPatientUniqueNumber(EnterPatientUniqueNumber());
        
        System.out.println("\n\n\n\t\t\t\t\tYOUR SIGN UP IS COMPLETE");
        System.out.println("\t\t\t\t\tTO GO TO MAIN MENU ENTER 1 \n\t\t\t\t\t\tEXIT ENTER 2 ");
        int CaseOption = input.nextInt();
        switch(CaseOption){
        
            case 1:
                SignInSignUp();
                break;
            case 2: 
                Exit();
                break;
            default:
                System.out.println("\t\t\t\t\t\nYOU ENTERED WRONG");
                SignInSignUp();
                break;
        }
    }
    
    
    
     public static String EnterUserName(){
     
      System.out.println("\n\t\t\t\t\t\nENTER USERNAME: ");
      String UserName = input.next();
      return UserName;
     }
     public static int EnterAge(){
     
         System.out.println("\n\t\t\t\t\t\nENTER AGE: ");
         int UserAge = input.nextInt();
         return UserAge;
     }
     
     public static String EnterAddress(){
     
         System.out.println("\n\t\t\t\t\t\nENTER ADDRESS: ");
         String Address = input.next();
         return Address;
     }
     public static int ContactNumber(){
     
         System.out.println("\n\t\t\t\t\t\nENTER CONTACT NUMBER: ");
         int ContactNumber = input.nextInt();
         return ContactNumber;
     }
     public static String EnterDate(){
     
         System.out.println("\n\t\t\t\t\t\nENTER DATE: ");
         String Date = input.next();
         return Date;
     }
     public static String EnterTypeOfTest(){
     
         System.out.println("\n\t\t\t\t\t\nENTER TEST NAME: ");
         String TestName = input.next();
         return TestName;
     }
     public static String EnterAssignedDoctor(){
     
         System.out.println("\n\t\t\t\t\t\nENTER DOCTOR NAME: ");
         String DoctorName = input.next();
         return DoctorName;
     }
     public static String EnterAssignedNurse(){
     
         System.out.println("\n\t\t\t\t\t\nENTER NURSE NAME: ");
         String NurseName = input.next();
         return NurseName;
     }
     public static String EnterPatientUniqueNumber(){
     
         System.out.println("\n\t\t\t\t\t\nENTER UNIQUE NUMBER: ");
         String UniqueNumber = input.next();
         return UniqueNumber;
     }
     public static String EnterID(){
     
         System.out.println("\n\t\t\t\t\t\nENTER ID: ");
         String ID = input.next();
         return ID;
     }
     public static double EnterSalary(){
     
         System.out.println("\n\t\t\t\t\t\nENTER SALARY: ");
         double Salary = input.nextDouble();
         return Salary;
     }
     public static String EnterDesignation(){
     
         System.out.println("\n\t\t\t\t\t\nENTER DESIGNATION: ");
         String Designation = input.next();
         return Designation;
     }
     public static String EnterStaffRoom(){
     
         System.out.println("\n\t\t\t\t\t\nENTER ROOM NUMBER: ");
         String StaffRoom = input.next();
         return StaffRoom;
     }
     public static String EnterDateOfRecruitment(){
     
         System.out.println("\n\t\t\t\t\t\nENTER INITIAL DATE OF RECRUITMENT: ");
         String Date = input.next();
         return Date;
     }
     public static String EnterSpecialistField(){
     
         System.out.println("\n\t\t\t\t\t\nENTER FIELD: ");
         String Field = input.next();
         return Field;
     }
     
     public static String EnterPatientsRoom(){
     
         System.out.println("\n\t\t\t\t\t\nENTER PATIENTS ROOM NUMBER: ");
         String RoomNumber = input.next();
         return RoomNumber;
     }
     public static String EnterPatientName(){
     
         System.out.println("\n\t\t\t\t\t\nENTER PATIENTS NAME: ");
         String Name = input.next();
         return Name;
     }
     
     public static String EnterDoctorName(){
         
         System.out.println("\n\t\t\t\t\t\nENTER DOCTOR NAME: ");
         String Name = input.next();
         return Name;
     }
     
     public static int EnterNetworkComputerNumber(){
     
         System.out.println("\n\t\t\t\t\tENTER NUMBER OF COMPUTERS ON NETWORK: ");
         int Number = input.nextInt();
         return Number;
     }
     
     public static String EnterStaffEmail(){
     
         System.out.println("\n\t\t\t\t\tENTER STAFF EMAIL ADDRESS: ");
         String Email = input.next();
         return Email;
     }
     
     public static String EnterPatientEmail(){
     
         System.out.println("\n\t\t\t\t\tENTER PATIENT EMAIL ADDRESS: ");
         String Email = input.next();
         return Email;
     }
     
     public static String EnterDoctorEmail(){
     
         System.out.println("\n\t\t\t\t\tENTER DOCTOR EMAIL ADDRESS: ");
         String Email = input.next();
         return Email;
     }
     
     public static  int EnterCashInHand(){
     
         System.out.println("\n\t\t\t\t\tENTER CURRENT CASH IN HAND: ");
         int Cash = input.nextInt();
         return Cash;
     }
     
        
     
     
     public static void SignUpForStaff(){
     
         
         System.out.println("\t\t\t\t\tPICK YOUR OPTION");
         System.out.println("\n\t\t\t\t\t1 DOCTOR\n\t\t\t\t\t2 NURSE\n\t\t\t\t\t3 IT");
         int CaseOption = input.nextInt();
         switch(CaseOption){
         
             case 1: 
                 SignUpForDoctor();
                 break;
             case 2:
                 SignUpForNurse();
                 break;
             case 3:
                 SignUpForIT();
                 break;
             default:
                 System.out.println("\t\t\t\t\t\nWRONG SELECTION TRY AGAIN");
                 SignUpForStaff();
                 break;
            
         }
         
     }
     
     
     public static void SignUpForDoctor(){
     
         System.out.println("\n\n\n");
        int DoctorCounter=0,ArrayCounter=0;
        while(ArrayCounter<DoctorNumber){
        
            if(doctors[ArrayCounter].getUserName().compareTo("Name")==0 && ArrayCounter !=0){
                break;
            }
            
            ArrayCounter++;
        }
        
        doctors[ArrayCounter].setUserName(EnterUserName());
        doctors[ArrayCounter].setUserAge(EnterAge());
        doctors[ArrayCounter].setUserAddress(EnterAddress());
        doctors[ArrayCounter].setUserContactNumber(ContactNumber());
        doctors[ArrayCounter].setStaffID(EnterID());
        doctors[ArrayCounter].setStaffSalary(EnterSalary());
        doctors[ArrayCounter].setStaffDesignation(EnterDesignation());
        doctors[ArrayCounter].setInitialRecruitmentDate(EnterDateOfRecruitment());
        doctors[ArrayCounter].setSpecialistField(EnterSpecialistField());
        doctors[ArrayCounter].setPatientRoomNumber(EnterPatientsRoom());
        doctors[ArrayCounter].setAssignedPatientName(EnterPatientName());
        doctors[ArrayCounter].setAssignedPatientUniqueNumber(EnterPatientUniqueNumber());
     }
            
        
     public static void SignUpForNurse(){
     
         System.out.println("\n\n\n");
        int NurseCounter,ArrayCounter=0;
        while(ArrayCounter<NurseNumber){
        
            if(nurses[ArrayCounter].getUserName().compareTo("Name")==0 && ArrayCounter !=0){
                break;
            }
            
            ArrayCounter++;
        }
        
        nurses[ArrayCounter].setUserName(EnterUserName());
        nurses[ArrayCounter].setUserAge(EnterAge());
        nurses[ArrayCounter].setUserAddress(EnterAddress());
        nurses[ArrayCounter].setUserContactNumber(ContactNumber());
        nurses[ArrayCounter].setStaffID(EnterID());
        nurses[ArrayCounter].setStaffSalary(EnterSalary());
        nurses[ArrayCounter].setStaffDesignation(EnterDesignation());
        nurses[ArrayCounter].setStaffRoom(EnterStaffRoom());
        nurses[ArrayCounter].setInitialRecruitmentDate(EnterDateOfRecruitment());
        nurses[ArrayCounter].setAssignedPatient(EnterPatientName());
        nurses[ArrayCounter].setAssignedDoctor(EnterDoctorName());
        nurses[ArrayCounter].setPatientRoomNumber(EnterPatientsRoom());
        nurses[ArrayCounter].setAssignedPatientUniqueNumber(EnterPatientUniqueNumber());
        
     
    }
        
    public static void SignUpForIT(){
     
         System.out.println("\n\n\n");
        int ITCounter,ArrayCounter=0;
        while(ArrayCounter<ITNumber){
        
            if(IT[ArrayCounter].getUserName().compareTo("Name")==0 && ArrayCounter !=0){
                break;
            }
            
            ArrayCounter++;
        }
        
        IT[ArrayCounter].setUserName(EnterUserName());
        IT[ArrayCounter].setUserAge(EnterAge());
        IT[ArrayCounter].setUserAddress(EnterAddress());
        IT[ArrayCounter].setUserContactNumber(ContactNumber());
        IT[ArrayCounter].setStaffID(EnterID());
        IT[ArrayCounter].setStaffSalary(EnterSalary());
        IT[ArrayCounter].setStaffDesignation(EnterDesignation());
        IT[ArrayCounter].setStaffRoom(EnterStaffRoom());
        IT[ArrayCounter].setInitialRecruitmentDate(EnterDateOfRecruitment());
        IT[ArrayCounter].setNumberOfComputer(EnterNetworkComputerNumber());
        IT[ArrayCounter].setStaffEmailAddress(EnterStaffEmail());
        IT[ArrayCounter].setPatientEmailAddress(EnterPatientEmail());
        IT[ArrayCounter].setDoctorEmailAddress(EnterDoctorEmail());
        IT[ArrayCounter].setCurrentCashInHand(EnterCashInHand());
    



                
                
                }               
}