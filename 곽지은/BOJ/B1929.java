//문제 링크 https://www.acmicpc.net/problem/1929
//시간 224ms
//메모리 20224KB



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numM = Integer.parseInt(st.nextToken());
        int numN = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[numN + 1];

        arr[0] = true;
        arr[1] = true;

        for(int i = 2; i * i <= numN; i++) {
            if(!arr[i]) {
                for(int j = i * i; j <= numN; j += i) {
                    arr[j] = true;
                }
            }
        }
        for(int i = numM; i <= numN; i++) {
            if(!arr[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}

