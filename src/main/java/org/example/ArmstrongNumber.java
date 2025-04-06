package org.example;

public class ArmstrongNumber {
    public static boolean Armstrong(int num) {
        int originalNum = num;
        if (num < 0) {
            return false;
        }
        double sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + Math.pow(digit, 3);
            num = num / 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        int num = 10;
        boolean value = Armstrong(num);
        System.out.println(value);
    }
}
