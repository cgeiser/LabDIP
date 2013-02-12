package dip.lab2.student.solution1;

/**
 * An example low-level class.
 *
 * @author chrisgeiser
 */
public class BaggageServiceTipCalculator implements TipCalculator {
    private static final double MIN_BILL = 0.00;
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    
    private double baseTipPerBag, tipRate;
    private int bagCount;
    
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;

    
    
    public BaggageServiceTipCalculator(int bags) {
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    @Override
    public double getTipAmount() {
        double tip = baseTipPerBag * bagCount * (1 + tipRate);
        tip *= 100;
        double round = Math.round(tip);
        tip = round / 100;
        return tip;
    }

    public final void setServiceQuality(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    @Override
    public String getServiceQuality() {
        return serviceQuality.toString();
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    public final double getTipRate() {
        return tipRate;
    }

    @Override
    public void setTipRate(double tipRate) {
        this.tipRate = tipRate;
    }

}
