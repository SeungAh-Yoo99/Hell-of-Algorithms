// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181874
// 시간: 0.11 ms
// 메모리: 33.4 MB

function solution(myString) {
    let answer = '';
    // 우선 모든 문자를 소문자로 변환 후 스프레드 연산자로 배열로 만들어서 반복문 돌림
    [...myString.toLowerCase()].forEach((str)=>{
        // 배열의 문자가 'a'일 경우에만 대문자로 변환해서 문자열에 추가
        if(str=='a') answer += str.toUpperCase();
        // 아닐경우 그냥 추가
        else answer += str;
    });
    return answer;
}
