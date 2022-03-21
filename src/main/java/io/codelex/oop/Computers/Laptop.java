package io.codelex.oop.Computers;

import java.util.Objects;

public class Laptop extends Computer {

    private String batteryParameter;

    public Laptop(String processor, String ram, String graphicsCard, String company, String model, String batteryParameter) {
        super(processor, ram, graphicsCard, company, model);
        this.batteryParameter = batteryParameter;
    }

    public String getBatteryParameter() {
        return batteryParameter;
    }

    public void setBatteryParameter(String batteryParameter) {
        this.batteryParameter = batteryParameter;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + getProcessor() + '\'' +
                ", ram='" + getRam() + '\'' +
                ", graphicsCard='" + getGraphicsCard() + '\'' +
                ", company='" + getCompany() + '\'' +
                ", model='" + getCompany() + '\'' +
                ", batteryParameter='" + getBatteryParameter() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return getProcessor().equals(laptop.getProcessor()) && getRam().equals(laptop.getRam()) && getGraphicsCard().equals(laptop.getGraphicsCard()) && getCompany().equals(laptop.getCompany()) && getModel().equals(laptop.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryParameter);
    }
}
