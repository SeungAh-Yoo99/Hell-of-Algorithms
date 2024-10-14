//문제 링크: https://www.acmicpc.net/problem/3003
//시간: 116ms
//메모리: 15820KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] chess = {1, 1, 2, 2, 2, 8};
        String[] arr = br.readLine().split(" ");

        int piece = 0;
        for (int i = 0; i < 6; i++) {
            piece = Integer.parseInt(arr[i]);
            bw.write(chess[i] - piece + " ");
        }

        bw.flush();
        bw.close();
    }
}
