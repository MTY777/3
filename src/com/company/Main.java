package com.company;

public class Main {

    public static void main(String[] args) {
        double[] bub = {3.3, 5.2, -8.4, -9.4, 22.5, -56.9, 37.9, -12.8, 53.4, -54.6, 13.01, 37.62, -53.77, 24.8, -29.04};
        double err = 0;
        int kuk = 0;
        boolean d = false;
        for (double dub : bub) {
            if (dub < 0) {
                d = true;
            } else if (d){
                kuk++;
                err += dub;
            }
        }
        System.out.println(err / kuk);
    }
}
