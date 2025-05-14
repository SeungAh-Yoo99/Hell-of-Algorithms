//문제링크 https://www.acmicpc.net/problem/11659
//시간 1048ms 
//메모리 59116KB

//StringBuilder 사용 후
//시간 516ms
//메모리 53180KB


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int dataNum = Integer.parseInt(stringTokenizer.nextToken());
        int quizNum = Integer.parseInt(stringTokenizer.nextToken());
        long[] sum = new long[dataNum + 1];
        
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= dataNum; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        StringBuilder output = new StringBuilder();
        for (int q = 0; q < quizNum; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int startNum = Integer.parseInt(stringTokenizer.nextToken());
            int endNum = Integer.parseInt(stringTokenizer.nextToken());
            output.append(sum[endNum] - sum[startNum - 1]).append("\n");
        }
        System.out.print(output.toString());
    }
}

