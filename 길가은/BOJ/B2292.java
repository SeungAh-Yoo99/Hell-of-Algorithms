import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/2292
 * 시간 : 104ms
 * 메모리 : 14236KB
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total = 1; // 1+6의 배수 값
        int i = 0; //6이 몇번 곱해졌는지
        while(n > total) {
            i++;
            total += 6*i;
        }
        System.out.println(i+1);
    }
}
