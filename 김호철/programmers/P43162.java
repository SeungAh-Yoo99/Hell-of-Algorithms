//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/43162
//시간: 0.22ms
//메모리: 83.8MB

class Solution {
    static int[][] graph; // 전역에서 사용하려고 만들었음
    static boolean[] visited; // 방문 했는지
    static int answer = 0; // 전역에서 숫자 카운트
    static int total; // 전역에서 숫자 세려고(없어도 됨)
    public int solution(int n, int[][] computers) {
    
        graph = new int[n][n]; 
        total = n;
        visited = new boolean[n];
        for(int i = 0 ; i < computers.length; i++){
            for(int j = 0 ; j<computers[0].length;j++){
                graph[i][j] = computers[i][j];
            }
        }

        for(int i = 0 ; i < n ; i++){
            if(!visited[i]){        // dfs 탐색을 하는데 
                dfs(i);            // 방문한 적 이 있다면 true로 되있을 것이다.
                answer++;          // 그래서 방문한 적이 없는 위치에서 함수가 호출될 때 마다
            }                      // +1 해서 네트워크 구역을 판별했다.
        }
        
        return answer;
    }
    void dfs(int n){
        visited[n] = true; // 우선 true로 방문했다 하고
        for(int i = 0 ; i < total; i++){
            if(!visited[i] && graph[n][i]==1){ // 만약 방문 안했고, 연결 되어있으면
                visited[i]=true;                // 재귀호출해서 연결된 컴퓨터도 
                dfs(i);                          // 한 구역으로 판별 할 수 있게 만들었다.
            }
        }
    }
}

