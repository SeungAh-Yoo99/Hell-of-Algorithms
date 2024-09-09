// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/43164;
// 시간: 60.69ms
// 메모리: 110MB

class Solution {
    static TreeSet<String> roots = new TreeSet<>();
    static String[][] _tickets;

    public static String[] solution(String[][] tickets) {
        _tickets = tickets;
        
        String[] root;
        boolean[] visited;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals("ICN")) {
                root = new String[tickets.length + 1];
                root[0] = "ICN";
                visited = new boolean[tickets.length];
                visited[i] = true;
                dfs(root, i, visited, 1);
            }
        }

        return roots.first().split(" ");
    }

    static void dfs(String[] chosen, int ticketIdx, boolean[] visited, int depth) {
        if (depth == _tickets.length) {
            chosen[depth] = _tickets[ticketIdx][1];
            roots.add(String.join(" ", chosen));
            return;
        }

        for (int i = 0; i < _tickets.length; i++) {
            if (!visited[i] && _tickets[ticketIdx][1].equals(_tickets[i][0])) {
                chosen[depth] = _tickets[i][0];
                visited[i] = true;
                dfs(chosen, i, visited, depth + 1);
                visited[i] = false;
            }
        }
    }
}
