//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/87946
//시간: 28.40ms
//메모리: 36.8MB

function solution(k, dungeons) {
    let answer = 0;
    const visited = Array.from({length:dungeons.length}, () => false);
    
    
    const dfs = (hp,l) => {
        for(let i=0; i<dungeons.length; i++){
            if(!visited[i] && dungeons[i][0] <= hp ){
                visited[i] = true;
                
                dfs(hp - dungeons[i][1],l+1);
                
                visited[i] = false;
            }
        }
        
        answer = Math.max(answer,l)
    }
    
    dfs(k,0)
    
    return answer;
}
