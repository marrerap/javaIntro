public class concat {
    public static void main(String[] args) {
        String one = "Hello";
        String two = " World";
        int number = 10;

        // concat two strings
        System.out.println(one + two);

        // concat a number and a string
        System.out.println(one + " " + number);

        // saving concat string and printing
        String new_string = one + two + " " + number;
        System.out.println(new_string);

    }
}
