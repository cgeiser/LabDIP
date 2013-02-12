package dip.lab3.student.solution;

import dip.lab1.*;

/**
 * A simple implementation sub-class of an Employee.
 * 
 * @author chrisgeiser
 */
public class HourlyEmployee implements Employee {
    
    private double hourlyRate;
    private double totalHrsForYear;
    private double annualBonus;
    /**
     * Convenience constructor. 
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     * @param annualBonus - annual bonus amount (0 if none)
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
        // round to 2 decimal places
        return ((Math.round(total * 100)) / 100) + annualBonus;
    }

}
