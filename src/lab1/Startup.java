package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {
        Employee employee = new Employee("Peter","Piper","333-1234", new Date(1976, 22, 7), "12345");
        
        employee.newEmployeeFirstDayTrainingSchedual(); //turn on or off for proof.
        System.out.println("The employee's status is: " + employee.getStatus());
    }
    
    
}
