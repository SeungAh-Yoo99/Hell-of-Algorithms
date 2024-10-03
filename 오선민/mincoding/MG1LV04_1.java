// 문제 링크: https://pro.mincoding.co.kr/problem-step/1/level/7/detail/G1LV04_%EC%9E%85%EB%A0%A5%EA%B0%92%EC%9D%84
// 시간: 79mb
// 메모리: 22MB

import java.util.Scanner;

public class MG1LV04_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}
