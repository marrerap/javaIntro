import java.util.Scanner;

public class take_input {
    public static void main(String[] args) {
        Scanner scanner_one = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner_one.nextLine();
        System.out.println("Your name is: " + name);
        scanner_one.close();
    }    
}
