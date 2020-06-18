package com.kpitschools;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        if (a < 1 || b < 1) {
            System.out.println("Введите действующие стороны");
            return;
        }
        System.out.println("Диагональ равна: " + ((a * a) + (b * b)));


    }


}