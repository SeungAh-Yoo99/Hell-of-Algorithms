문제 링크: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5Pl0Q6ANQDFAUq



import java.util.Scanner;
import java.io.FileInputStream;
 
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
     
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        StringBuilder sb = new StringBuilder();
         
        int[] sum = new int[11];
         
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum[i] = sum[i - 1] - i;
            } 
            else {
                sum[i] = sum[i - 1] + i; 
            }
        }
        
         
        for(int test_case = 1; test_case <= T; test_case++)
        {     
           int num = sc.nextInt();
            sb.append("#").append(test_case).append(" ").append(sum[num]).append("\n");  
        }
        System.out.print(sb.toString());
    }
}
