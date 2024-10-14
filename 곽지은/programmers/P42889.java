//문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42889
//시간 : 158.42ms
//메모리 : 102MB


import java.util.*;


class Solution {
	//stageNum과 failedRate 2가지의 값을 고려해야 하므로, 
	//-> 두 값을 필드로 갖는 Step 객체를 내부 클래스로 선언
	
	//Comparable<T>는 클래스 자체 정의된 기준에 따라 객체 정렬하고 싶을 때 사용
    //		하나의 기준으로 구현하는 compareTo(T t) 메서드
    //Comparator<T>()는 객체와 매개변수를 비교하고 싶을 때 사용
    //	다양한 기준으로 객체 비교하는 compare() 메서드
    //-> 위 문제에서는 실패율을 기준으로 정렬하는 것이므로, Comparable<T>와 compareTo(T t) 사용
    class Step implements Comparable<Step> {
        int stageNum;
        double failedRate;
        
        Step(int stageNum, double failedRate) {
            this.stageNum = stageNum;
            this.failedRate = failedRate;
        }
        
        /*
         * compare 메서드 파라미터 뒤가 더 크면 음수 반환, 앞이 더 크면 양수 반환
         * public static int compare(double d1, double d2) {
         * 		if (d1 < d2)
         * 			return -1;         
         * 		if (d1 > d2)
         *			return 1; 
         */
        
        @Override
        public int compareTo(Step step) {
            if (Double.compare(step.failedRate, this.failedRate) == 0) {  //failedRate가 같다면
                return this.stageNum - step.stageNum;  //stageNum이 작은 순서대로 오름차순으로 정렬해줘
            }
            return Double.compare(step.failedRate, this.failedRate); //failedRate가 같지 않다면
            														 //	 실패율에 따라 정렬해줘 (내림차순)
        }
    }
    
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] denominator = new int[N + 1];
        int[] numerator  = new int[N + 1];
        
        //분자와 분모를 각각의 배열에 해당 값일 있을 때마다 ++ 해준다
        for (int stage : stages) {
            for (int i = 1; i <= N; i++) {
                if (stage >= i) denominator[i]++; //분모 : 현재 스테이지보다 같거나 큰 것의 수
                if (stage == i) numerator[i]++; //분자 : 현재 스테이지와 같은 수
            }
        }
        
        Step[] step = new Step[N];
        
        //stage를 순회하면서 분자와 분모 배열을 나누어 실패율을 해당 계산하여 step[i]에 초기화한다
        for (int i = 0; i < N; i++) {
            step[i] = new Step(i + 1, denominator[i + 1] == 0 
                                ? 0 : (float) numerator[i + 1] / denominator[i + 1]);
        }
        Arrays.sort(step); //Comparable 인터페이스 compareTo 메서드로 step객체를 정렬한다

        for (int i = 0; i < N; i++) {
            answer[i] = step[i].stageNum;
        }
        
        return answer;
    }
}
