package com.codeWithHarry.shape;

import java.util.Scanner;

public class Rectangle {
    public int d1, d2, d3;
    Scanner sc = new Scanner(System.in);

    public void area() {
        System.out.println("area is " + d1 * d2 * d3);
    }

    public void getinfo() {

        System.out.println("enter the dimension 1 :");
        d1 = sc.nextInt();

        System.out.println("enter the dimension 2 :");
        d2 = sc.nextInt();

        System.out.println("enter the dimension 3 :");
        d3 = sc.nextInt();
    }
}