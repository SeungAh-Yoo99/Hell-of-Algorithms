// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/76501
// 시간: 0.10 ms
// 메모리: 33.5 MB

function solution(absolutes, signs) {
    let result = 0;
    signs.forEach((sign, i) => {
        if(sign) result += absolutes[i];
        else result -= absolutes[i];
    });
    return result;
}
