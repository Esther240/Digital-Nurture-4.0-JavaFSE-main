public class Forecast {
    public static double futureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return (1 + growthRate) * futureValue(presentValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.08; 
        int years = 5;

        double result = futureValue(presentValue, growthRate, years);
        System.out.printf("Predicted future value after %d years = ₹%.2f\n", years, result);
    }
}
