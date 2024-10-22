//문제링크 https://www.acmicpc.net/problem/7568
//시간 104ms
//메모리 14200kB



import java.io.*;

class Person {
    int weight;
    int height;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numN = Integer.parseInt(br.readLine());
        Person[] people = new Person[numN];

        String[] str;
        for(int i = 0; i < numN; i++) {
            str = br.readLine().split(" ");
            int weight = Integer.parseInt(str[0]);
            int height = Integer.parseInt(str[1]);
            people[i] = new Person(weight, height);
        }

        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < numN; i++) {
            int rank = 1;
            
            for(int j = 0; j < numN; j++) {
                if(i == j) continue;
                if (people[i].weight < people[j].weight && people[i].height < people[j].height) {
                    rank++;
                }
            }
            sb.append(rank).append(' ');
        }
        System.out.println(sb);
    }
}


//시간 104ms
//메모리 14112KB



import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numN = Integer.parseInt(br.readLine());
		int[][] arr = new int[numN][2];
 
		String[] str;
		for(int i = 0; i < numN; i++) {
			str = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]);	
			arr[i][1] = Integer.parseInt(str[1]);	
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < numN; i++) {
			int rank = 1;
			
			for(int j = 0; j < numN; j++) {
				if(i == j) continue;
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			sb.append(rank).append(' ');
		}
		System.out.println(sb);
	}
}





