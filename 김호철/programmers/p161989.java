////문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/161989
//
//
//
//class Solution {
//    public int solution(int n, int m, int[] section) {
//        int answer = 0;
//        boolean[] check = new boolean[n+1]; //숫자 편하게 n+1만큼으로 배열 만들었음
//        for(int i = 0 ;i<section.length;i++){
//            int temp = section[i];
//            if(check[temp]==true) continue;
//            answer++;
//            for(int j = 0; j<m;j++){ //롤러 크기만큼 다음것들 칠해져있다고 하는 과정
//                if (temp>n) break; //이거 없으면 배열크기 오류남
//                check[temp]=true;
//                temp++;
//            }
//
//        }
//        return answer;
//    }
//}
