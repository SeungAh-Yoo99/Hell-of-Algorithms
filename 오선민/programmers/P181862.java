// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181862?language=java
// 시간: 96.27 ms
// 메모리: 99.9 MB

package programmers;

public class P181862 {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("[abc]");

        if (answer.length == 0) {
            return new String[]{"EMPTY"};
        }

        return java.util.Arrays.stream(answer)
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);
    }
}