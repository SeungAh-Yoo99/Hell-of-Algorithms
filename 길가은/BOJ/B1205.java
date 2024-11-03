import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/1205
 * 시간 : 100ms
 * 메모리 : 14352KB
 */
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int scoreSize = Integer.parseInt(tokenizer.nextToken());
        int targetScore = Integer.parseInt(tokenizer.nextToken());
        int rankSize = Integer.parseInt(tokenizer.nextToken());

        int sameScores = 0;
        int upperScores = 0;
        int rank = 0;
        if(scoreSize == 0) rank = 1;
        else {
            tokenizer = new StringTokenizer(reader.readLine());
            for(int i = 0; i < scoreSize; i++) {
                int score = Integer.parseInt(tokenizer.nextToken());
                if(targetScore < score) upperScores++;
                else if (targetScore == score) sameScores++;
                if(upperScores + sameScores >= rankSize) {
                    rank = -1;
                    break;
                }
                if(score < targetScore) {
                    rank = upperScores+1;
                    break;
                }
            }
        }
        System.out.println(rank == 0 ? upperScores+1 : rank);
    }
}
