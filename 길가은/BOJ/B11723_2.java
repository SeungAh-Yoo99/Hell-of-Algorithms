import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/11723
 * 시간 : 1060ms
 * 메모리 : 323388KB
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        boolean[] numbers = new boolean[21];
        StringJoiner answer = new StringJoiner(System.lineSeparator());
        for(int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String action = st.nextToken();
            int target = action.equals("all") || action.equals("empty") ? 0 : Integer.parseInt(st.nextToken());
            if(action.equals("all")) Arrays.fill(numbers, true);
            else if(action.equals("empty")) Arrays.fill(numbers, false);
            else if(action.equals("add")) numbers[target] = true;
            else if(action.equals("remove")) numbers[target] = false;
            else if(action.equals("toggle")) numbers[target] = !numbers[target];
            else  answer.add(numbers[target] ? "1" : "0"); 
        }
        System.out.println(answer);
    }
}
