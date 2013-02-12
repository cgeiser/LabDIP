package dip.lab3.student.solution;

/**
 * A high-level class that delegates to Employee objects to do the work.
 *
 * @author chrisgeiser
 */
public class HRService {
    
    public double HRService(Employee e) {
        return e.getAnnualCompensation();
            }
    }
