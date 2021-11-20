package com.gtrxone;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(2, 2, 11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            if (goal > (bigCount * 5 + smallCount)) {
                return false;
            }
            return goal % 5 <= smallCount; // 11 - (2*5) = 1 <=1
        }
        return false;
    }
}
