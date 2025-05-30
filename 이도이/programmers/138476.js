//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/138476
//시간: 92.44ms
//메모리: 66.5MB

function solution(k, tangerine) {
    let map = {},cnt = 0;
    
    // tangerine의 값들 값의 개수랑 매칭시키서 객체에 넣기
    for(let t of tangerine){
        map[t] = (map[t] || 0) + 1
    }

    // 객체 내림차순 정렬
    let sortedmap = Object.values(map).sort((a,b) => b-a);

    // k값이 0보다 작거나 같을 때 반복문 빠져나오기
    for(let count of sortedmap){
        k -= count;
        cnt++;
        if(k<=0) break;
    }
    
    return cnt;
} 
