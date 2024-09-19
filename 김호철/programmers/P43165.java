//문제 링크:  https://school.programmers.co.kr/learn/courses/30/lessons/43165


package 김호철.programmers;

public class P43165 {
    class Solution {
        public static int count = 0;
        public static int[] numbers;
        public  int target;
        public  int solution(int[] numbers, int target) {
            this.target = target;
            this.numbers = numbers;
            dfs(0,0);
            return count;
        }
        public void dfs(int index, int sum){
            if(index == numbers.length){
                if(sum == target){
                    count++;

                }
                return;
            }
            dfs(index+1,sum+numbers[index]);
            dfs(index+1,sum-numbers[index]);
        }
    }
}
