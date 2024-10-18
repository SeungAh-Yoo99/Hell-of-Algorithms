// 문제 링크:https://www.acmicpc.net/problem/11286
// 시간: 296 ms
// 메모리: 29676 KB

// 풀이

// 우선순위큐와 맵을 생성해서 우선순위큐에는 절대값을 맵에는 숫자를 넣었음

// 우선순위별로 출력을 하는데, 만약 절대값의 음수값이 맵에 있다면

// 더 낮은 숫자를 출력해야하기 때문에 음수로 출력하고 맵에는 -1 해서 갯수 처리했음


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 우선 순위 큐 생성
        Map<Integer, Integer> map = new HashMap<>(); // 맵 생성(절댓값 판별 위해 만들었음)
        StringBuilder sb = new StringBuilder(); //출력 여려줄이라서 빌더 사용
        
        for(int i = 0; i < n; i++){
            int temp = Integer.parseInt(br.readLine()); // 우선 값 담아둠
            if(temp == 0){ //0이라면 출력문 수행
                if(pq.isEmpty()) {
                    sb.append("0").append("\n"); // 우선순위 큐가 비었다면 0 출력
                    continue; // 다음 반복
                }
                
                int result = pq.poll(); // 비어있지 않다면 변수로 우선 뺐음
                
                if(map.getOrDefault(-result,-1) >0){ // 절댓값을 음수로 넣어보고 있다면 음수값 출력해야함
                    sb.append(-result).append("\n"); // 절대값 음수로 출력했음
                    map.put(-result, map.get(-result)-1); // 음수 값에 갯수 -1 했음
                    continue;
                }
                sb.append(result).append("\n");
                continue;
            }
            pq.offer(Math.abs(temp));
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        System.out.println(sb.toString());
    }
}
