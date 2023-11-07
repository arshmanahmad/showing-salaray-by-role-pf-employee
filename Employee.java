// Write a Java program to create a class Employee with a method called
//  calculateSalary()
// . Create two subclasses Manager and Programmer. In each subclass,
//  override the calculateSalary() method to calculate and return the 
// salary based on their specific roles.
import java. util.Scanner;
class Employee {
    String role;
    
  Employee(){
      System. out.println("Enter the role in manager/programmer");
      Scanner input = new Scanner(System.in);
      role = input.nextLine();
  }
    void calculateSalary(){
      int salary = 0;
        if(role.equals("manager")){
            salary = 120000;
        }
        else if(role.equals("programmer")){
            salary = 80000;
        }
        System.out.println("This is the salary of your current role" + salary);
    }
}
class Manager extends Employee{
    void calculateSalary(){
        super.calculateSalary();
    }
  public static void main(String []args){
    Manager m = new Manager();
    m.calculateSalary();
  }

}
class Programmer extends Employee{
    void calculateSalary(){
        super.calculateSalary();
    }
  public static void main(String []args){
    Programmer p = new Programmer();
    p.calculateSalary();
  }

}   
