//문제 링크 https://www.acmicpc.net/problem/1018
//시간 112ms
//메모리 15112KB


import java.io.*;
import java.util.*;

public class Main {

    public static int getMinRepaintCost(int startRow, int startCol, String[] chessboard) {
        String[] patterns = {"WBWBWBWB", "BWBWBWBW"};
        int repaintCostWhite = 0;

        for (int i = 0; i < 8; i++) {
            int currentRow = startRow + i;
            for (int j = 0; j < 8; j++) {
                int currentCol = startCol + j;
                if (chessboard[currentRow].charAt(currentCol) != patterns[currentRow % 2].charAt(j)) {
                    repaintCostWhite++;
                }
            }
        }
        int repaintCostBlack = 64 - repaintCostWhite;
        return Math.min(repaintCostWhite, repaintCostBlack);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int rows = Integer.parseInt(st.nextToken());
        int cols = Integer.parseInt(st.nextToken());

        String[] chessboard = new String[rows];
        for (int i = 0; i < rows; i++) {
            chessboard[i] = br.readLine();
        }

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i <= rows - 8; i++) {
            for (int j = 0; j <= cols - 8; j++) {
                int currentCost = getMinRepaintCost(i, j, chessboard);
                minCost = Math.min(minCost, currentCost);
            }
        }
        System.out.println(minCost);
    }
}
