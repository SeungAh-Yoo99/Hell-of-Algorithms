import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/23971
 * 시간 : 100ms
 * 메모리 : 14164KB
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        System.out.println((int)(Math.ceil((h / (double)(n+1))) * Math.ceil((w / (double)(m+1)))));
    }
}
