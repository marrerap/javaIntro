public class exercise4 {
    public static String sc(String text) {
        String answer = "";

        answer = text;
        String noSpace =  answer.trim();
        String subString = noSpace.substring(0, 5);
        String capString = subString.toUpperCase();
        answer = capString;

        return answer;
    }
}
