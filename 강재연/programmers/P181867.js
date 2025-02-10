// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181867
// 시간: 1.27 ms
// 메모리: 38.6 MB

function solution(myString) {
    const answer = [];
    myString.split('x').forEach((str,i)=>{
        answer[i] = str.length;
    });
    return answer;
}
