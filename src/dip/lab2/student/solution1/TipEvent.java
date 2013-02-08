package dip.lab2.student.solution1;

/**
 *
 * @author chrisgeiser
 */
public class TipEvent {
    
    public double TipEvent(TipCalculator calculator,
            TipRateCalculator rateCalc) {
        
        double tipRate = rateCalc.getTipRate();
        calculator.setTipRate(tipRate);
        return calculator.getTipAmount();
    }
    
}
