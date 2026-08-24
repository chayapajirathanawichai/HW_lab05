/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw_lab5;
import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    private String firstname,lastname,id;
    private double salary;

    public Employee() {
    }

    public Employee(String firstname, String lastname, String id, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.salary = salary;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getID(){
        return firstname;
    }
    public double getSalary(){
        return salary;
    }
    
    public double earning(){
        salary-=salary*0.05;
        return salary;
    }
    public double bonus(int year){
        if(year>5){
            return 12.0*salary;
        }else{
            return 6.0*this.salary;
        }
    }
    
}
public class Application {
    public static void main(String[] args) {
        ArrayList<Employee> arrayEarn=new ArrayList<>();
        arrayEarn.add(new Employee("Suchada","homjung","E001",30000));
        arrayEarn.add(new Employee("Somsri","rukmun","E002",45000));
        arrayEarn.add(new Employee("John","armstrong","E003",25000));
        
        printEmp(arrayEarn);
    }
    public static void printEmp(ArrayList<Employee> a){
        System.out.printf("%-15s %-15s %-12s %-12s%n","Firstname","Lastname","Earning","Bonus");
        //System.out.println();
        
        for(Employee emp:a){
            System.out.printf("%-15s %-15s %-12.2f %-12.2f%n",emp.getFirstname(),emp.getLastname(),emp.earning(),emp.bonus(6));
        }
    }
}
