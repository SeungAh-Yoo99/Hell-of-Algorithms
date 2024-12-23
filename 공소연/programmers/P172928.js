// 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/172928
// 시간: 0.63ms
// 메모리: 33.5MB

function solution(park, routes) {
    const dir = {
        "N": {r: -1, c: 0},
        "S": {r: 1, c: 0},
        "W": {r: 0, c: -1},
        "E": {r: 0, c: 1}
    }
    
    const row = park.length
    const col = park[0].length
    
    let current = findStartPoint(park, row, col)
    
    let op, n, nr, nc, possible;
    for (let r of routes) {
        [op, n] = r.split(" ");
        n = Number(n);

        possible = true
        
        for (let i = 1; i <= n; i++) {
            nr = current.r + dir[op].r * i
            nc = current.c + dir[op].c * i
            
            if (nr < 0 || nr >= row || nc < 0 || nc >= col || park[nr][nc] === "X") {
                possible = false
                break;
            }
        }
        
        if (possible) {
            current.r = nr
            current.c = nc
        }
    }
    
    return [current.r, current.c]
}

function findStartPoint(park, row, col) {
    let current = {r: 0, c: 0}
    for (let i = 0; i < row; i++) {
        for (let j = 0; j < col; j++) {
            if (park[i][j] === "S") {
                current.r = i
                current.c = j
                return current
            }
        }
    }
}
