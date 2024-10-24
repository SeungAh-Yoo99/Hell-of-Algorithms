//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/92341
//시간: 11.16ms
//메모리: 88.6MB


import java.util.*;
class Solution {
    public static int[] answer;
    public static String[] In,Out;
    public static Map<String, Integer> map = new HashMap<>(); // 차량 번호, 시간
    public static Map<String, Integer> payMap = new TreeMap<>(); // 차량 번호, 총 금액(트리맵을 사용하면key기준 정렬할 수 있다. 
    public static int baseTime,baseFee,unitTime,unitFee;          //                  ->entrySet에서 key 순으로 순회 가능)
    public static StringTokenizer st;

    public int[] solution(int[] fees, String[] records) {
        
        baseTime = fees[0]; //기본 시간
        baseFee = fees[1]; // 기본 요금
        unitTime = fees[2]; // 단위 시간
        unitFee = fees[3]; // 단위 요금
        
        for(int i = 0 ; i < records.length; i++){
            st = new StringTokenizer(records[i]);
            String[] time = st.nextToken().split(":");
            int totalTime = Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]); // 총 시간을 넣었다(분 기준)
            String carN = st.nextToken();
            String state = st.nextToken();
            if(state.equals("IN")){
                map.put(carN,totalTime); // 입차라면 등록
            }
            else{
                totalTime = totalTime - map.get(carN); // 출차라면 입차 출차시간에서 입차시간을 뺀 후
                payMap.put(carN,payMap.getOrDefault(carN,0)+totalTime); // 총 주차시간에 더함
                map.remove(carN); // 입차 기록 삭제
            }
        }
                
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String carN = entry.getKey(); // 입차기록만 있고 출차기록은 없는 차들
            int time = 1439 - entry.getValue();  // 11시59분 즉 1439분에서 입차시간 빼면 됨                                       
            payMap.put(carN,payMap.getOrDefault(carN,0)+time); // 총 주차시간에 더함            
        }
        
        answer = new int[payMap.size()]; // answer의 사이즈는 payMap의 사이즈와 같음     
        int i = 0;
        
        for (Map.Entry<String, Integer> entry : payMap.entrySet()) {
            int time = entry.getValue(); // 차량별 총 주차시간이 저장된 트리맵을 순회하면서
            
            if(time <= baseTime){
                answer[i] = baseFee; // 기본 시간 보다 작으면 기본요금만 더해준다.
                
            }
            else{                // 기본 시간보다 길면
                double temp = Math.ceil((double)(time-baseTime)/unitTime) * unitFee + baseFee; //여기서 double안적어줘서 시간 좀 걸림
                                                                                              // (double) 안쓰면 올림에서 예외 케이스가 발생한다.
                answer[i] = (int)temp; // (올림)(총 주차시간 - 기본 시간)/단위시간 * 단위 요금 + 기본 요금
            }
            i++;
        }
        
        return answer;
        
    }
}
