import java.util.Scanner;
class TemperatureConverter
{
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 1.8) + 32;
    }

    public static void main(String[] args){
        
        System.out.print("Enter the temperature in celsius= ");
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();

        double Fahrenheit = celsiusToFahrenheit(celsius);

        System.out.printf("%.2f degree celsius is %.2f fahrenheit. ",celsius, Fahrenheit);
        sc.close();

    }
}