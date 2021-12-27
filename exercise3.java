public class exercise3 {
    public static boolean exercise_2(boolean x, boolean y) {
        boolean answer = false;

        boolean one = !x;
        boolean two = one ^ x;
        boolean three = two && y;

        answer = !three;




        return answer;
    }
    
}