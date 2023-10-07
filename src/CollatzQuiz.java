import java.util.Scanner;

public class CollatzQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        int num = 0;
        while(result != 1){
            if(result % 2 == 0){
                result /= 2;
                num++;
            }else if(result % 2 == 1){
                result *= 3;
                result += 1;
                num++;
            }
            if(num > 500){
                num = -1;
                break;
            }
        }

        System.out.println(num);
    }


}
