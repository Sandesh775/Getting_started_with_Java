/*
* Problem 1: Hospital Patient Management System 🏥
Topics: Class, Multiple Objects, Constructor Overloading, Displaying Data
Task: Create a Patient class with:

Attributes: name, patientId, age, disease, roomNumber
Constructors:

Default constructor (all fields = "Not Assigned" or 0)
Constructor with name, age, disease only (patientId and roomNumber auto-assigned)
Constructor with all 5 parameters

Methods:

displayPatientInfo() - displays all patient details
Create 4 patient objects using different constructors
Display all patient information*/
public class Code01 {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        Patient p2 = new Patient("Sandesh Sharma1",32,"Fever");
        Patient p3 = new Patient("Sandesh Sharma2","P333",21,"Cancer",101);
        Patient p4 = new Patient("Sandesh Sharma3","P666",22,"Fracture",102);
        Patient [] patients = {p1,p2,p3,p4};
        for(int i = 0; i<4; i++){
            System.out.println("-- Patient "+(i+1)+" --");
            patients[i].displayPatientInfo();
        }
    }
}
class Patient{
    String name;
    String patientId;
    int age;
    String disease;
    int roomNumber;
    // default constructor
    Patient(){
        this.name = "Not assigned";
        this.patientId = "Not assigned";
        this.age = 0;
        this.disease = "Not assigned";
        this.roomNumber = 0;
    }
    Patient(String name, int age, String disease){
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.patientId = "Auto-P001";
        this.roomNumber = 0;
    }
    Patient(String name, String patientId,int age, String disease, int roomNumber){
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.patientId = patientId;
        this.roomNumber = roomNumber;
    }
    public void displayPatientInfo(){
        System.out.print("Name: "+this.name+
                "\nPatient ID: "+this.patientId+
                "\nAge: "+this.age+
                "\nDisease:"+this.disease+
                "\nRoom: "+this.roomNumber+"\n");
    }
}