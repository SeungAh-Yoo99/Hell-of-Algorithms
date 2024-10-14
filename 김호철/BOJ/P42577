// 문제 링크:https://www.acmicpc.net/problem/42577
// 시간: 341.55ms
// 메모리: 97.9MB

import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book); //정렬했음(정렬을하면 문자열순으로 나와서 다음 것만 비교 해도 됨)
        
        for(int i = 0; i < phone_book.length -1 ; i++){
            
            if(phone_book[i+1].startsWith(phone_book[i])){ // 다음께 전꺼를 품고있으면 접두사로 판별했음
                return false;
            }
        }
        return answer;
    }
}
