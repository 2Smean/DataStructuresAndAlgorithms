package chap01.questions;

public class GaussAlgorithm {

    public static void main(String[] args) {
        System.out.println(addition(10));
        System.out.println(sumOf(6,4));
    }

    private static int addition(int n) {
        return n % 2 == 0 ? (1 + n) * (n / 2) : ((1 + n) * (n / 2) + ((1 + n) / 2));
    }

    private static int sumOf(int a, int b) {
        int sum = 0;

        if (a > b) {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
