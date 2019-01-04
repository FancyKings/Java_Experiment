// 这个就这么写，注意判断null
public boolean equals(Object obj)
        {
        if(obj instanceof Employee)
        {
        Employee emp = (Employee)obj;
        if(super.equals(emp) && ((this.company == null && emp.company == null) || (this.company != null && this.company.equals(emp.company))))
        {
        DecimalFormat df = new DecimalFormat("#.##");
        if(df.format(this.salary).equals(df.format(emp.salary)))
        {
        return true;
        }
        }
        }

        return false;
        }