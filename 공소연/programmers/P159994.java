// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/159994?language=java
// 시간: 0.04ms
// 메모리: 80.6MB

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String result = "No";
        int idx = 0;
        int lastIdx2 = 0;
        
        for (int idx1 = 0; idx1 < goal.length; idx1++) {
            boolean found = false;
            
            // cards1에서 goal[idx1]을 찾기
            if (idx < cards1.length && cards1[idx].equals(goal[idx1])) {
                idx++;
                found = true;
            }
            
            // cards2에서 goal[idx1]을 찾기
            if (!found) {
                for (int idx2 = lastIdx2; idx2 < cards2.length; idx2++) {
                    if (cards2[idx2].equals(goal[idx1])) {
                        lastIdx2 = idx2 + 1; 
                        found = true;
                        break;
                    }
                }
            }
            
            if (!found) {
                return result;
            }
        }
        
        return "Yes"; 
    }
}
