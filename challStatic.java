public class challStatic {
    public static int checksum(int one, int two) {
        int check;

        if (one + two < 100) {
            check = 0;
        }else if (one + two == 100){
            check = 2;
        }else {
            check = 1;
        }
        return check;
    }
}
