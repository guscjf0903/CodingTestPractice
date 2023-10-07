import java.util.Scanner;

public class _1toNPlus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int total = -1;
        if(num >= 1 && num <= 100){
            total++;
            while(num > 0){
                if(num % 10 == 0){
                    num--;
                    continue;
                }
                total += num;
                num--;
            }
        }
        System.out.println(total);
    }

}
