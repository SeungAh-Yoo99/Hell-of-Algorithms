/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181836
 * 시간: 0.60 ms
 * 메모리: 87.8 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P181836 {
    public String[] solution(String[] picture, int k) {
        return multiplePicture(picture, k);
    }

    private static String[] multiplePicture(String[] picture, int k) {
        String[] result = new String[picture.length * k];
        int index = 0;
        for (String row : picture) {
            StringBuilder add = new StringBuilder();
            for (char c : row.toCharArray()) {
                add.append(String.valueOf(c).repeat(k));
            }
            for (int i = 0; i < k; i++) {
                result[index++] = add.toString();
            }
        }
        return result;
    }
}
