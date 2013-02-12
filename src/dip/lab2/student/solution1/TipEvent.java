package dip.lab2.student.solution1;

/**
 *
 * @author chrisgeiser
 */
public class TipEvent {
    
    // accepts a TipCalculator and a TipRateCalculator
    public double TipEvent(TipCalculator calculator,
            TipRateCalculator rateCalc) {
        
        // sets Tip Rate based on quality and a specific TipRateCalculator
        // and returns tip
        double tipRate = rateCalc.getTipRate();
        calculator.setTipRate(tipRate);
        return calculator.getTipAmount();
    }
    
}
