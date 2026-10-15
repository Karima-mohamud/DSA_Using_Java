package Hospital;

public class InPatient extends Patient{
    private double roomCharge;
    private int numberOfDays ;
    public InPatient(String Name,double consultFee ,double roomCharge , int numberOfDays){
        super(Name ,consultFee);
        this.roomCharge =roomCharge;
        this.numberOfDays =numberOfDays;

    }

    @Override
    public double CalculateBill() {
        return super.CalculateBill() +(roomCharge * numberOfDays);

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Room Charge : "+roomCharge);
        System.out.println("Number Of Days: "+numberOfDays);
        System.out.println("Total Bill: "+CalculateBill());
    }
}
