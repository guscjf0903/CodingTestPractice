import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bingo {
    public static void main(String[] argc) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] buffer = new String[5][5];
        int[][] player = new int[5][5];
        for (int i = 0; i < 5; i++) {
            buffer[i] = br.readLine().split(" ");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                player[i][j] = Integer.parseInt(buffer[i][j]);
            }
        }

        int[] call = new int[25];
        for (int i = 0; i < 5; i++) {
            buffer[i] = br.readLine().split(" ");
        }
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                call[k] = Integer.parseInt(buffer[i][j]);
                k++;
            }
        }
// --------------입력 ---------------

        int result = 0;
        int bingoline = 0;
        for(int i = 0; i < call.length; i++){
            bingocheck(player,call[i]);
            bingoline = linecheck(player);
            if(bingoline >= 3){
                result = i + 1;
                break;
            }
        }

        System.out.println(result);


    }

    public static void bingocheck(int[][] player,int call) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(call == player[i][j]){
                    player[i][j] = 0;
                    return;
                }
            }
        }
    }


    public static int linecheck(int[][] player){
        int line = 0;
        int sum  = 0;
        for(int i = 0; i < 5; i++){ //가로줄 검사
            for(int j = 0; j < 5; j++){
                sum += player[i][j];
            }
            if(sum == 0){
                line++;
            }
            sum = 0;
        }

        for(int i = 0; i < 5; i++){//세로줄 검사.
            for(int j = 0; j < 5; j++){
                sum += player[j][i];
            }
            if(sum == 0){
                line++;
            }
            sum = 0;
        }


        for(int i = 0; i < 5; i++){ //대각선 검사
            sum += player[i][i];
        }
        if(sum == 0){
            line++;
        }
        sum = 0;
        for(int i = 0; i < 5; i++){
            sum += player[i][4 - i];
        }
        if(sum == 0){
            line++;
        }

        return line;
    }
}
