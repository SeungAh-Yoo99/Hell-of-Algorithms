//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181846
//시간: 500.87ms
//메모리: 117MB


import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        return String.valueOf(A.add(B));
    }
}