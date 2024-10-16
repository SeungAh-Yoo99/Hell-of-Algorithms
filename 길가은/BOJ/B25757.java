import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/25757
 * 시간 : 228ms
 * 메모리 : 27128KB
 */
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        Set<String> persons = new HashSet<>();
        for(int i = 0; i < size; i++) {
            persons.add(br.readLine());
        }

        if(game.equals("Y")) System.out.println(persons.size());
        else if (game.equals("F")) System.out.println(persons.size()/2);
        else System.out.println(persons.size()/3);

    }

}
