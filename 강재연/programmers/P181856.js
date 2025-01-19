// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181856
// 시간: 0.13ms
// 메모리: 33.4MB

function solution(arr1, arr2) {
    if(arr1.length > arr2.length) return 1;
    if(arr1.length < arr2.length) return -1;
    if(arr1.length == arr2.length){
        let sum1 = 0;
        let sum2 = 0;
        arr1.forEach((arr)=>{
           sum1 += arr; 
        });
        arr2.forEach((arr)=>{
           sum2 += arr; 
        });
        
        return sum1 > sum2 ? 1 : sum1 < sum2 ? -1 : 0;
    }
}
