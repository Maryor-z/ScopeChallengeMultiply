package com.maryor;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.print("Enter a number: ");
        this.x = x.nextInt();
    }

    public void x() {
        for (int x = 1; x < 13; x++) {
            System.out.println(x + " x " + this.x + " = " + x * this.x);
        }
    }
}
