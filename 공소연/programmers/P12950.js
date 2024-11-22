// 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/12950
// 시간: 0.47ms
// 메모리: 38.2MB


function solution(arr1, arr2) {
    var answer = [];
    arr1.forEach((item, idx) => answer.push(item.map((num, idx2) => num + arr2[idx][idx2]
)));
    return answer;
}
