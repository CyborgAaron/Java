public class Exercise2 {
    public static void main(String[] args) {
        //float Fahrenheit = 105.8f;
        double Fnum1 = 9d;
        double Fnum2 = 5d;
        double Celsius = 41.0d;
        double EndFormula = 32d;
        double Fsum = Fnum1 / Fnum2 * Celsius + EndFormula;

        String DegreeCelsius = " Degree Celsius is ";
        String DegreeFahrenheit = " degree Fahrenheit";
        System.out.println(Celsius + DegreeCelsius + Fsum + DegreeFahrenheit);
    }
}
