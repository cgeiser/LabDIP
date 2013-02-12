package dip.lab3.student.solution;

import dip.lab1.*;
import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class
 * in any way you see fit.
 *
 * @author jlombardo
 */
public class Startup {

    public static void main(String[] args) {
        /*
         * We'll just use this class for testing our ccde.
         * We'll provide input and get some output...
         */

        //Low-level modules
        Employee emp1 = new HourlyEmployee(10.50, 2020, 1000);
        Employee emp2 = new SalariedEmployee(45000, 1250);
        Employee emp3 = new SalariedEmployee(90000, 0);
        Employee emp4 = new HourlyEmployee(85.00, 2180, 4500);

        // High-level module
        HRService hr = new HRService();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Test input/output..
        System.out.println("Employee 1 annual compensation: " +
            nf.format(hr.HRService(emp1)));
        System.out.println("Employee 2 annual compensation: " +
            nf.format(hr.HRService(emp2)));
        System.out.println("Employee 3 annual compensation: " +
            nf.format(hr.HRService(emp3)));
        System.out.println("Employee 4 annual compensation: " +
            nf.format(hr.HRService(emp4)));
    }

}
