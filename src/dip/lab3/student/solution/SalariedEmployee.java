package dip.lab3.student.solution;

import dip.lab1.*;

/**
 * A simple implementation sub-class of Employee.
 *
 * @author chrisgeiser
 */
public class SalariedEmployee implements Employee {
    
    private double annualSalary, annualBonus;

    /**
     * Convenience constructor.
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(int annualSalary, int annualBonus) {
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }

    @Override
    public double getAnnualCompensation() {
        // round to 2 decimal places
        return ((Math.round(annualSalary * 100)) / 100) + annualBonus;
    }
    
}
