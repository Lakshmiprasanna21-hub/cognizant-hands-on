import java.util.Scanner;

public class FinancialForecast {

    public static double forecast(double currentValue, double annualGrowthRate, int years) {
        return currentValue * Math.pow(1 + annualGrowthRate / 100, years);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current revenue (₹): ");
        double currentRevenue = scanner.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double forecastedRevenue = forecast(currentRevenue, growthRate, years);

        System.out.printf("Forecasted revenue after %d years: ₹%.2f\n", years, forecastedRevenue);
    }
}
