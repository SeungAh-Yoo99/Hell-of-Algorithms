import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/23971
 * 시간 : 476ms
 * 메모리 : 15832KB
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken()); // height
        int w = Integer.parseInt(st.nextToken()); // width
        int n = Integer.parseInt(st.nextToken()); // height 띄우기 
        int m = Integer.parseInt(st.nextToken()); // width 띄우기
        int answer = 0;
        for (int i = 0; i < h; i += n + 1) { // n 만큼 띄우기
            for (int j = 0; j < w; j += m + 1) { // m 만큼 띄우기
                answer++;
            }
        }
        System.out.println(answer);
    }
}
