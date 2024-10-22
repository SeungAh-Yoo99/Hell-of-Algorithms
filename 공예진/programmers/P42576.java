//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=java
//시간: 2.47ms
//메모리: 74.5MB

import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length - 1];
    }
}