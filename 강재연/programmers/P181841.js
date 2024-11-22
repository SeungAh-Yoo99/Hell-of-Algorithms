// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181841
// 시간: 0.04 ms
// 메모리: 33.5 MB

function solution(str_list, ex) {
    let answer = '';
    str_list.forEach( str =>{
       if(!str.includes(ex)) answer += str;           
    });
    return answer;
}
