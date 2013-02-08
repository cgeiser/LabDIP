package dip.lab2.student.solution1;

/**
 *
 * @author chrisgeiser
 */
public class LuxuryTipRateCalculator implements TipRateCalculator {
    private static final double GOOD_RATE = 0.40;
    private static final double FAIR_RATE = 0.25;
    private static final double POOR_RATE = 0.10;

    private String serviceQuality;
    
    @Override
    public double getTipRate() {
        double tipRate = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case "GOOD":
                tipRate = GOOD_RATE;
                break;
            case "FAIR":
                tipRate = FAIR_RATE;
                break;
            case "POOR":
                tipRate = POOR_RATE;
                break;
        }

        return tipRate;
    }
    @Override
    public void setServiceQuality(String srvcQuality) {
        this.serviceQuality = srvcQuality;
    }
}
