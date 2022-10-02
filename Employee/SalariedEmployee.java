package com.cm.A1;

class SalariedEmployee extends Employee {
    private double salary;

    public double getSalary() {
        if (super.month == 12){
            return salary += 100 ;
        }
            return salary;
    }

    public SalariedEmployee(){

    }
    public SalariedEmployee(String name, int month, double salary) {
        super(name, month);
        this.salary = salary;
    }


}
