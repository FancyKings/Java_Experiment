import static java.lang.System.*;

import java.util.*;

import staff.*;

import company.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(in);
        double single, times;
        Company dic = new Company();

        single = cin.nextDouble();
        times = cin.nextDouble();
        YearStaff Y = new YearStaff(single, times);
        out.printf("YearStaff earns : %f\n", Y.getEarnings());
        dic.add(Y);

        single = cin.nextDouble();
        times = cin.nextDouble();
        MonthStaff M = new MonthStaff(single, times);
        out.printf("MonthStaff earns : %f\n", M.getEarnings());
        dic.add(M);

        single = cin.nextDouble();
        times = cin.nextDouble();
        WeekStaff W = new WeekStaff(single, times);
        out.printf("WeekStaff earns : %f\n", W.getEarnings());
        dic.add(W);

        out.printf("All staff(%d) earning : %f\n", dic.getSize(), dic.getEarnings());

        cin.close();
    }
}
