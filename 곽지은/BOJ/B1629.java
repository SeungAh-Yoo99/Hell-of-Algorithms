//문제링크 https://www.acmicpc.net/problem/1629
//메모리 14152KB
//시간 100ms


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long numA = Long.parseLong(st.nextToken());
        long numB = Long.parseLong(st.nextToken());
        long numC = Long.parseLong(st.nextToken());
        System.out.print(fastPower(numA, numB, numC));
    }

    public static long fastPower(long numA, long numB, long numC) {
        if (numB == 0) return 1;
        if (numB % 2 == 1) {
            return (numA * fastPower(numA, numB - 1, numC)) % numC;
        }
        long halfPower = fastPower(numA, numB / 2, numC) % numC;
        return (halfPower * halfPower) % numC;
    }
}
