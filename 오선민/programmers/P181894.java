/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181894
 * 시간: 4.75.05 ms
 * 메모리: 94.1 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181894 {
    public int[] solution(int[] arr) {
        return arr2(arr);
    }

    private static int[] arr2(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int idx = 0;

        for (int num : arr) {
            if (num == 2) {
                list.add(idx);
            }
            idx++;
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        } else if (list.size() == 1) {
            return new int[]{2};
        }
        else {
            int start = list.get(0);
            int end = list.get(list.size()-1)+1;
            return Arrays.copyOfRange(arr, start, end);
        }
    }
}