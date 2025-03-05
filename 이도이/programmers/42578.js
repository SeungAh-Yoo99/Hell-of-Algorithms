//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42578
//시간: 0.29ms
//메모리: 33.3MB

function solution(clothes) {
    let object = {}, cnt = 1
    
    // 똑같은 옷 종류의 개수, 객체로 표현해주기
    for(let i=0; i<clothes.length; i++){  
        const type = clothes[i][1]
        object[type] != undefined ?  object[type] += 1 : object[type] = cnt
    }
   
    return Object.values(object).reduce((acc,x) => acc*(x+1),1)-1
}
