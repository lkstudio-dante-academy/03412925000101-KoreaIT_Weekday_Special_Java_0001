package Training.Training_09;

/*
 * Java 연습 문제 9
 * - 10 진수 -> 2 진수로 변환하기 (+ 재귀 호출 활용)
 * - 사용자로부터 10 진수를 입력 받아 해당 수를 2 진수로 변환해서 출력하기
 *
 * Ex)
 * 정수 입력 : 10
 * 결과 : 1010
 */

import java.util.Scanner;

/**
 * Training 9
 */
public class CT01Training_09 {
    /** 초기화 */
    public static void start(String[] args) {
        Scanner oScanner = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int nVal = oScanner.nextInt();

        System.out.print("결과 : ");
        printBinary(nVal);
    }

    /** 2 진수를 출력한다 */
    private static void printBinary(int a_nVal) {
        // 재귀 호출이 불가능 할 경우
        if(a_nVal <= 0) {
            return;
        }

        printBinary(a_nVal / 2);
        System.out.printf("%d", a_nVal % 2);
    }
}
