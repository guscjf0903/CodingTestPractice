import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int checknum = 0;
        int resultnum = N;
        int cycle = 0;
        int firstnum = 0;
        int secondnum = 0;
        while(true){
            firstnum = N / 10;
            secondnum = N % 10;

            checknum = firstnum + secondnum;
            if(checknum >= 10){
                checknum = checknum % 10;
            }
            N = (secondnum * 10) + checknum;
            cycle++;
            if(N == resultnum){
                break;
            }
        }
        System.out.println(cycle);

    }
}
