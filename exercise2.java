class exercise2 {
    public static double exercise_two(double x, double y, double z) {
        double answer = 0;
            double first = Math.pow(x, 2);
            double second = Math.pow(y, 2);
            double third = Math.abs(z);

            double equation = Math.cbrt((first + second - third));

            answer = equation;
            


        return answer;
    }
}
