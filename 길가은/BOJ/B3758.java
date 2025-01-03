import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/3758
 * 시간 : 384ms
 * 메모리 : 36560KB
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testSize = Integer.parseInt(reader.readLine());
        for(int j = 0; j < testSize; j++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int teamSize = Integer.parseInt(tokenizer.nextToken());
            int problemSize = Integer.parseInt(tokenizer.nextToken());
            int targetTeamId = Integer.parseInt(tokenizer.nextToken());
            int logSize = Integer.parseInt(tokenizer.nextToken());
            Map<Integer, Team> teams = new HashMap<>();

            for(int i = 0; i < teamSize; i++) {
                teams.put(i+1, new Team());
            }

            for(int i = 0; i < logSize; i++) {
                tokenizer = new StringTokenizer(reader.readLine());
                int teamId = Integer.parseInt(tokenizer.nextToken());
                int problemId = Integer.parseInt(tokenizer.nextToken());
                int score = Integer.parseInt(tokenizer.nextToken());
                
                Team team = teams.get(teamId);
                team.scores.put(problemId, Math.max(team.scores.getOrDefault(problemId, 0), score));
                team.lastSubmitTime = i;
                team.submitCount++;
            }

            List<Integer> teamIds = new ArrayList<>(teams.keySet());
            Collections.sort(teamIds, (t1, t2) -> {
                if(teams.get(t2).getTotalScore() == teams.get(t1).getTotalScore()) {
                    if(teams.get(t1).submitCount == teams.get(t2).submitCount) {
                        return teams.get(t1).lastSubmitTime - teams.get(t2).lastSubmitTime;
                    } else return teams.get(t1).submitCount - teams.get(t2).submitCount;
                } else return teams.get(t2).getTotalScore() - teams.get(t1).getTotalScore();
            });

            int rank = 1;
            for(int i = 0; i < teamIds.size(); i++) {
                if(teamIds.get(i) == targetTeamId) {
                    System.out.println(rank);
                    break;
                }
                rank++;
            }

        }
    }

    static class Team {
        
        int lastSubmitTime;
        int submitCount;
        Map<Integer, Integer> scores = new HashMap<>();

        public int getTotalScore() {
            int totalScore = 0;
            for(int score : scores.values()) {
                totalScore += score;
            }
            return totalScore;
        }
    }
}
