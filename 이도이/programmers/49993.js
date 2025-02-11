//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/49993
//시간:5.07ms
//메모리:  33.7MB

function solution(skill, skill_trees) {
    let object = {};
    skill.split("").forEach((x) => object[x] =1);
    console.log(object)
    
    return skill_trees.map((x) => x.split("").filter(y => Boolean(object[y])).join(""))
    .filter((x) => Boolean(skill.startsWith(x))).length;

}
