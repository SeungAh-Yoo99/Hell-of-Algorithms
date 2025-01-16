//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12985
//시간: 0.03ms
//메모리: 79.7MB

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }//a가 항상 작음
        while(true){
            if(a%2 == 1 && a+1 == b){
                break;
            }
            a = (a+1) / 2;
            b = (b+1) / 2;
            answer++;
        
        }

        return answer;
    }
}
