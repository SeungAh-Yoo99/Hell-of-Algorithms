문제 링크: https://www.acmicpc.net/problem/1541
시간: 64 ms
메모리: 11545 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-",true); // "-" 기준으로 나눔
        StringTokenizer temp ; // "+" 기준으로 나누려고 선언 먼저 함
        String s; //
        int count;
        int total=0;
        boolean flag = false;
        while(st.hasMoreTokens()){
            count = 0;
            s = st.nextToken();
            temp = new StringTokenizer(s,"+"); // +기준으로 다시 나누었음
            while(temp.hasMoreTokens()) {
                int tempCount = Integer.parseInt(temp.nextToken()); // +기준으로 나눈 식을 다 더했다.
                count+= tempCount;
            }
            if(!flag){
                total += count; // 처음에는 더하고 다음부터는 빼기 위해 이렇게 예외처리했음
                flag = true;
            }
            else{
                total-=count; // - 다음으로 나오는 것들은 다 더해서 빼주기 위해 처리했음
            }
        }
        System.out.println(total);
    }
}
