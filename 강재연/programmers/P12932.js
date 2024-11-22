// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12932
// 시간: 0.05 ms
// 메모리: 33.4 MB

function solution(n) {
    // 숫자를 문자열로 변환 후 스프레드 연산자로 배열로 선언
    const arr = [...n.toString()];
    let answer = [];
    // 거꾸로 반복문을 돌리면서 answer에 push
    for(i=arr.length-1; i>=0; i--){
        // 문자열을 다시 숫자로 변환
        answer.push(Number(arr[i]));
    }
    return answer;
}
