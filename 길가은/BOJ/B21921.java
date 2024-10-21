import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/21921
 * 시간 : 312ms
 * 메모리 : 35504KB
 */
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int days = Integer.parseInt(tokenizer.nextToken());
        int period = Integer.parseInt(tokenizer.nextToken());

        int[] blog = new int[days];
        tokenizer = new StringTokenizer(reader.readLine());
        int max = 0;
        int count = 0;
        int sum = 0;
        for(int i = 0; i < days; i++) {
            blog[i] = Integer.parseInt(tokenizer.nextToken());
            if(i < period - 1) {
                sum += blog[i];
            } else {
                sum += blog[i];
                if(sum > max) {
                    max = sum;
                    count = 1;
                } else if(sum == max) {
                    count++;
                }
                sum-=blog[i-period+1];
            }  
        }

        if(max == 0) System.out.println("SAD");
        else {
            System.out.println(max);
            System.out.println(count);
        }
    }
}
