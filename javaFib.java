public class javaFib {
    public static void main(String[] args) {
        int n = 10;  
        String fib = "";      
        String fibStart = "0 1";
        int first = 0;
        int second = 1;

        for (int i = 0; i < (n - 2); i++) {
            int sum = first + second;
            first = second;
            second = sum;
            fib += String.valueOf(" " + sum);


        }
        System.out.println(fibStart + fib);
    }
}
