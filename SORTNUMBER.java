package myjava.sort.number;
import java.util.Arrays;
import java.util.Scanner;
public class SORTNUMBER {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted numbers in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}


