import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть імя");
        String userName = scanner.next();
        System.out.println("Введіть вша вік");
        int userAge = scanner.nextInt();
        System.out.println("Hello " + userName);
        System.out.println("You are " + userAge + " year old!");
    }
}
