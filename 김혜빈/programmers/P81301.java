package 김혜빈.programmers;

// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/81301

public class P81301 {

    /**
     * 문자를 받아 정수형인지 확인하는 함수
     * @param c 문자
     * @return 정수형인 경우 true, 아닌 경우 false
     */
    public boolean isNumber(char c) {
        int check = c - '0';
        if(check >= 0 && check < 10) return true;
        else return false;
    }

    /**
     * 문자열을 받아 정수값으로 바꿔주는 함수
     * @param s 문자열
     * @return 문자열 형태의 정수값
     */
    public String toNumber(String s) {
        switch(s) {
            case "zero":
                return "0";
            case "one":
                return "1";
            case "two":
                return "2";
            case "three":
                return "3";
            case "four":
                return "4";
            case "five":
                return "5";
            case "six":
                return "6";
            case "seven":
                return "7";
            case "eight":
                return "8";
            case "nine":
                return "9";
            default:
                return "";
        }
    }

    public int solution(String s) {
        String result = ""; // 결과
        String tmp = ""; // 문자를 담는 임시 변수

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(isNumber(c)) { // 문자가 숫자인 경우
                result += c; // 결과 문자열에 문자 추가
                tmp = ""; // 임시 변수 초기화
            } else { // 문자가 알파벳인 경우
                tmp += c;
                String toNum = toNumber(tmp); // 문자열이 숫자가 되는지 확인
                if(toNum.equals("")) continue; // 숫자가 아닌 경우 continue
                else {
                    result += toNum; // 숫자인 경우 결과 문자열에 추가
                    tmp = ""; // 임시 변수 초기화
                }
            }
        }

        return Integer.parseInt(result);
    }
}
