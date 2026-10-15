package Hospital;

public class OutPatient extends Patient{
    private double labCharge ;
    public OutPatient(String Name , double consultFee,double labCharge){
        super(Name,consultFee);
        this.labCharge = labCharge;
    }

    @Override
    public double CalculateBill() {
        return super.CalculateBill()+labCharge;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Lab Charge : "+labCharge);
        System.out.println("Total Bill : "+CalculateBill());
    }
}
