//문제 링트 https://www.acmicpc.net/problem/1157
//시간 244ms
//메모리 21104KB


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 'A';
            count[num]++;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = (char) (i + 'A');
            } else if (max == count[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
