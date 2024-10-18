import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/7568
 * 시간 : 100ms
 * 메모리 : 14160KB
 */
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[][] persons = new int[size][2];
        for(int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            persons[i] = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        }
        StringJoiner joiner = new StringJoiner(" ");
        for(int i = 0; i < persons.length; i++) {
            int rank = 1;
            for(int j = 0; j < persons.length; j++) {
                if((persons[i][0] < persons[j][0]) && (persons[i][1] < persons[j][1])) rank++;
            }
            joiner.add(String.valueOf(rank));
        }
        System.out.println(joiner.toString());
    }

}
