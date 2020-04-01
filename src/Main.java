import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b =scan.nextInt();
        int c= scan.nextInt();

        int count = 0;
        if(a>0){
           count++;
        }if(b>0){
            count++;
        }if(c>0){
            count++;
        }
        System.out.println(count);
        System.out.println("Hello");
        System.out.println("world");
    }
}
