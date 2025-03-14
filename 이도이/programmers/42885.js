//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42885
//시간:2.47ms
//메모리: 35.6MB

function solution(people, limit) {
    let result = 0; 
    people.sort((a,b) => a-b);
    let stack = [];
    
    while(people.length > 0){
        stack.push(people.pop());
        let light = people[0];
        if(stack[stack.length-1] + light <= limit){
            result++;
            people.shift();
        }else{
            result++;
        }
        
    }
    
    return result;
}
