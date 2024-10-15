import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/8979
 * 시간 : 148ms
 * 메모리 : 15180KB
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        List<Medals> medals = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            int id = Integer.parseInt(st.nextToken());
            Medals medal = new Medals(Integer.parseInt(st.nextToken())
                                        ,Integer.parseInt(st.nextToken())
                                        ,Integer.parseInt(st.nextToken()));
            if(medals.contains(medal)) {
                for(int j = 0; j < medals.size(); j++) {
                    if(medals.get(j).equals(medal)) {
                        medals.get(j).countries.add(id);
                        break;
                    }
                }
            } else {
                medal.countries.add(id);
                medals.add(medal);
            }
        }
        Collections.sort(medals, (m1,m2) -> {
            if(m1.golds == m2.golds) {
                if(m1.silvers == m2.silvers) {
                    return m2.bronzes - m1.bronzes;
                } else return m2.silvers - m1.silvers;
            } else return m2.golds - m1.golds;
        });

        int rank = 0;
        for(int i = 0; i < medals.size(); i++) {
            List<Integer> countries = medals.get(i).countries;
            if(countries.contains(target)) {
                System.out.println(rank+1);
                break;
            }
            rank += countries.size();
        }
        
    }

    static class Medals {
        
        int golds;
        int silvers;
        int bronzes;
        List<Integer> countries = new ArrayList<>();

        public Medals(int golds, int silvers, int bronzes) {
            this.golds = golds;
            this.silvers = silvers;
            this.bronzes = bronzes;
        }

        @Override
        public boolean equals(Object o) {
            Medals medals = (Medals) o;
            return this.golds == medals.golds 
                && this.silvers == medals.silvers
                && this.bronzes == medals.bronzes;
        }
    }
}
