package chap01.questions;

public class Median {
    private static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }

    //med3 보다 효율이 떨어지는 메서드
    //논리연산으로 인한 분기 예측, CPU 성능 저하가 발생?
    private static int med4(int a, int b, int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a)) {
            return a;
        } else if ((a > b && c < b) || (a < b && c > b)) {
            return b;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println("세 정수의 중앙값은 " + med3(1,2,3) + "입니다.");
        System.out.println("세 정수의 중앙값은 " + med4(1,2,3) + "입니다.");
    }
}
