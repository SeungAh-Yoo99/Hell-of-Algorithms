// 문제 링크: https://www.acmicpc.net/problem/16472
// 시간: 164ms
// 메모리: 17092KB

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        // 1. 문자열의 종류 개수 확인
        // 2. 문자열의 길이 확인
        // abbcaccba
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, end = 0, count = 0, answer = 0;
        while (start <= end && end < str.length()) {
            if (!map.containsKey(str.charAt(end))) {
                map.put(str.charAt(end), 1);
            } else {
                map.put(str.charAt(end), map.get(str.charAt(end)) + 1);
            }
            if (map.keySet().size() > n) {
                count--;
                if (map.get(str.charAt(start)) == 1) {
                    map.remove(str.charAt(start));
                } else {
                    map.put(str.charAt(start), map.get(str.charAt(start)) - 1);
                }
                start++;
            }
            end++;
            count++;

            if (map.keySet().size() <= n) {
                answer = Math.max(count, answer);
            }
        }

        System.out.println(answer);
    }
}
