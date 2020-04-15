package com.zoewang;



public class Bootstrap {
    private App app;

    public static void main(String[] args) {
        try {
            System.out.println("starting");
            new Bootstrap();
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private Bootstrap() {
        app = new App();
        process();
    }

    private void process() {
        app.handleRequest(null, null);
    }
}