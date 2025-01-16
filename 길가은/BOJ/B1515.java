import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * 문제링크 : https://www.acmicpc.net/problem/1515
 * 시간 : 128ms
 * 메모리 : 16472KB
 */
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        long number = 1;
        int index = 0;
        while(index < input.length()) {
            String stringNumber = String.valueOf(number); 
            for(int i = 0; i < stringNumber.length(); i++) {
                if(index < input.length() && input.charAt(index) == stringNumber.charAt(i)) {
                    index++;
                }
            }
            number++;
        }
        System.out.println(number-1);
    }
}
