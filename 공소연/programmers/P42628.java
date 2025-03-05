// 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42628
// 시간: 111.65ms
// 메모리: 121MB

import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        Map<Integer, Integer> minPq = new TreeMap<>();
        Map<Integer, Integer> maxPq = new TreeMap<>((a, b) -> b - a);

        StringTokenizer st;
        for (int i = 0; i < operations.length; i++) {
            st = new StringTokenizer(operations[i]);
            String command = st.nextToken();
            int value = Integer.parseInt(st.nextToken());

            if (command.equals("I")) {
                minPq.put(value, minPq.getOrDefault(value, 0) + 1);
                maxPq.put(value, maxPq.getOrDefault(value, 0) + 1);
            } else {
                int key = 0;
                if (value == 1) {
                    if (maxPq.size() == 0) continue;
                    key = getMaxOrMinValue(maxPq);
                } else {
                    if (minPq.size() == 0) continue;
                    key = getMaxOrMinValue(minPq);
                }
                removeValue(key, maxPq);
                removeValue(key, minPq);
            }
        }

        return new int[]{getMaxOrMinValue(maxPq), getMaxOrMinValue(minPq)};
    }
    
    int getMaxOrMinValue(Map<Integer, Integer> pq) {
        for (Integer key : pq.keySet()) {
            return key;
        }
        return 0;
    }
    
    void removeValue(int key, Map<Integer, Integer> pq) {
        if (pq.get(key) > 1) {
            pq.put(key, pq.getOrDefault(key, 0) - 1);
        } else {
            pq.remove(key);
        }
    }
}

// 삽입, 최댓값 삭제, 최솟값 삭제
// 빈 큐에서 삭제하라는 명령은 무시
// 값이 둘 이상인 경우 하나만 삭제
// 비어있으면 [0,0] 비어있지 않으면 [최댓값, 최솟값]
