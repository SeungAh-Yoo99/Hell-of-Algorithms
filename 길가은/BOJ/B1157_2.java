import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/1157
 * 시간 : 1712ms
 * 메모리 : 105208KB
 */
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] messages = br.readLine().toUpperCase().split("");
        Arrays.sort(messages);

        int max = 1;
        String answer = messages[0];
        int count = 1;
        for(int i = 1; i < messages.length; i++) {
            if(messages[i].equals(messages[i-1])) count++;
            else count = 1;
            if(count > max) {
                max = count;
                answer = messages[i-1];
            } else if(count == max) answer = "?";
        }
        System.out.println(answer);
    }
}
