package com.example.demo;

public class MathEntity {
    private String action;
    private double a;
    private double b;
    private double c;

    public MathEntity(String action, double a,double b,double c){
        this.action = action;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
