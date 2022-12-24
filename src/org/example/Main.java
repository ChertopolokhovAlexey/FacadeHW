package org.example;

public class Main {
    public static void main(String[] args) {
                BinOps bins = new BinOps();
                //демонстрация
        String a = "0101";
        String b = "0011";
        System.out.println(bins.sum(a, b));
        System.out.println(bins.mult(a, b));
    }
}
