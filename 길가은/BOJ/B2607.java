import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/2607
 * 시간 : 104ms
 * 메모리 : 14156KB
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        String target = reader.readLine();
        Map<Character, Integer> targets = new HashMap<>();
        for(int i = 0; i < target.length(); i++) {
            targets.put(target.charAt(i), targets.getOrDefault(target.charAt(i), 0) + 1);
        }

        int answer = 0;

        Map<Character, Integer> words = new HashMap<>();
        for(int i = 0; i < size - 1; i++) {
            String word = reader.readLine();
            for(int j = 0; j < word.length(); j++) {
                words.put(word.charAt(j), words.getOrDefault(word.charAt(j), 0) + 1);
            }

            for(Character key : targets.keySet()) {
                words.put(key, words.getOrDefault(key, 0) - targets.get(key));
            }

            int count = 0;
            for(Character key : words.keySet()) {
                count += Math.abs(words.get(key));
            }

            if(count < 2) answer++;
            else if(count == 2 && word.length() == target.length()) answer++;
            words.clear();
        }

        System.out.println(answer);
    }
}
