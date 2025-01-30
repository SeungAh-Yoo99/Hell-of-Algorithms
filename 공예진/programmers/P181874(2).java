//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181874
//시간: 0.02ms
//메모리: 89.9MB

class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        myString = myString.replace('a', 'A');
        return myString;
    }
}