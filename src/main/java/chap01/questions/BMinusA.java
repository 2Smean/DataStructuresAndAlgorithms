package chap01.questions;

import java.util.Scanner;

public class BMinusA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = minus(sc.nextInt(), sc.nextInt());

        if (result == -1) {
            System.out.println("a보다 큰 값을 입력하세요!");
        } else {
            System.out.println("b - a는 " + result + "입니다.");
        }
    }

    private static int minus(int a, int b) {
        if (b <= a) {
            return -1;
        }
        return b-a;
    }
}
