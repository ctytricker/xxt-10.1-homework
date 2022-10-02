package com.cm.A1;

 abstract class Employee {
    protected String name;
    protected int month;

    public Employee(){  }
    public Employee(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public abstract double getSalary();
}
