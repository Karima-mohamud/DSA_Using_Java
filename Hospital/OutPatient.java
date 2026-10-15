package Hospital;

public class OutPatient extends Patient{
    //creating data fields
    private double labCharge ;
    //constructor parametrized
    public OutPatient(String Name , double consultFee,double labCharge){
        super(Name,consultFee);
        this.labCharge = labCharge;
    }
    //calculating method
    @Override
    public double CalculateBill() {
        return super.consultFee+labCharge;
    }
    //displaying method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Lab Charge : "+labCharge);
        System.out.println("Total Bill : "+CalculateBill());
    }
}
