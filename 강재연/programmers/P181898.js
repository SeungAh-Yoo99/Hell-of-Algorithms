// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181898
// 시간: 0.04ms
// 메모리: 34.2MB

function solution(arr, idx) {
    for(i=idx; i<arr.length; i++){
        if(arr[i] == 1) return i;
    }
    
    return -1;
}
