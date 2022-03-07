package io.codelex.classesandobjects.exercise5;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Wrong day!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        if (month >= 0 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Wrong month!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Wrong year!");
        }
    }

    public int getYear() {
        return year;
    }



    public void displayDate() {
        System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
    }
}
