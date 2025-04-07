// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181928
// 시간: 0.07 ms
// 메모리: 33.6 MB

function solution(num_list) {
    let odd = '';
    let even = '';
    num_list.forEach((num)=>{
        // 짝수일 경우
        if(num % 2 == 0) even += num;
        // 홀수일 경우
        if(num % 2 == 1) odd += num;
    })
    return +even + +odd;
}
