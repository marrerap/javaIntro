public class conditional_exp {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int answer;

        answer = (x > y) ? x : y;
        System.out.println("Answer using conditional: " + answer);


        // the above code is the equivalent of using the following if-else method

        if (x > y) {
            answer = x;
        } else {
            answer = y;
        }
        System.out.println("Answer using if-else: " + answer);
    }
}
