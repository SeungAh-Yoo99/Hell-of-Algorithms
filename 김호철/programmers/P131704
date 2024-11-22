//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/131704
//시간: 107.03ms
//메모리: 149MB

import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> st = new Stack<>(); // 스택 이용

        int answer = 0; // 트럭에 실린 택배 상자 갯수

        int target = 1; // 실려야하는 n번 상자

        int point = 0; // 메인 컨테이너 벨트의 인덱스 값

        while (point < order.length) {
            if (target == order[point]) { // 메인 벨트에서 꺼내서 트럭으로 바로 이동
                answer++;
                target++;
                point++;
            } 
            else if (!st.isEmpty() && st.peek() == order[point]) { // 스택에서 트럭으로 이동
                st.pop();
                answer++;
                point++;
            } 
            else if (target <= order.length) { // 메인 벨트에서 스택으로 이동
                st.push(target);
                target++;
            } 
            else { 
                break;
            }
        }
        return answer;
    }
}
