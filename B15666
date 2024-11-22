// 문제 링크: https://www.acmicpc.net/problem/15666
// 시간: 280 ms
// 메모리: 20132 KB


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N, m;
    static int[] n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // n개의 자연수
        m = Integer.parseInt(st.nextToken()); // m개를 고를 예정

        st = new StringTokenizer(br.readLine());

        n = new int[N];

        for(int i = 0 ; i < N ; i++){
            n[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(n);// 우선 정렬

        n = Arrays.stream(n).distinct().toArray(); // 중복 제거

        backTracking(0, n[0],""); // 깊이, 값 , 빈 값



    }
    static void backTracking(int depth, int number, String s){

        if(depth == m){
            System.out.println(s);
            return;
        }

        for(int i = 0 ; i < n.length ; i++){
            if(number <= n[i]){ // 조건 만족하면 재귀
                if(depth==0){
                    backTracking(depth+1, n[i],s+ n[i]); // 처음 들어갈 때 예외 처리 했음
                    continue;                            // 문자열 추가될 때 한 칸 띄어져서..
                }
                backTracking(depth+1, n[i],s+" " + n[i]);
            }
        }
    }
}

