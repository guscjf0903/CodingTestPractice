import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KaKaoNumArrayEng {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String[] engnum = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        s = s.replace("zero", "0");
        s = s.replace("one", "1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");
        int result = Integer.parseInt(s);
        System.out.println(result);
    }
}
