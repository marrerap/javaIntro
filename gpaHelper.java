public class gpaHelper {
    public static double gpaHalper(String grade) {
        double decimal;
        if (grade == "A+") {
            decimal = 4;
        }else if (grade == "A") {
            decimal = 4;
        }else if (grade == "A-") {
            decimal = 3.7;
        }else if (grade == "B+") {
            decimal = 3.3;
        }else if (grade == "B") {
            decimal = 3;
        }else if (grade == "B-") {
            decimal = 2.8;
        }else if (grade == "C+") {
            decimal = 2.5;
        }else if (grade == "C") {
            decimal = 2;
        }else if (grade == "C-") {
            decimal = 1.8;
        }else if (grade == "D") {
            decimal = 1.5;
        }else if (grade == "F") {
            decimal = 0;
        }else {
            return decimal = -1;
        }



        return decimal;
    }    
}
 