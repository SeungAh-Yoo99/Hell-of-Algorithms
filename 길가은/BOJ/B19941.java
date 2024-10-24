import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * 문제링크 : https://www.acmicpc.net/problem/19941
 * 시간 : 108ms
 * 메모리 : 14496KB
 */
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int size = Integer.parseInt(tokenizer.nextToken());
        int distance = Integer.parseInt(tokenizer.nextToken());
        char[] tables = new char[size];
        String input = reader.readLine();
        for(int i = 0; i < size; i++) {
            tables[i] = input.charAt(i);
        }

        int answer = 0;
        for(int i = 0; i < size; i++) {
            if(tables[i] == 'P') {
                for(int j = i - distance; j < i + distance + 1; j++) {
                    if(j >= 0 && j < size && tables[j] == 'H') {
                        tables[j] = 'N';
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
