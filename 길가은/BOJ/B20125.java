import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/20125
 * 시간 : 716ms
 * 메모리 : 102556KB
 */
class Main {

    private static String[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        map = new String[size][size];
        for(int i = 0; i < size; i++) {
            map[i] = reader.readLine().split("");
        }

        int[] heart = getHeart();
        System.out.println((heart[0]+1) + " " + (heart[1]+1));
        int[] armsLength = getLength(heart);
        int[] waistAndLegsLength = getWaistLegsLength(heart);
        System.out.println(armsLength[0] + " " + armsLength[1] + " " + waistAndLegsLength[0] + " " + waistAndLegsLength[1] + " " + waistAndLegsLength[2]);

    }

    private static int[] getHeart() {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map.length; j++) {
                if(map[i][j].equals("*")) return new int[] {i+1, j};
            }
        }
        return null;
    }

    private static int[] getLength(int[] heart) {
        int start = -1;
        int end = -1;
        for(int i = 0; i < map.length; i++) {
            if(map[heart[0]][i].equals("*")) {
                if(start == -1) start = i;
                if(end < i) end = i;
            }
        }
        return new int[] {heart[1]-start, end-heart[1]};
    }

    private static int[] getWaistLegsLength(int[] heart) {
        int legRow = 0;
        for(int i = heart[0]; i < map.length; i++) {
            if(map[i][heart[1]].equals("_")) {
                legRow = i;
                break;
            }
        }
        int leftRow = -1;
        int rightRow = -1;
        for(int i = legRow; i < map.length; i++) {
            if(map[i][heart[1]-1].equals("*")) leftRow = i;
            if(map[i][heart[1]+1].equals("*")) rightRow = i;
        }
        return new int[] {legRow - heart[0] - 1, leftRow - legRow + 1, rightRow - legRow + 1};
    }
    
}
