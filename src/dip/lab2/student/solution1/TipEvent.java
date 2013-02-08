package dip.lab2.student.solution1;

/**
 *
 * @author chrisgeiser
 */
public class TipEvent {
    
    public double TipEvent(TipCalculator calculator,
            TipRateCalculator rateCalc) {
        
//        rateCalc.setServiceQuality(calculator.getServiceQuality());
        double tipRate = rateCalc.getTipRate();
        calculator.setTipRate(tipRate);
        return calculator.getTipAmount();
    }
    
}
