import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/4659
 * 시간 : 100ms
 * 메모리 : 14060KB
 */
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        while(true) {
            String password = br.readLine();
            if(password.equals("end")) break;
            answer.append("<");
            if(isAcceptable(password)) {
                answer.append(password);
                answer.append("> is acceptable.\n");
            } else {
                answer.append(password);
                answer.append("> is not acceptable.\n");                
            }
        }
        System.out.println(answer.toString());
    }

    private static boolean isAcceptable(String password) {
        Set<Character> vowels = Set.of('a','e','o','i','u');
        boolean hasVowel = false;
        int vowelSequence = 0;
        int consonantSequence = 0;
        for(int i = 0; i < password.length(); i++) {
            char target = password.charAt(i);
            if(vowels.contains(target)) {
                hasVowel = true;
                vowelSequence++;
                consonantSequence = 0;
            } else {
                consonantSequence++;
                vowelSequence=0;
            }
            if(vowelSequence >= 3 || consonantSequence >= 3) return false;
            if(i != 0 && password.charAt(i-1) == target && target != 'e' && target != 'o') return false;
        }
        return hasVowel;
    }

}
