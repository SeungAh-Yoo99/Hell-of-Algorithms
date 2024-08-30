//문제 링크: https://www.notion.so/0ac9b0da1ba44c5696456ae07226b6b7
//시간: 2176ms
//메모리: 43208KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] arr = br.readLine().split(" ");
            int N = Integer.parseInt(arr[0]);
            int M = Integer.parseInt(arr[1]);

            String[] stringArrayA = br.readLine().split(" ");
            String[] stringArrayB = br.readLine().split(" ");

            // 문자열 배열에서 정수형 배열로 변경
            int[] A = Arrays.stream(stringArrayA).mapToInt(Integer::parseInt).toArray();
            int[] B = Arrays.stream(stringArrayB).mapToInt(Integer::parseInt).toArray();

            // 오름차순으로 정렬
            Arrays.sort(A);
            Arrays.sort(B);

            int cnt = 0;

            // A와 B의 각 원소를 비교하여 A[j] > B[k]인 경우 cnt를 증가
            for (int j = 0; j < A.length; j++) {
                for (int k = 0; k < B.length; k++) {
                    if (A[j] > B[k]) {
                        cnt++;
                    } else {
                        break; // B[k]는 이미 A[j]보다 크거나 같음
                    }
                }
            }

            System.out.println(cnt);

        }
    }
}

