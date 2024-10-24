//문제 링크 https://www.acmicpc.net/problem/4153
//시간 104ms
//메모리 14092KB


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true) {
            st = new StringTokenizer(br.readLine());
            int[] sides = new int[3];
            sides[0] = Integer.parseInt(st.nextToken());
            sides[1] = Integer.parseInt(st.nextToken());
            sides[2] = Integer.parseInt(st.nextToken());
            
            if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) 
                break;
            
            Arrays.sort(sides); 
            
            if (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2]) {
                sb.append("right\n");
            } else {
                sb.append("wrong\n");
            }
        }
        System.out.print(sb);
    }
}
