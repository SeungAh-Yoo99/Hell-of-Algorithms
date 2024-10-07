package 김혜빈.programmers;

// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/148653

public class P148653 {
    public int solution(int storey) {
        int cnt = 0; // 마법의 돌을 사용한 횟수

        while (storey > 0) { // 현재 층이 0층이 되거나 낮아지면 종료
            int i = storey % 10; // 현재 층수의 1의 자리
            int j = storey / 10 % 10; // 현재 층수의 10의 자리

            if ((i == 5 && j >= 5) || i > 5) { // 1의 자리가 5이고 10의 자리가 5 이상 OR 1의 자리가 6 이상
                cnt += 10 - i;
                storey += 10;
            } else cnt += i;
            storey /= 10; // 10으로 나누어 자릿수 줄이기
        }

        return cnt;
    }
}
