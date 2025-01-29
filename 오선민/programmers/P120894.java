/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120894#
 * 시간:  0.14 ms
 * 메모리:  82.8 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;
import java.util.*;

public class P120894 {
    public long solution(String numbers) {
        HashMap<String, Integer> map = new HashMap<>();
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            map.put(arr[i], i);
        }

        int index = 0;
        StringBuilder result = new StringBuilder();
        while (index < numbers.length()) {
            for (String key : map.keySet()) {
                if (numbers.startsWith(key, index)) {
                    result.append(map.get(key));
                    index += key.length();
                    break;
                }
            }
        }

        long answer = Long.parseLong(result.toString());
        return answer;
    }
}
