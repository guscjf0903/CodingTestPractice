import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String charnums = br.readLine().toUpperCase();
        int result = 0;
        for(char charnum : charnums.toCharArray()){
            if(charnum >= 65 && charnum <= 67){
                result += 3;
            } else if(charnum >= 68 && charnum <= 70){
                result += 4;
            } else if(charnum >= 71 && charnum <= 73){
                result += 5;
            } else if(charnum >= 74 && charnum <= 76){
                result += 6;
            } else if(charnum >= 77 && charnum <= 79){
                result += 7;
            } else if(charnum >= 80 && charnum <= 83){
                result += 8;
            } else if(charnum >= 84 && charnum <= 86){
                result += 9;
            } else if(charnum >= 87 && charnum <= 90){
                result += 10;
            }
        }
        System.out.println(result);
    }
}
