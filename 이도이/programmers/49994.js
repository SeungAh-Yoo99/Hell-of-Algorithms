//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/49994
//시간: 0.72ms
//메모리: 33.8MB

function solution(dirs) {
    let count = 0; 
    let visitedPath = new Set();
    let curX = 5, curY = 5;
    
    
    for(let i=0; i<dirs.length; i++){
        let [nextX,nextY] = [curX,curY];
 
        if(dirs[i] == "U" && curX > 0){
             nextX -= 1;        
        }else if(dirs[i] == "D" && curX < 10){  
                nextX += 1;       
        }else if(dirs[i] == "R" && curY < 10){
                nextY += 1;       
        }else if(dirs[i] == "L" && curY > 0){
                nextY -= 1;    
        }else {
            continue; 
        }
      
        let path1 = `${nextX},${nextY} - ${curX},${curY}`
        let path2 = `${curX},${curY} - ${nextX},${nextY}`
        
        if(!visitedPath.has(path1) && !visitedPath.has(path2)){
            visitedPath.add(path1);
            visitedPath.add(path2);
            count++;
        }
        
        curX = nextX;
        curY = nextY;
    }
    
    return count;
}
