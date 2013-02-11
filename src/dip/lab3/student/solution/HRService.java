package dip.lab3.student.solution;

import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author your name goes here
 */
public class HRService {
    
    public double HRService(Employee e) {
        return e.getAnnualCompensation();
            }
    }
