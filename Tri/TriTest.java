package com.cm.d1;

import java.util.Scanner;

public class TriTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tri t = new Tri();
        t.setX(sc.nextInt());
        t.setY(sc.nextInt());
        t.setZ(sc.nextInt());
        System.out.println(t.showInfo(t.getX(),t.getY(), t.getZ()));
    }
}
