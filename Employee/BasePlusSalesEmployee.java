package com.cm.A1;


class BasePlusSalesEmployee extends SalesEmployee{
    private double basicSalary;

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public BasePlusSalesEmployee(){
    }

    public BasePlusSalesEmployee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public BasePlusSalesEmployee(String name, int month, double basicSalary, double sale, double commissionRate) {
        super(name, month, sale, commissionRate);
        this.basicSalary = basicSalary;
    }

    public double getSalary(){
        return super.getSalary() + basicSalary;
    }

}
