package 김혜빈.programmers;

// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42576

import java.util.*;

public class P42576 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant); // 참가자 정렬
        Arrays.sort(completion); // 완주자 정렬

        for (int i = 0; i < completion.length; i++) {
            // 정렬 시 단 완주하지 못 한 단 1명부터 인덱스가 달라지므로, 달라진 인덱스의 참가자가 완주하지 못 한 사람
            if (!participant[i].equals(completion[i])) return participant[i];
        }

        return participant[participant.length - 1]; // 반복문 종료 시 완주하지 못 한 사람은 마지막 인덱스의 사람
    }
}
