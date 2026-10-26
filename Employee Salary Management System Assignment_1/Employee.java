package Assignments;

public class Employee {
    //Declaring attributes
    private String id;
    private String name;
    private String department;
    private double basicSalary;
    //creating constructor
    public  Employee(String id ,String name ,String department, double basicSalary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }
    //creating setter method and getter methods for private attributes
    public String getId(){
        return  id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDepartment(){
        return  department;
    }
    public void setDepartment(String department){
        this.department= department;
    }
    public double getBasicSalary(){
        return  basicSalary;
    }
    public void setBasicSalary(double basicSalary){
        this.basicSalary = basicSalary;
    }
    //calculating method
    public double CalculateSalary(){
        return getBasicSalary();
    }
    //category method
    public String getCategory(){
        return "Employee";
    }
   //displaying methods
    public void display(){
        System.out.println("Employee ID : "+ getId());
        System.out.println("Employee Name : "+getName());
        System.out.println("Employee Department : "+ getDepartment());
        System.out.println("Category : "+ getCategory());
        System.out.println("Monthly Salary : $"+CalculateSalary());


    }


}
//child class 1
class FullTimeEmployee extends Employee{
    //creating fields
    private double allowance;
    //constructor
    public FullTimeEmployee(String id ,String name , String department, double basicSalary , double allowance ){
        super(id,name,department,basicSalary);
        this.allowance = allowance;

    }
    //creating setter method and getter methods for private attribute
    public double getAllowance(){
        return  allowance;
    }
    public  void setAllowance(double allowance){
        this.allowance = allowance;
    }

    //overriding the calculate method
    @Override
    public double CalculateSalary() {
        return super.CalculateSalary() + getAllowance();
    }


    @Override
    public String getCategory() {
        return "Full Time Employee";
    }

    //overriding display method
    @Override
    public void display() {
        super.display();
    }
}
// child class 2
class PartTimeEmployee extends Employee{
    //Declaring attributes
    private double hoursWorked;
    private double hourlyRate;
    //constructor
    public PartTimeEmployee(String id, String  name, String department , double basicSalary , double hoursWorked,double hourlyRate){
        super(id,name,department,basicSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    //creating setter method and getter methods for private attributes
    public double getHoursWorked(){
        return  hoursWorked;
    }
    public void  setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    public double getHourlyRate(){
        return  hourlyRate;
    }
    public void  setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    //overriding calculate method
    @Override
    public double CalculateSalary() {
        return getHoursWorked() * getHourlyRate();
    }

    //overriding category method
    @Override
    public String getCategory() {
        return "Part Time Employee";
    }

    //overriding display method
    @Override
    public void display() {
        super.display();
    }
}

//child class 3
class Manager extends  Employee{
    //declaring attributes
    private double bonus;
    //constructor
    public Manager(String id, String  name, String department , double basicSalary , double bonus){
        super(id,name,department,basicSalary);
        this.bonus = bonus;
    }
    //creating setter method and getter methods for private attribute
    public  double getBonus(){
        return  bonus;
    }
    public  void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public double CalculateSalary() {
        return super.CalculateSalary() + getBonus();
    }

    public String getCategory() {
        return "Manager";
    }

    @Override
    public void display() {
        super.display();
    }
}


class mains {
    static void main() {
        Employee []  employees = {
                new FullTimeEmployee("Emp001","Ahmed Ali","IT",600,50),
        new PartTimeEmployee("Emp002","Aisha Hassan","Finance",400.0,20,12),
        new Manager("Emp003","Zaynab Mohamud ","HR",900.0,300)};

        System.out.println("----- Employee Salary Report -----");
        for(Employee x :employees){
            x.display();
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println();
        }

    }
}

