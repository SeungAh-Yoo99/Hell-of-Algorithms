// 문제 링크: https://www.acmicpc.net/problem/15651
// 시간: 348 ms
// 메모리: 183548 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n , m;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        backTracking(1,0,"");

        System.out.println(sb.toString());

    }

    private static void backTracking(int number, int cnt,String s) {
        if(cnt == m){
            sb.append(s).append("\n");
            return;
        }
        if(number==n+2){
            return;
        }
        for(int i = 1; i <= n ; i++){
            if(cnt==0){
                backTracking(i+1,cnt+1,s+i);
                continue;
            }
            backTracking(i+1,cnt+1,s+" "+i);
        }

    }
}

                    sb.append(i).append(" ");
                }
            }
            sb.append("\n");
            return;
        }
        if(number == n+1){
            return;
        }

        if(!visited[number]){
            visited[number] = true;
            backTracking(number+1, cnt+1);
            visited[number] = false;
            backTracking(number+1,cnt);
        }
    }
}
