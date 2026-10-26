package Assignments;
//abstract class
public abstract class MedicalService {
    //Declaring fields
    private  String sID;
    private  String sName;
    private double baseCost;
    //constructor
    public MedicalService(String sID ,String sName , double baseCost){
        this.sID = sID;
        this.sName = sName;
        this.baseCost = baseCost;
    }
    // getter and setter methods
    public String getsID(){
        return  sID;
    }
    public void setsID(String sID){
        this.sID= sID;
    }
    public String getsName(){
        return  sName;
    }
    public void setsName(String sName){
        this.sName =sName;
    }
    public double getBaseCost(){
        return baseCost;
    }
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }
    // abstract method calculating
    public abstract double calculateTotalcost();
    // concrete method
    public void displayServiceInfo(){
        System.out.println("Service ID : "+ getsID());
        System.out.println("Service : "+ getsName());
        System.out.println("Total Cost : $"+ calculateTotalcost());
    }

}
// Subclass 1
class Consultation extends MedicalService{
    protected  double doctorFee;
    //parametrized constructor
    public Consultation(String sID , String sName , double baseCost , double doctorFee){
        super(sID,sName,baseCost);
        this.doctorFee = doctorFee;
    }
    //overriding and implementing the abstract method
    @Override
    public double calculateTotalcost() {
        return super.getBaseCost() + doctorFee;
    }
    //overriding the concrete method

    @Override
    public void displayServiceInfo() {
        super.displayServiceInfo();
    }
}

// Subclass 2
class LaboratoryTest extends MedicalService{
    protected  double testCharge;
    //parametrized constructor
    public LaboratoryTest(String sID , String sName , double baseCost , double testCharge){
        super(sID,sName,baseCost);
        this.testCharge = testCharge;
    }
    //overriding and implementing the abstract method
    @Override
    public double calculateTotalcost() {
        return super.getBaseCost() + testCharge;
    }
    //overriding the concrete method
    @Override
    public void displayServiceInfo() {
        super.displayServiceInfo();
    }
}

// Subclass 3
class Ultrasound extends MedicalService{
    protected  double additionalFee;
    //parametrized constructor
    public Ultrasound(String sID , String sName , double baseCost , double additionalFee){
        super(sID,sName,baseCost);
        this.additionalFee = additionalFee;
    }
    //overriding and implementing the abstract method
    @Override
    public double calculateTotalcost() {
        return super.getBaseCost() + additionalFee;
    }
    //overriding the concrete method
    @Override
    public void displayServiceInfo() {
        super.displayServiceInfo();
    }
}
//main class
class maine{
    static void main() {
        //creating objects
        MedicalService[] Service ={
                new Consultation("S101","Consultation",15,10),
                new LaboratoryTest("S202","Laboratory Test ",10,8),
                new Ultrasound("S303","Ultrasound",27,13)
        };
        double total=0;
        System.out.println("----- Hospital Billing System -----");
        //displaying using  loops
        for(MedicalService S : Service){
            System.out.println();
            S.displayServiceInfo();
            System.out.println("----------------------------");
            total+=S.calculateTotalcost();

        }
        System.out.println("Total Hospital Bill : $"+total);
    }

}


