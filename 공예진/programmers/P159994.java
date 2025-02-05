//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/159994
//시간: 0.04ms
//메모리: 72.7MBMB

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < goal.length; i++) {
            if (index1 < cards1.length && cards1[index1].equals(goal[i])) {
                index1++;
                continue;
            } else if (index2 < cards2.length && cards2[index2].equals(goal[i])) {
                index2++;
                continue;
            } else {
                answer = "No";
                return answer;
            }
        }
        return answer;
    }
}