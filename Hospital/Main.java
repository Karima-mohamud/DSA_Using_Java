package Hospital;

public class Main {
    static void main() {
        Patient p1 = new InPatient("Ali",7,40,5);
        Patient p2 = new InPatient("Xaawo",10,30,3);
        Patient p3 = new OutPatient("Zaynab",5,49);
        Patient p4 = new OutPatient("xasan",8,60);
        System.out.println("---Inpatient information--- ");
        System.out.println( );
        p1.displayInfo();
        System.out.println( );
        p2.displayInfo();
        System.out.println( );
        System.out.println("---Outpatient information--- ");
        System.out.println( );
        p3.displayInfo();
        System.out.println( );
        p4.displayInfo();

    }

}
