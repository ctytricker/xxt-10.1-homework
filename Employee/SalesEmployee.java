package com.cm.A1;

class SalesEmployee extends Employee{
    protected double sale;
    protected double commissionRate;

    public SalesEmployee(){
    }

    public SalesEmployee(String name, int month, double sale, double commissionRate) {
        super(name, month);
        this.sale = sale;
        this.commissionRate = commissionRate;
    }

    public double getSalary(){
        if(month == 12){
            return sale * commissionRate + 100;
        }
        return  sale * commissionRate;
    }
}
