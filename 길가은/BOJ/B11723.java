import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/11723
 * 시간 : 1744ms
 * 메모리 : 326332KB
 */
class Main {
    
    private static final Set<String> set = new HashSet<>();
    private static final StringJoiner answer = new StringJoiner(System.lineSeparator());
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        for(int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String action = st.nextToken();
            String target = action.equals("all") || action.equals("empty") ? "" : st.nextToken();
            doAction(action, target);
        }
        System.out.println(answer.toString());
    }

    private static void doAction(String action, String target) {
        if(action.equals("add")) set.add(target);
        else if(action.equals("remove")) set.remove(target);
        else if(action.equals("check")) {
            answer.add(set.contains(target) ? "1" : "0");
        } else if(action.equals("toggle")) {
            if(set.contains(target)) set.remove(target);
            else set.add(target);
        } else if(action.equals("all")) {
            for(int i = 1; i <= 20; i++) {
                set.add(String.valueOf(i));
            }
        } else if(action.equals("empty")) set.clear();
    }
}
