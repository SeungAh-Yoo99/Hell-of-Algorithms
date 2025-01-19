// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181916
// 시간: 0.12 ms
// 메모리: 33.4 MB

function solution(a, b, c, d) {
    const nums = [0,0,0,0,0,0];
    
    nums[a-1] += 1;
    nums[b-1] += 1;
    nums[c-1] += 1;
    nums[d-1] += 1;
    
    const max = Math.max(...nums);
    const min = Math.min(...nums.filter(num => num > 0));
    const maxNum = nums.indexOf(max)+1;
    const minNum = nums.indexOf(min)+1;
    
    if(max == 4) return 1111*maxNum;
    else if(max == 3) return (10*maxNum+minNum)**2;
    else if(max == 2 && min == 2) {
        const [p, q] = nums.reduce((acc, count, index) => {
            if (count === 2) acc.push(index + 1);
            return acc;
        }, []);
        return (p + q) * Math.abs(p - q);
    }
    else if(max == 2 && min == 1) {
        const [q, r] = nums.reduce((acc, count, index) => {
            if (count === 1) acc.push(index + 1);
            return acc;
        }, []);
        return q * r;
    }else if (max === 1) {
        return Math.min(a, b, c, d);
    }
}
