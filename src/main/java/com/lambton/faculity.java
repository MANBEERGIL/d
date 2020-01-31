package com.lambton;
import com.lambton.person;

public class faculity extends person {
    String designation;
    int totalsalary;

    public faculity(int id, String designation, int totalsalary) {
        super(id);
        this.designation = designation;
        this.totalsalary = totalsalary;
    }

    public faculity(String name, String designation, int totalsalary) {
        super(name);
        this.designation = designation;
        this.totalsalary = totalsalary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getTotalsalary() {
        return totalsalary;
    }

    public void setTotalsalary(int totalsalary) {
        this.totalsalary = totalsalary;
    }
}
