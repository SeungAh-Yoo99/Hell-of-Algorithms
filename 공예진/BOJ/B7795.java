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

            int[] A = Arrays.stream(stringArrayA).mapToInt(Integer::parseInt).toArray();
            int[] B = Arrays.stream(stringArrayB).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(A);
            Arrays.sort(B);

            int cnt = 0;

            for (int j = 0; j < A.length; j++) {
                for (int k = 0; k < B.length; k++) {
                    if (A[j] > B[k]) {
                        cnt++;

                    } else {
                        break;
                    }
                }
            }

            System.out.println(cnt);

        }
    }
}

