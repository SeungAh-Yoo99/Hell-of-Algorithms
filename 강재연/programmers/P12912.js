// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12912
// 시간: 23.81 ms
// 메모리: 36.3 MB

function solution(a, b) {
    // 정렬이 되어있지 않기 때문에 혹시 a > b 이면 순서 바꿔줌
    if(a > b) {
        let temp = a;
        a = b;
        b = temp;
    }

    // 누적합 구하기
    let sum = 0;
    for(i=a; i<=b; i++){
        sum += i;
    }
    return sum;
}
