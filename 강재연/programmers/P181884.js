// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181884
// 시간: 0.04 ms
// 메모리: 34.4 MB

function solution(numbers, n) {
    let answer = 0;
    numbers.forEach((num)=>{
        if(answer <= n) {
            answer += num;
        }
    });
    
    return answer;
}
