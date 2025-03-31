/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120894
 * 시간: 1.24 ms
 * 메모리: 85.6 MB
 * 승드백 반영: arr 배열에 담긴 String number가 이미 arr의 인덱스와 대칭되므로 따로 map에 담아주지 않고 arr 그대로 사용해도 될 거 같아요!
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P120894re {
    public long solution(String numbers) {
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < arr.length; i++) {
            numbers = numbers.replaceAll(arr[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}
