package org.example;

public class FactorialwithRecusrion {
    public static void main(String[] args) {

        int num = 3;

        int answer = fact(num);
        System.out.println(answer);

    }

    public static int fact(int n) {
        if (n == 1)
            return 1;

        return n * fact(n - 1);
    }

}
