import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/9655
 * 시간 : 100ms
 * 메모리 : 14388KB
 */
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stone = Integer.parseInt(br.readLine());
        System.out.println(stone % 2 == 0 ? "CY" : "SK");
    }
}
