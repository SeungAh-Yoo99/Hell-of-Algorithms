//문제 링크: https://www.acmicpc.net/problem/1515
//시간: 88ms
//메모리: 13756KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int pointer = 0;
        int base = 0;

        while (true) {
            base++;
            String tmp = Integer.toString(base);

            for (int i = 0; i < tmp.length(); i++) {
                if (tmp.charAt(i) == str.charAt(pointer)) {
                    pointer++;
                }

                if (pointer == str.length()) {
                    System.out.println(base);
                    return;
                }
            }
        }
    }
}

