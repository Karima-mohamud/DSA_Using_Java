package Assignments;

import java.util.Scanner;
//creating class
public class ExamRegistration {
    //declaring fields
    protected  String ID;
    protected String name;
    protected  int age;
     protected  double examinationMark;
     protected  int subjects;
     // parametrized constructor
    public ExamRegistration(String ID,String name ,int age , double examinationMark,int subjects){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.examinationMark = examinationMark;
        this.subjects = subjects;
    }
    //method
    public void validation () throws InvalidRegistrationException {
        if(age < 18){
            throw new InvalidRegistrationException("Error:Age must be at least 18");
        }
        if(examinationMark < 0 || examinationMark >100){
            throw new InvalidRegistrationException("Error: Examination mark must be between 0 and 100.");

        }
        if(subjects <1 ||  subjects> 5){
            throw new InvalidRegistrationException("Error: Subjects can be between 1 and 5 ");

        }
        if(ID.trim().isEmpty()){
            throw new InvalidRegistrationException("Error : Student ID can not be empty ");

        }

    }

}
//custom exception
class InvalidRegistrationException extends  Exception{
    public  InvalidRegistrationException(String message){
        super(message);
    }
}
class Main{
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("----- EXAM REGISTRATION SYSTEM -----");

        System.out.println("Enter student ID :");
        String ID = input.nextLine();
        System.out.println("Enter student Name :");
        String name = input.nextLine();
        System.out.println("Enter student Age :");
        int age = input.nextInt();
        System.out.println("Enter examination mark :");
        double examinationMark = input.nextDouble();
        System.out.println("Enter Number of Subjects :");
        int subjects = input.nextInt();

        //creating object
        ExamRegistration Student = new ExamRegistration(ID ,name,age,examinationMark,subjects);
        //displaying
        try{
            Student.validation();
            System.out.println("Registration Successful!");
            System.out.println("Student : "+name);
            System.out.println("Registered Subjects: "+subjects);
        }catch (InvalidRegistrationException e){
            System.out.println();
            System.out.println("Registration Failed!");
            System.out.println(e.getMessage());

        }
        catch (Exception e){
            System.out.println("Something is wrong ");

        }
        finally {
            System.out.println();
            System.out.println("Registration attempt completed.");
        }



    }
}

