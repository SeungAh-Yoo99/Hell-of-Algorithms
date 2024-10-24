// 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/92341?language=java
// 시간: 10.72ms
// 메모리: 77.9MB

import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> inoutMap = new HashMap<>(); // 인아웃에 대한 맵
        Map<Integer, Integer> duringMap = new TreeMap<>(); // 걸린 시간에 대한 맵
        
        String[] record, time;
        int hour, minute, carNum, total, duration, cal;
        String inout;
        for (int i = 0; i < records.length; i++) {
            record = records[i].split(" ");
            time = record[0].split(":");
            carNum = Integer.parseInt(record[1]);
            
            hour = Integer.parseInt(time[0]);
            minute = Integer.parseInt(time[1]);
            total = hour * 60 + minute;
            
            inout = record[2];
            
            if (inout.equals("IN")) {
                inoutMap.put(carNum, total);
            } else {
                duration = total - inoutMap.get(carNum);
                duringMap.put(carNum, duringMap.getOrDefault(carNum, 0) + duration);
                inoutMap.remove(carNum);
            }
        }
        
        if (!inoutMap.isEmpty()) {
            for (Integer key : inoutMap.keySet()) {
                duringMap.put(key, duringMap.getOrDefault(key, 0) + 
                           (23 * 60 + 59) - inoutMap.get(key));
            }
        }
        
        int[] answer = new int[duringMap.size()];
        int idx = 0;
        for (int during : duringMap.keySet()) {
            answer[idx++] = calculate(duringMap.get(during), fees);
        }

        return answer;
    }
    
    int calculate(int duration, int[] fees) {
        if (duration <= fees[0]) {
            return fees[1];
        } else {
            int rest = duration - fees[0];
            if (rest % fees[2] > 0) {
                return fees[1] + (rest/fees[2] + 1) * fees[3];
            } else {
                return fees[1] + rest/fees[2] * fees[3]; 
            }
        }
    }
}
