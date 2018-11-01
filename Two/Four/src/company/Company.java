package company;

import staff.*;

import java.util.ArrayList;

public class Company {
    private ArrayList<YearStaff> yeardic = new ArrayList<>();
    private ArrayList<MonthStaff> monthdic = new ArrayList<>();
    private ArrayList<WeekStaff> weekdic = new ArrayList<>();

    public void add(Object o) {
        if (o instanceof WeekStaff) {
            weekdic.add((WeekStaff) o);
        }
        if (o instanceof YearStaff) {
            yeardic.add((YearStaff) o);
        }
        if (o instanceof MonthStaff) {
            monthdic.add((MonthStaff) o);
        }
    }

    public int getSize() {
        return (yeardic.size() + monthdic.size() + weekdic.size());
    }

    public double getEarnings() {
        double ans = 0;
        for (YearStaff now : yeardic) {
            ans += now.getEarnings();
        }
        for (MonthStaff now : monthdic) {
            ans += now.getEarnings();
        }
        for (WeekStaff now : weekdic) {
            ans += now.getEarnings();
        }
        return ans;
    }
}
