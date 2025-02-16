//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181841
//시간: 0.06ms
//메모리: 72.2MB

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex)) {
                sb.append(str_list[i]);
            }
        }
        return sb.toString();
    }
}