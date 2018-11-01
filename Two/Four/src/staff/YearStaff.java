package staff;

public class YearStaff {
    private double single, years;

    public YearStaff(double single, double years) {
        this.single = single;
        this.years = years;
    }

    public YearStaff() {
    }

    public void setSingle(double single) {
        this.single = single;
    }

    public void setYears(double years) {
        this.years = years;
    }

    public double getYears() {
        return years;
    }

    public double getSingle() {
        return single;
    }

    public void setInfo(double single, double years) {
        this.years = years;
        this.single = single;
    }

    public double getEarnings() {
        return (this.single * this.years);
    }
}
