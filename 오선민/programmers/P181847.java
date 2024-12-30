// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181847?language=java
// 시간: 0.07 ms
// 메모리: 80.3 KB

package programmers;

public class P181847 {
    public String solution(String n_str) {
        return n_str.replaceFirst("^0+", "");
    }
}
