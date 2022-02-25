package io.codelex.arithmetic.exercises;

public class Exercise8 {
    public static void main(String[] args) {
        payment(7.50, 35);
        payment(8.20, 47);
        payment(10, 73);
    }


    public static void payment(double basePay, double hoursWorked) {
        double overTimePayment = basePay * 1.5;
        double overTime = hoursWorked - 40;

        double standardPayment = hoursWorked * basePay;
        double standardAndOvertimePayment = (basePay * 40) + (overTime * overTimePayment);

        if (basePay < 8) {
            System.out.println("Error has occurred.");
        } else if (hoursWorked > 60) {
            System.out.println("Error has occurred.");
        } else if (hoursWorked <= 40) {
            System.out.println("Employee has earned " + standardPayment);
        } else System.out.println("Employee has earned " + standardAndOvertimePayment);
    }
}
