package com.wy.pc.product.dto;

import java.io.Serializable;

/**
 * Created by znz on 2016/2/28.
 */
public class PcCurrentProductAccumulatedIncome implements Serializable{
    private static final long serialVersionUID = -8807321436544352972L;
    private double totalIncome;
    private double last7DayIncome;
    private double last30DayIncome;
    private double millionDayIncome;

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getLast7DayIncome() {
        return last7DayIncome;
    }

    public void setLast7DayIncome(double last7DayIncome) {
        this.last7DayIncome = last7DayIncome;
    }

    public double getLast30DayIncome() {
        return last30DayIncome;
    }

    public void setLast30DayIncome(double last30DayIncome) {
        this.last30DayIncome = last30DayIncome;
    }

    public double getMillionDayIncome() {
        return millionDayIncome;
    }

    public void setMillionDayIncome(double millionDayIncome) {
        this.millionDayIncome = millionDayIncome;
    }
}
