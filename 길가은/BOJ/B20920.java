import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/20920
 * 시간 : 684ms
 * 메모리 : 38396KB
 */
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int wordSize = Integer.parseInt(tokenizer.nextToken());
        int wordLength = Integer.parseInt(tokenizer.nextToken());

        Map<String, Integer> wordCounts = new HashMap<>();
        for(int i = 0; i < wordSize; i++) {
            String word = reader.readLine();
            if(word.length() >= wordLength) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(wordCounts.keySet());
        Collections.sort(words, (w1, w2) -> {
            if(wordCounts.get(w1).equals(wordCounts.get(w2))) {
                if(w1.length() == w2.length()) {
                    return w1.compareTo(w2);
                } return w2.length() - w1.length();
            } return wordCounts.get(w2) - wordCounts.get(w1);
        });

        StringJoiner answer = new StringJoiner(System.lineSeparator());
        for(String word : words) {
            answer.add(word);
        }
        System.out.println(answer.toString());
    }
}
