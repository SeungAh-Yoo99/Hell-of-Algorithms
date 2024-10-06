// 문제 링크: https://pro.mincoding.co.kr/problem-step/1/level/8/detail/G1LV04_5_index%EA%B0%92
// 시간: 81ms
// 메모리: 22MB

import java.util.Scanner;

public class MG1LV04_5 {
    public static int checkIndex(int n) {
        int [] arr = new int[6];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 1;
        arr[5] = 8;
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(checkIndex(t));
        sc.close();
    }
}
