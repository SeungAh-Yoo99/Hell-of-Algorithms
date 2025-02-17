//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181836
//시간: 0.59ms
//메모리: 89.1MB

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;
        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < picture[i].length(); j++) {
                sb.append(String.valueOf(picture[i].charAt(j)).repeat(k));
            }

            for (int j = 0; j < k; j++) {
                answer[idx++] = sb.toString();
            }
        }
        return answer;
    }
}