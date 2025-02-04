//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/17682
//시간: 0.17ms
//메모리: 33.5MB

function solution(dartResult) {
    let stack = [];
    let alphabet = ["S", "D", "T"];
    
    for(let i=0; i<dartResult.length; i++){
           
          // S,D,T 중에 하나일 떄 바로 앞의 인덱스랑 제곱 값 구하기 
          if(alphabet.includes(dartResult[i])){
              let alp;
              dartResult[i] == "S" ? alp = 1  : dartResult[i] == "D" ? alp = 2 : alp = 3;
              if( dartResult[i-1] == 0 && dartResult[i-2] == 1){
                stack.push(Math.pow(10, alp) ); 
              }else{
                stack.push(Math.pow(dartResult[i-1], alp) ); 
              }
                      
          }  
        
        //* 일때 stack의 마지막 2개 인덱스 *2한 값 구해서 다시 넣기 
          if(dartResult[i] == "*"){
              let num = stack.pop()*2;
              if(stack.length > 0){
                  let num2 = stack.pop()*2;
                  stack.push(num2)
              }
              stack.push(num)
          }
        
        //# 일때 stack의 마지막 값 (-1) 곱해서 stack에 넣기 
         if(dartResult[i] == "#"){
             let num = stack.pop()*(-1);
             stack.push(num);
         }
        
     }
    
    return stack.reduce((acc,x) => acc+x)
}
