//문제 링크 : https://www.acmicpc.net/problem/12605
//시간 : 116ms
//메모리 : 14344KB

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[][] strArr = new String[n][];

        for (int i = 0; i < n; i++) {
            String inputLine = br.readLine();
            strArr[i] = inputLine.split(" ");
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Case #" + (i + 1) + ": ");
            for (int j = strArr[i].length - 1; j >= 0; j--) {
                System.out.print(strArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
