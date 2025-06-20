import java.util.Scanner;

public class Financial {

    public static double forecastRevenue(double currentRevenue, double growthRate, int years) {
        return currentRevenue * Math.pow(1 + growthRate / 100, years);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current revenue: ");
        double currentRevenue = scanner.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter number of years to forecast: ");
        int years = scanner.nextInt();

        double futureRevenue = forecastRevenue(currentRevenue, growthRate, years);

        System.out.printf("Forecasted revenue after %d years: %.2f\n", years, futureRevenue);
    scanner.close();
    }
}
