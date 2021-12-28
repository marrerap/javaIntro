public class whileLoop {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x != 4) {
            y += x;
            x += 1;
            System.out.println("x is : " + x + ". y is: " + y);
        }
        System.out.println("Value of y = " + y);
        System.out.println("Value of x = " + x);
    }
}
