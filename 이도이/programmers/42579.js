//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42579#
//시간: 7.14ms
//메모리:33.7MB

function solution(genres, plays) {
    let map = []
    for(let i=0; i<plays.length; i++){
        map.push([plays[i], i]);
    }
    
    let mapArr = map.sort((a,b) => {
        if(a[0] === b[0]){
            return a[1] - b[1]
        }
        return b[0] - a[0]
    });
    console.log(mapArr)
    let genreSum = new Map();
    for(let i=0; i<genres.length; i++){
        if(genreSum.has(genres[i])){
              genreSum.set(genres[i],  genreSum.get(genres[i]) + plays[i])
        }else{
            genreSum.set(genres[i], plays[i])
        }
    }
    
    let genreSumArr = [...genreSum].sort((a,b) => b[1] - a[1]);
    let result = [];
    let count = 0;
    for(let i=0; i<genreSumArr.length; i++){
          for(let j = 0; j<mapArr.length; j++){         
                 if(genreSumArr[i][0] == genres[mapArr[j][1]]){
                     count++;
                     result.push(mapArr[j][1])
                 }
                if(count == 2) break;
          }
          count = 0; 
    }
    
    
    return result

}
