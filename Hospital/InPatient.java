package Hospital;

public class InPatient extends Patient{
    //creating data fields
    private double roomCharge;
    private int numberOfDays ;
    //parametrized constructor
    public InPatient(String Name,double consultFee ,double roomCharge , int numberOfDays){
        super(Name ,consultFee);
        this.roomCharge =roomCharge;
        this.numberOfDays =numberOfDays;

    }
    //calculate method
    @Override
    public double CalculateBill() {
        return super.consultFee+(roomCharge * numberOfDays);

    }
    //displaying method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Room Charge : "+roomCharge);
        System.out.println("Number Of Days: "+numberOfDays);
        System.out.println("Total Bill: "+CalculateBill());
    }
}
