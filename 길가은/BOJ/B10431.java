import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/10431
 * 시간 : 276ms
 * 메모리 : 20300KB
 */
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        for(int i = 0; i < size; i++) {
            List<Integer> students = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            int answer = 0;
            for(int j = 0; j < 20; j++) {
                int target = Integer.parseInt(st.nextToken());
                int index = -1;
                for(int k = 0; k < students.size(); k++) {
                    if(target < students.get(k)) {
                        index = k;
                        break;
                    }
                }
                if(index == -1) students.add(target);
                else {
                    answer+= students.size() - index;
                    students.add(index, target);
                }
            }
            System.out.println(order + " " + answer);
        }
    }
}
