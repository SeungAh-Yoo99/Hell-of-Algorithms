/**
 * 문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/181890
 * 시간: 0.05 ms
 * 메모리: 91.1 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;
import java.util.Arrays;

public class P181890 {
    public String[] solution(String[] str_list) {
        return filteredList(str_list);
    }

    private static String[] filteredList(String[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals("l")) {
                return Arrays.copyOfRange(list, 0, i);
            } else if (list[i].equals("r")) {
                return Arrays.copyOfRange(list, i+1, list.length);
            }
        }
        return new String[0];
    }
}
