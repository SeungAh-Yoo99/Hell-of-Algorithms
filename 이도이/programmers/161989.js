//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/161989
//시간: 2.69ms
//메모리: 37.8MB

function solution(n, m, section) {
   let result = 0;
    
    // 초기값으로 음의 무한대값으로 설정 
   let maxRange = -Infinity;
    
    //section값 돌면서 원소가 maxRange보다 값이 작으면 result +1 = 페인트를 다시 칠해야하는 범위
    section.forEach(x => {
        if(maxRange < x){
           result++;
           maxRange = x+m-1     
         }
    })
    
    return result;
}
