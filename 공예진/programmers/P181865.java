//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181865
//시간: 0.16ms
//메모리: 75.9MB

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] arr = binomial.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        switch (arr[1]) {
            case "+" : answer = a + b; break;
            case "-" : answer = a - b; break;
            case "*" : answer =  a * b; break;
        }
        return answer;
    }
}