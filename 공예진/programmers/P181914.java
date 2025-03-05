//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181914
//시간: 5.19ms
//메모리: 75.3MB

class Solution {
    public int solution(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += number.charAt(i) - '0';
        }

        return sum % 9;
    }
}