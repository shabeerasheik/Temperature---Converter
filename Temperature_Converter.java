import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }

    public static double fahrenheitToKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToFahrenheit(double k) {
        return (k - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Temperature Converter =====");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            if (choice == 7) {
                System.out.println("Thank you for using Temperature Converter!");
                break;
            }

            if (choice < 1 || choice > 7) {
                System.out.println("Invalid choice! Please select between 1 and 7.");
                continue;
            }

            System.out.print("Enter temperature: ");

            if (!sc.hasNextDouble()) {
                System.out.println("Invalid temperature! Please enter a valid number.");
                sc.next();
                continue;
            }

            double temp = sc.nextDouble();

            switch (choice) {

                case 1:
                    System.out.printf("Result: %.2f °F%n", celsiusToFahrenheit(temp));
                    break;

                case 2:
                    System.out.printf("Result: %.2f °C%n", fahrenheitToCelsius(temp));
                    break;

                case 3:
                    System.out.printf("Result: %.2f K%n", celsiusToKelvin(temp));
                    break;

                case 4:
                    System.out.printf("Result: %.2f °C%n", kelvinToCelsius(temp));
                    break;

                case 5:
                    System.out.printf("Result: %.2f K%n", fahrenheitToKelvin(temp));
                    break;

                case 6:
                    System.out.printf("Result: %.2f °F%n", kelvinToFahrenheit(temp));
                    break;
            }
        }

        sc.close();
    }
}
