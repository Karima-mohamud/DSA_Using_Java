package Hospital;

public class Patient {
    // creating data fields
    public String Name;
    public double consultFee;
    //constructor
    public Patient(String Name ,double consultFee){
        this.Name = Name;
        this.consultFee =consultFee;
    }
    //method for calculating
    public double CalculateBill(){
        return consultFee;
    }
    //displaying
    public void displayInfo(){
        System.out.println("Patient name : "+Name);
        System.out.println("Consult Fee : "+consultFee);
    }
}
