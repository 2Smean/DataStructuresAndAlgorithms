package chap01.questions;

public class SumWhile {

    public static void main(String[] args) {
        int n = 8;

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("1부터 " + n + "까지의 합은" + sum + "입니다");
        System.out.println("i의 최종값=" + i);
    }
}
