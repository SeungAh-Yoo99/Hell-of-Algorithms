import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String str = t.substring(i, i + p.length());

            Long num = Long.parseLong(str);
            Long pNum = Long.parseLong(p);

            if (num <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}