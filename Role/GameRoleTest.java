package com.cm2;

import java.util.Scanner;

public class GameRoleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Magicer m = new Magicer();
        m.setGrand(sc.nextInt());


        Team t = new Team();
        int num = sc.nextInt();

        for(int i = 0;i < num;i++){
            Soldier s = new Soldier();
            t.addMember(s);
        }

        System.out.println("该团队的总攻击力=" + t.attackSum(m));
    }

}
