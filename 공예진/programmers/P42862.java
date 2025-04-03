//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42862
//시간: 0.04ms
//메모리: 90.9MB

import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int cnt = 0;
        int[] clothes = new int[n];
        Arrays.fill(clothes, 1);
        for (int l : lost) {
            clothes[l - 1]--;
        }

        for (int r : reserve) {
            clothes[r - 1]++;
        }

        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] == 0) {
                // 앞사람에게 빌릴 수 있는 지 확인
                if (i > 0 && clothes[i - 1] > 1) {
                    clothes[i - 1]--;
                    clothes[i]++;
                }
                // 뒷사람에게 빌릴 수 있는 지 확인
                else if (i < clothes.length - 1 && clothes[i + 1] > 1) {
                    clothes[i + 1]--;
                    clothes[i]++;
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] != 0) {
                answer++;
            }
        }
        return answer;
    }
}