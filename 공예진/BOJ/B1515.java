//문제 링크: https://www.acmicpc.net/problem/1515
//시간: ms
//메모리: KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");

        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            int nextNum = Integer.parseInt(arr[i+1]);
            if (i == arr.length - 1) {
                if (num == cnt) {
                    System.out.println(cnt * 10);
                } else {
                    System.out.println(cnt * 10 + arr[i]);
                }
                break;
            }

            if (num > nextNum) {
                cnt++;
            }

            // 111111인 경우, 1/11/12/13/14

        }

    }

}
