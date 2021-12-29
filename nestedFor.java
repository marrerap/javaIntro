public class nestedFor {
    public static void main(String[] args) {
        int input = 5;

        System.out.println("How many missles will you fire?");
        System.out.println("I will fire: " + input + " missiles.");

        for (int i = 0; i < input; i++) {
            for (int j = 3; j > 0; j--) {
                System.out.println(j + " ");
            }
            System.out.println("Missile " + (i + 1) + " has launched");
        }
        System.out.println("All missiles have been launched");
    }
}
