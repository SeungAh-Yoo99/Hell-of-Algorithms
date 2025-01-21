//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42578
//시간: 1.36ms
//메모리: 85.4MB

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer=1; // 곱해줘야 해서 초기값 1로 설정
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < clothes.length;i++){
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);// 갯수만 중요 함
        }
        for (String key : map.keySet()) {
            answer *= map.get(key)+1; // 맵 순회하면서 곱해줬음
        }
        return answer-1;//아무것도 안입었을 때 제외하고 반환
    }
}
