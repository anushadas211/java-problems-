package myjava.fahrenheit.to.celsius;
import java.util.Scanner;
public class FahrenheitToCelsius {
public static void main(String[] args) {
    
Scanner scanner = new Scanner(System.in);

System.out.print("Enter temperature in Fahrenheit: ");
       
double fahrenheit = scanner.nextDouble();
double celsius = (fahrenheit - 32) * 5 / 9;

System.out.printf("%.1f degree Fahrenheit is equal to %.1f in Celsius%n", fahrenheit, celsius);

        scanner.close();
    }
}
