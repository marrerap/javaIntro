public class forExercise {
    public static String test(int num) {
        String answer = "";
        
        for (int i = 1; i < 11; i++) {
            answer += String.valueOf(num *i) + " ";
        }

        return answer;
        
    }
}
