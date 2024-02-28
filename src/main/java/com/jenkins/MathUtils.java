package com.jenkins;

public class MathUtils {
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        if (y == 0) {
            return -1; 
        }
        return x / y;
    }
    public static void main(String[] args)
    {
        MathUtils cal = new MathUtils();
        int result = cal.subtract(7, 4);
        System.out.println(result);
    }
}