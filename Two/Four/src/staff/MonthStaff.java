package staff;

public class MonthStaff {
    private double single, months;

    public MonthStaff() {
    }

    public MonthStaff(double single, double months) {
        this.single = single;
        this.months = months;
    }

    public void setSingle(double single) {
        this.single = single;
    }

    public void setMonths(double months) {
        this.months = months;
    }

    public void setInfo(double single, double months) {
        this.single = single;
        this.months = months;
    }

    public double getSingle() {
        return this.single;
    }

    public double getMonths() {
        return this.months;
    }

    public double getEarnings() {
        return (this.months * this.single);
    }
}
