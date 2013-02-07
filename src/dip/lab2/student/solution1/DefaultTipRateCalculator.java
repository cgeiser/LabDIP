/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author chrisgeiser
 */
public class DefaultTipRateCalculator {
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;

    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;
    
    public double getTipRate() {
        double tipRate = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tipRate = GOOD_RATE;
                break;
            case FAIR:
                tipRate = FAIR_RATE;
                break;
            case POOR:
                tipRate = POOR_RATE;
                break;
        }

        return tipRate;
    }
}
