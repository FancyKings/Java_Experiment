package staff;

public class WeekStaff {
    private double single, weeks;

    public WeekStaff() {
    }

    public WeekStaff(double single, double weeks) {
        this.single = single;
        this.weeks = weeks;
    }

    public void setSingle(double single) {
        this.single = single;
    }

    public void setWeeks(double weeks) {
        this.weeks = weeks;
    }

    public void setInfo(double single, double weeks) {
        this.single = single;
        this.weeks = weeks;
    }

    public double getSingle() {
        return this.single;
    }

    public double getWeeks() {
        return this.weeks;
    }

    public double getEarnings() {
        return (this.weeks * this.single);
    }
}
