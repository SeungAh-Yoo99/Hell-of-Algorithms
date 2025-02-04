//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/17680#
//시간: 55.82ms
//메모리: 41.9MB

function solution(cacheSize, cities) {
   // 캐시크기가 0인 겨우 
   if(cacheSize == 0) return cities.length*5
   let stack = [], result = 0; 
    
   for(let i=0; i<cities.length; i++){
       let str = cities[i].toLowerCase()
       if(!stack.includes(str)){
           result += 5;
           stack.push(str);
           if(stack.length>cacheSize){
                 stack.shift();
            }
       }else{
           result += 1;
           // LRU를 유지하기 위해 오래된 캐시 삭제
           stack.splice(stack.indexOf(str), 1);
           stack.push(str);
       }
   } 
    
    return result;
}
