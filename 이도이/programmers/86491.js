//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/86491
//시간: 3.61ms
//메모리: 39MB

function solution(sizes) {
       let maxArr = [];
       let minArr = []
      
       for(let i=0; i<sizes.length; i++){
           let max = Math.max(sizes[i][0],sizes[i][1]);
           maxArr.push(max);
           let min = Math.min(sizes[i][0],sizes[i][1]);
           minArr.push(min);
       }

       return Math.max(...maxArr)*Math.max(...minArr)
}
