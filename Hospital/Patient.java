package Hospital;

public abstract class Patient {
    // creating data fields
    public String Name;
    public double consultFee;
    //constructor
    public Patient(String Name ,double consultFee){
        this.Name = Name;
        this.consultFee =consultFee;
    }
    //abstract method for calculating
    public abstract double CalculateBill();
    //displaying
    public void displayInfo(){
        System.out.println("Patient name : "+Name);
        System.out.println("Consult Fee : "+consultFee);
    }
}
