package org.example;

public class SumCalculator {
    int sum(int n){
        if (n <= 0) {
            throw new IllegalArgumentException("n має бути додатнім числом");
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
    int someChanges;
}
