//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181878
//시간: 33.22ms
//메모리: 98.2MB

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i < myString.length(); i++) {
            char c1 = myString.charAt(i);
            if (Character.isLowerCase(c1)) {
                myString = myString.replace(c1, Character.toUpperCase(c1));
            }
        }

        System.out.println(myString);

        for (int i = 0; i < pat.length(); i++) {
            char c2 = pat.charAt(i);
            if (Character.isLowerCase(c2)) {
                pat = pat.replace(c2, Character.toUpperCase(c2));
            }
        }

        System.out.println(pat);

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