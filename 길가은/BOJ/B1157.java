import java.util.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/1157
 * 시간 : 428ms
 * 메모리 : 85224KB
 */
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String message = br.readLine().toUpperCase();
        Map<String, Integer> chars = new HashMap<>();
        for(int i = 0; i < message.length(); i++) {
            String target = message.substring(i, i+1);
            chars.put(target, chars.getOrDefault(target, 0) + 1);
        }
        List<String> keys = new ArrayList<>(chars.keySet());
        Collections.sort(keys, (k1, k2) -> chars.get(k2) - chars.get(k1));

        if(chars.size() > 1 && (chars.get(keys.get(0)).equals(chars.get(keys.get(1))))) {
            System.out.println("?");
        } else {
            System.out.println(keys.get(0));
        }
    }
}
