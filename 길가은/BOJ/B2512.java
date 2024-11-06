import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/2512
 * 시간 : 152ms
 * 메모리 : 15900KB
 */
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        int sum = 0;
        int[] moneys = new int[size];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for(int i = 0; i < size; i++) {
            int money = Integer.parseInt(tokenizer.nextToken());
            moneys[i] = money;
            sum += money;
        }
        Arrays.sort(moneys);
        int total = Integer.parseInt(reader.readLine());
        if(sum <= total) System.out.println(moneys[size-1]);
        else {
            int left = 0;
            int right = moneys[size-1];
            int answer = 0;
            while(left <= right) {
                int mid = (right + left) / 2;
                sum = 0;
                for(int i = 0; i < moneys.length; i++) {
                    sum += Math.min(mid, moneys[i]);
                }
                if(sum > total) {
                    right = mid - 1;
                } else {
                    answer = mid;
                    left = mid + 1;
                }
            }
            System.out.println(answer);
        }
    }
}
