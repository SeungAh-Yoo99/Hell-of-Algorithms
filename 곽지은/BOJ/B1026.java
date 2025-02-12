//문제 링크 https://www.acmicpc.net/problem/1026
//시간 120ms
//메모리 15996KB


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int numN = Integer.parseInt(br.readLine());
        int[] numA = new int[numN];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numN; i++) {
            numA[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numA);

        Integer[] numB = new Integer[numN];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numN; i++) {
            numB[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numB, Comparator.reverseOrder());

        int ans = 0;
        for (int i = 0; i < numN; i++) {
            ans += numA[i] * numB[i];
        }

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
