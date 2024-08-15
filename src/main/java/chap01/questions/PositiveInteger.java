package chap01.questions;

import java.util.Scanner;

public class PositiveInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요:");
        int pi = sc.nextInt();
        digitOutput(pi);
    }

    private static void digitOutput(int n) {
        int length = (int) (Math.log10(n) + 1);
        System.out.println("그 수는 " + length + "자리입니다.");
    }
}
