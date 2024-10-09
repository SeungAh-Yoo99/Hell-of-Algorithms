//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12981
//시간: 0.22ms
//메모리: 90.5MB

import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        int round=0,loser=0; // 우선 0으로 초기화
        
        List<String> list = new ArrayList<>();
        
        list.add(words[0]); // 첫 단어 넣고 시작
        
        for(int i = 1; i < words.length ; i++){
            if(words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1) 
               || list.contains(words[i])) //끝말있기, 중복 단어 검증
            {
                round = i / n+1; // 사람수 +1번 째가 다음라운드 이기 때문에
                loser = i % n+1; // 0번은 없으므로 사람수 +1 에서 나눔
                break;
            }
            list.add(words[i]); // 다음 검증 위해 단어 넣었음
        }
        answer[0]=loser;
        answer[1]=round;
        return answer;
    }
}
