package myjava.old.square.series;
import java.util.Scanner;
public class OldSquareSeries {

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the number of terms: ");
  int n = scanner.nextInt();
  int sum = 0;
  int num = 1;

  for (int i = 0; i < n; i++) {
   sum += num * num;
    num += 2;
      }
  System.out.println("Sum of the series: " + sum);
        scanner.close();
    }
}
