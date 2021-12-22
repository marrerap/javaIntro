public class type_char {
    public static void main(String[] args) {
        char letter = 'A';
        System.out.println(letter);

        char number_as_text = '4';
        System.out.println(number_as_text);

        // 65 will not display as 65, it will display as a character as 
        // defined by a standard code similar to unicode
        char number = 65;
        System.out.println(number);
    }
}
