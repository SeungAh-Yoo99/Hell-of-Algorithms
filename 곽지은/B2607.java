//문제 링크 : https://www.acmicpc.net/problem/2607
//시간 : 124ms
//메모리 : 15532KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int wordNum = Integer.parseInt(br.readLine());
        String InputWord = br.readLine();
        char[] firstInputWordChars = InputWord.toCharArray();
        Arrays.sort(firstInputWordChars);
        String standardStr = new String(firstInputWordChars);
        
        int answer = 0 ; 
        for(int i = 1; i < wordNum; i++){
            InputWord = br.readLine();
            char[] otherInputWordChars = InputWord.toCharArray();
            Arrays.sort(otherInputWordChars);
            String tempStr = new String(otherInputWordChars);
            String standerword = standardStr;
            
            if(standardStr.length()> tempStr.length()){
                for(int j = 0;j < tempStr.length();j++){
                	standerword = standerword.replaceFirst(String.valueOf(tempStr.charAt(j)),"");
                }
                if(standerword.length()==1){
                    answer++;
                }
            }
            else{
                for(int j = 0;j < standerword.length();j++){
                    tempStr = tempStr.replaceFirst(String.valueOf(standerword.charAt(j)),"");
                }
                if(tempStr.length()==1||tempStr.length()==0){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
