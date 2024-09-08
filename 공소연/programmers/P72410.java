// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/72410
// 시간: 4.54ms
// 메모리: 76.1MB

class Solution {
    public String solution(String new_id) {
      
        // 1단계: 대문자 -> 소문자
        String one = new_id.toLowerCase();
        
        // 2단계: 소문자, 숫자, -, _, .만 가능
        String two = "";
        
        char cur;
        for (int i = 0; i < one.length(); i++) {
            cur = one.charAt(i);
            if (Character.isDigit(cur) || Character.isLowerCase(cur) || cur == '-' || cur == '_' || cur == '.') {
                two += String.valueOf(cur);
            }
        }
        
        // 3단계: .. -> .
        while (two.contains("..")) {
            two = two.replace("..", ".");
        }
        
        // 4단계: 처음과 끝 . 제거
        if (two.length() > 0 && two.charAt(0) == '.') {
            two = two.substring(1, two.length());
        }
        if (two.length() > 0 && two.charAt(two.length() - 1) == '.') {
            two = two.substring(0, two.length() - 1);
        }
        
        // 5단계: isEmpty -> a 대입
        if (two.equals("")) {
            two += "a";
        }
        
        // 6단계: 15자까지만 가능, 끝 마침표 제거
        if (two.length() >= 16) {
            two = two.substring(0, 15);
            if (two.charAt(two.length() - 1) == '.') {
                two = two.substring(0, two.length() - 1);
            }
        }
        
        // 7단계: if length <= 2: 마지막 문자 반복 until length == 3
        String lastChar = String.valueOf(two.charAt(two.length() - 1));
        while (two.length() <= 2) {
            two += lastChar;
        }
        
        return two;
    }
}
