//문제 링크 https://www.acmicpc.net/problem/1316
//시간 104ms
//메모리 14288KB


import java.io.*;

public class Main {
    static int prev;
    static int[] alphabet; 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); 
        int count = num;

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            prev = -1; 
            alphabet = new int[26];
            for (int j = 0; j < str.length(); j++) {
                int now = str.charAt(j); 

                if (prev != now) {
                    if (alphabet[now - 97] == 0) {
                        alphabet[now - 97]++;
                        prev = now;
                    } else {
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
