//문제링크 https://www.acmicpc.net/problem/1010
//시간 120ms
//메모리 14416KB


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numT = Integer.parseInt(br.readLine());

        for (int i = 0; i < numT; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long numN = Long.parseLong(st.nextToken());
            long numM = Long.parseLong(st.nextToken());
            long result = 1;

            for (int j = 0; j < numN; j++) {
                result *= (numM - j);
                result /= (j + 1);
            }
            System.out.println(result);
        }
    }
}
