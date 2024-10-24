import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/1244
 * 시간 : 100ms
 * 메모리 : 14308KB
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int switchSize = Integer.parseInt(reader.readLine());
        boolean[] switches = new boolean[switchSize + 1];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for(int i = 1; i <= switchSize; i++) {
            switches[i] = tokenizer.nextToken().equals("1") ? true : false;
        }
    
        int numberOfStudents = Integer.parseInt(reader.readLine());
        for(int i = 0; i < numberOfStudents; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            String student = tokenizer.nextToken();
            int switchNumber = Integer.parseInt(tokenizer.nextToken());
            if(student.equals("1")) { //남학생
                for(int j = switchNumber; j < switches.length; j += switchNumber) {
                    switches[j] = !switches[j];
                }
            } else { // 여학생
                int j = 1;
                switches[switchNumber] = !switches[switchNumber];
                while(switchNumber - j > 0 && switchNumber + j < switches.length) {
                    if(switches[switchNumber - j] != switches[switchNumber + j]) break;
                    switches[switchNumber - j] = !switches[switchNumber - j];
                    switches[switchNumber + j] = !switches[switchNumber + j];
                    j++;
                }
            }
        }

        StringJoiner joiner = new StringJoiner(" ");
        StringJoiner lineSeparator = new StringJoiner(System.lineSeparator());
        for(int i = 1; i < switches.length; i++) {
            joiner.add(switches[i] ? "1" : "0");
            if(i % 20 == 0) {
                lineSeparator.add(joiner.toString());
                joiner = new StringJoiner(" ");
            }
        }
        lineSeparator.add(joiner.toString());
        System.out.println(lineSeparator.toString());
        
    }
}
