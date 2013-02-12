package dip.lab2.student.solution1;

/**
 * An example low-level class.
 *
 * @author chrisgeiser
 */
public class FoodServiceTipCalculator implements TipCalculator {
    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    
    private double bill, tipRate;
    
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;

    
    
    public FoodServiceTipCalculator(double tipRate, double billAmt) {
        this.setTipRate(tipRate);
        this.setBill(billAmt);
    }

    @Override
    public double getTipAmount() {
        double tip = bill * tipRate;
        tip *= 100;
        double round = Math.round(tip);
        tip = round / 100;
        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final void setServiceQuality(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    @Override
    public String getServiceQuality() {
        return serviceQuality.toString();
    }
    
    public final double getTipRate() {
        return tipRate;
    }

    @Override
    public final void setTipRate(double tipRate) {
        this.tipRate = tipRate;
    }

}
