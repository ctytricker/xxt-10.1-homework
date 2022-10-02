package com.cm.A1;

class HourlyEmployee extends  Employee{
    private double hourSalary;
    private double hours;

    public HourlyEmployee(){
    }

    public HourlyEmployee(String name, int month, double hourSalary, double hours) {
        super(name, month);
        this.hourSalary = hourSalary;
        this.hours = hours;
    }

    public double getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getSalary(){
        double salary = 0;
        if(hours < 160){
            salary = hourSalary * hours;
        }else{
            salary = hourSalary * 160 + 1.5 * hourSalary * (hours - 160);
        }

        if(month == 12 ){
            return salary + 100;
        }
        return  salary;
    }
}
