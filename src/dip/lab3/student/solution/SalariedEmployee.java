package dip.lab3.student.solution;

import dip.lab1.*;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {
    
    private double annualSalary, annualBonus;

    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(int annualSalary, int annualBonus) {
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }

    @Override
    public double getAnnualCompensation() {
        return ((Math.round(annualSalary * 100)) / 100) + annualBonus;
    }
    
}
