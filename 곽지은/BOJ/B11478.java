//문제 링크 https://www.acmicpc.net/problem/11478
//시간 776ms
//메모리 230192KB


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();  

        HashSet<String> strSet = new HashSet<>();
        
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < str.length(); j++) {
                sb.append(str.charAt(j));
                strSet.add(sb.toString());
            }
        }
        System.out.println(strSet.size());  
    }
}
