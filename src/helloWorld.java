import java.util.Scanner;
public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Please give me your name");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name);
    }
}
