import java.util.Scanner;

public class FooBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 1; i <= num; i++){
            if(i % 3 == 0 && i % 5 != 0){
                System.out.println("Foo");
                continue;
            }else if(i % 5 == 0 && i % 3 != 0){
                System.out.println("Bar");
                continue;
            }else if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FooBar");
                continue;
            }
            System.out.println(i);
        }
    }
}