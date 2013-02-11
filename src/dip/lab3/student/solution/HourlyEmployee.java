package dip.lab3.student.solution;

import dip.lab1.*;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    
    private double hourlyRate;
    private double totalHrsForYear;
    private double annualBonus;
    /**
     * Convenience constructor. Is this the best way to go?
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear,
            double annualBonus) {
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
        this.annualBonus = annualBonus;
    }

    @Override
    public double getAnnualCompensation() {
        double total = hourlyRate * totalHrsForYear;
        return ((Math.round(total * 100)) / 100) + annualBonus;
    }

}
