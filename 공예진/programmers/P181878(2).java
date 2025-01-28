//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181878
//시간: 32.15ms
//메모리: 107MB

class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();

        for(int i = 0; i < myString.length(); i++) {
            if (i <= myString.length() - pat.length()) {
                String str = myString.substring(i, i + pat.length());

                if (str.equals(pat)) {
                    return 1;
                }
            }
        }

        return 0;
    }
}