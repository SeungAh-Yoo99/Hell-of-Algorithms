import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/9017
 * 시간 : 152ms
 * 메모리 : 16192KB
 */
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testSize = Integer.parseInt(reader.readLine());
        for(int i = 0; i < testSize; i++) {
            int teamsSize = Integer.parseInt(reader.readLine());
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            Map<String, Integer> outTeams = new HashMap<>();
            String[] teams = new String[teamsSize];
            for(int j = 0; j < teamsSize; j++) {
                String team = tokenizer.nextToken();
                teams[j] = team;
                Integer teamSize = outTeams.getOrDefault(team, 0) + 1;
                if(teamSize.equals(6)) outTeams.remove(team);
                else outTeams.put(team, teamSize);
            }

            Map<String, Score> teamScores = new HashMap<>();
            int score = 1;
            for(int j = 0; j < teamsSize; j++) {
                if(!outTeams.containsKey(teams[j])) {
                    if(teamScores.containsKey(teams[j])) {
                        Score teamScore = teamScores.get(teams[j]);
                        if(teamScore.count == 4) teamScore.fifth = score;
                        if(teamScore.count < 4) teamScore.scores += score;
                        teamScore.count++;
                    } else {
                        teamScores.put(teams[j], new Score(score, 1));
                    }
                    score++;
                }
            }

            List<String> teamList = new ArrayList<>(teamScores.keySet());
            Collections.sort(teamList, (t1, t2) -> {
                if(teamScores.get(t1).scores == teamScores.get(t2).scores) return teamScores.get(t1).fifth - teamScores.get(t2).fifth;
                return teamScores.get(t1).scores - teamScores.get(t2).scores;
                    });
            System.out.println(teamList.get(0));
        }
    }

    static class Score {
        int scores;
        int count;
        int fifth;

        public Score (int scores, int count) {
            this.scores = scores;
            this.count = count;
            this.fifth = 0;
        }
    }
}
