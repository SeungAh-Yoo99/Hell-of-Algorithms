//문제 링크: https://www.acmicpc.net/problem/2961
//시간: 64 ms
//메모리: 11545 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int number; // 총 갯수
    static int total=2000000000; //처음 총 맛(이거 1000으로 했다가 반례 오지게 나왔음 ㅜ)
    static int[] sour,bitter; // 신만 쓴맛 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(br.readLine());
        StringTokenizer st;

        sour = new int[number]; bitter = new int[number];

        for(int i = 0 ; i < number ; i++){
            st = new StringTokenizer(br.readLine());
            sour[i] = Integer.parseInt(st.nextToken());
            bitter[i] = Integer.parseInt(st.nextToken());
        }

        // 신맛, 쓴맛, 깊이값 순
        eat(1 , 0, 0); // 신맛은 첫 값을 곱해야 해서 1, 쓴 맛은 더해야해서 0으로 줬음
        System.out.println(total);

    }

    private static void eat(int s, int b, int idx) {
        if(idx == number){
            if(b!=0) { // b가 0이라면 한 음식도 더하지 않은거라고 판별했음
                total = Math.min(total,(Math.abs(s-b))); // 비교해서 작은걸로 total 변경
            }
            return;
        }
        eat(s*sour[idx],b+bitter[idx],idx+1); // 여기서 idx++라고 썼다가 30분 날렸습니다.
        eat(s, b, idx+1);                    // idx++이라고 쓰면 값을 넘겨주고 할 때
                                            // +1이 되는 타이밍이 이상 할 수 있어서
                                              // 계속 스택 오버플로우가 났었습니다
    }
}
