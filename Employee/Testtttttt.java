package com.cm.A1;

import java.util.ArrayList;
import java.util.Scanner;

public class Testtttttt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String line = sc.nextLine();
        Scanner sc2 = new Scanner(line);

        while(sc2.hasNext()) {
            list.add(sc2.next());
        }

        if(list.size() == 3){
            SalariedEmployee salariedEmployee = new SalariedEmployee(list.get(0),Integer.parseInt(list.get(1)),Double.parseDouble(list.get(2)));
            monthSalary(salariedEmployee);
        }else if(list.size() == 4){
//            for(int i = 0;i < list.size();i++){
                if(list.contains(".")){
                    SalesEmployee salariedEmployee = new SalesEmployee(list.get(0),Integer.parseInt(list.get(1)),Double.parseDouble(list.get(2)),Double.parseDouble(list.get(3)));
                    monthSalary(salariedEmployee);
                }else{
                    HourlyEmployee hourlyEmployee = new HourlyEmployee(list.get(0),Integer.parseInt(list.get(1)),Double.parseDouble(list.get(2)),Double.parseDouble(list.get(3)));
                    monthSalary(hourlyEmployee);
                }
//            }

        }else{
            BasePlusSalesEmployee basePlusSalesEmployee = new BasePlusSalesEmployee(list.get(0),Integer.parseInt(list.get(1)),Double.parseDouble(list.get(2)),Double.parseDouble(list.get(3)),Double.parseDouble(list.get(4)));
            monthSalary(basePlusSalesEmployee);
        }
    }

    public static void monthSalary(Employee employee){
        System.out.printf("%s%02d月份工资：%.0f",employee.name,employee.month,employee.getSalary());
    }
}


