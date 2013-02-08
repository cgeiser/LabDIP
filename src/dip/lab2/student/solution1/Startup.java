package dip.lab2.student.solution1;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
    public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };
 
    public static void main(String[] args) {
        
        TipEvent event = new TipEvent();
        
        // set TipRateCalculator to use Default
        TipRateCalculator tipRate = new DefaultTipRateCalculator();
        tipRate.setServiceQuality(ServiceQuality.POOR.toString());
        
        
        TipCalculator airport =
                new BaggageServiceTipCalculator(5);
        System.out.println(event.TipEvent(airport, tipRate));
        
        
        
        TipCalculator restaurant = new FoodServiceTipCalculator(0.25, 84.25);
        System.out.println(event.TipEvent(restaurant, tipRate));
    }

}
