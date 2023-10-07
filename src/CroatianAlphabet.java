import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CroatianAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String brstr = br.readLine();
        String[] alpha = {"c=", "c-","dz=","d-","lj","nj","s=", "z="};
        for(int i = 0; i < alpha.length; i++){
            if(brstr.contains(alpha[i])){
                brstr = brstr.replace(alpha[i], "i");
            }
        }
        System.out.println(brstr.length());

    }
}
