//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181864
//시간: 3.07ms
//메모리: 73.7MB

class Solution {
    public int solution(String myString, String pat) {
        String str = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                str += 'B';
            } else {
                str += 'A';
            }
        }

        if (str.contains(pat)) {
            return 1;
        }
        return 0;
    }
}