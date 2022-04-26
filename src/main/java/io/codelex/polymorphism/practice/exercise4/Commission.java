package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double totalSales;
    private double comission;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.comission = comissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;

    }

    public double pay() {
        double pay = super.pay() + (totalSales * comission);
        totalSales = 0;
        return pay;
    }

    public String toString() {
        String result = super.toString();
        result += "\nCurrent sales: " + totalSales;
        return result;
    }

}
