//문제 링크 https://www.acmicpc.net/problem/1924
//시간 100ms
//메모리  14144KB


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);

        int day = 0;
        for (int i = 0; i < x - 1; i++) {
            day += b[i];
        }
        int result = (day + y) % 7;
        System.out.println(a[result]);
    }
}


