package com.zoewang;



public class Bootstrap {

    public static void main(String[] args) {
        try {
            System.out.println("hello world");
            new Bootstrap();
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}