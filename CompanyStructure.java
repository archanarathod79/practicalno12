/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal1;

/**
 *
 * @author user
 */


    class Employee {
    String name;

    Employee(String name) {
        this.name = name;
        System.out.println("Employee: " + name);
    }
}
    
   class Developer extends Employee {
    Developer(String name) {
        super(name);
        System.out.println("Developer: " + name);
    }
}
class Manager extends Employee {
    Manager(String name) {
        super(name);
        System.out.println("Manager: " + name);
    }
}
class CEO extends Employee {
    CEO(String name) {
        super(name);
        System.out.println("CEO: " + name);
    }
}
public class CompanyStructure {
  
    public static void main(String[] args) {
       new Developer("Amit");
        new Manager("Sneha");
        new CEO("Rajesh");
    }
    
}
