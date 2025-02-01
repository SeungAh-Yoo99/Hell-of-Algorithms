// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/159994?language=java
// 시간: 0.02ms
// 메모리: 91.6MB

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String result = "No";
        int lastIdx1 = 0;
        int lastIdx2 = 0;

        for (int idx1 = 0; idx1 < goal.length; idx1++) {
            boolean found = false;

            // cards1에서 goal[idx1]을 찾기
            if (lastIdx1 < cards1.length && cards1[lastIdx1].equals(goal[idx1])) {
                lastIdx1++;
                found = true;
            }

            // cards2에서 goal[idx1]을 찾기
            if (!found) {
                if (lastIdx2 < cards2.length && cards2[lastIdx2].equals(goal[idx1])) {
                    lastIdx2++;
                    found = true;
                }
            }
            
            
            if (!found) { // cards2에서도 못찾았을 때
                return result;
            }
        }

        return "Yes"; 
    }
}
