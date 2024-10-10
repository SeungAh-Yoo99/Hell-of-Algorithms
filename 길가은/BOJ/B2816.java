import java.util.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/2816
 * 시간 : 100ms
 * 메모리 : 14184KB
 */
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] tvs = new String[size];
        for(int i = 0; i < size; i++) {
            tvs[i] = br.readLine();
        }

        final String kbs1 = "KBS1";
        final String kbs2 = "KBS2";
        final String down = "1";
        final String up = "4";
      
        StringBuilder answer = new StringBuilder();
        int cursor = 0;
        while(!tvs[cursor].equals(kbs1) && !tvs[0].equals(kbs1)) {
            cursor++; 
            answer.append(down);
        }        
        
        while(!tvs[0].equals(kbs1)) {
            String swap = tvs[cursor];
            tvs[cursor] = tvs[--cursor];
            tvs[cursor] = swap;
            answer.append(up);
        }

        while(!tvs[cursor].equals(kbs2) && !tvs[1].equals(kbs2)) {
            cursor++; 
            answer.append(down);
        }   

        while(!tvs[1].equals(kbs2)) {
            String swap = tvs[cursor];
            tvs[cursor] = tvs[--cursor];
            tvs[cursor] = swap;
            answer.append(up);
        }

        System.out.println(answer.toString());
    }
}
