//문제 링크: https://www.acmicpc.net/problem/2607
//시간: 100ms
//메모리: 14216KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String first = br.readLine();

        // 첫 번째 단어의 문자를 map에 담기
        Map<Character, Integer> firstMap = new HashMap<>();
        for (char c : first.toCharArray()) {
            firstMap.put(c, firstMap.getOrDefault(c, 0) + 1);
        }

        int answer = 0;

        for (int i = 0; i < N - 1; i++) {
            String str = br.readLine();

            // 비교할 단어의 문자를 map에 담기
            Map<Character, Integer> strMap = new HashMap<>();
            for (char c : str.toCharArray()) {
                strMap.put(c, strMap.getOrDefault(c, 0) + 1);
            }

            int extra = 0; // strMap에만 있는 문자 개수의 합
            int missing = 0; // firstMap에만 있는 문자 개수의 합

            // firstMap 기준 문자 비교
            for (char c : firstMap.keySet()) {
                int firstCount = firstMap.getOrDefault(c, 0);
                int strCount = strMap.getOrDefault(c, 0);
                if (firstCount > strCount) {
                    missing += firstCount - strCount; // firstMap에 문자가 더 많으면 missing에 추가
                } else if (firstCount < strCount) {
                    extra += strCount - firstCount; // strMap에 문자가 더 많으면 extra에 추가
                }
            }

            // strMap에만 있는 문자를 extra에 추가
            for (char c : strMap.keySet()) {
                if (!firstMap.containsKey(c)) {
                    extra += strMap.get(c);
                }
            }

            // 비슷한 단어의 조건을 만족하는 지 확인
            if (missing <= 1 && extra <= 1) {
                answer++;
            }

        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

}
