문제 링크 : https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5Pl0Q6ANQDFAUq

import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
         
        StringBuilder sb = new StringBuilder();
     
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int number = sc.nextInt();
             
            int n2 = 0, n3 = 0, n5 = 0, n7 = 0, n11 = 0;
             
            while(number != 1) {
                if(number % 2 == 0) {
                    n2++;
                    number /= 2;
                }               
                if(number % 3 == 0) {
                    n3++;
                    number /= 3;
                }               
                if(number % 5 == 0) {
                    n5++;
                    number /= 5;
                }               
                if(number % 7 == 0) {
                    n7++;
                    number /= 7;
                }               
                if(number % 11 == 0) {
                    n11++;
                    number /= 11;
                }
            }
            sb.append("#").append(test_case).append(" ").append(n2)
              .append(" ").append(n3).append(" ").append(n5)
              .append(" ").append(n7).append(" ").append(n11).append("\n");
        }
        System.out.print(sb.toString());
    }
}
