// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181915
// 시간: 0.11 ms
// 메모리: 33.5 MB

function solution(my_string, index_list) {
    return index_list.map( i => my_string[i]).join('');
}
