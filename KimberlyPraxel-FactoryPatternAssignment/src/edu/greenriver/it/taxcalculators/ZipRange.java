/*
 * Kimberly M. Praxel
 * 11/06/16
 * ZipRange.java
 */

package edu.greenriver.it.taxcalculators;

/**
 * creates zipRange
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class ZipRange{
	
    private int top;
    private  int bottom;
    private  double tax;

    /**
     * creates a zipRange
     * 
     * @param top - highest zipcode
     * @param bottom - lowest zipcode
     * @param tax - tax rate for state
     */
    public ZipRange(int top, int bottom, double tax) {
        this.top = top;
        this.bottom = bottom;
        this.tax = tax;
    }

    /**
     * gets highest zipcode
     * 
     * @return top - highest zipcode
     */
    public int getTop() {
        return top;
    }

    /**
     * gets lowest zipcode
     * 
     * @return bottom - lowest zipcode
     */
    public int getBottom() {
        return bottom;
    }

    /**
     * gets tax rate for state
     * 
     * @return tax - tax rate for state
     */
    public double getTax() {
        return tax;
    }
}
