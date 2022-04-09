import java.util.Scanner;

/**
 * IncrementOperator
 */
public class IncrementOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit to stop");
        int start = 0;
        int stop = scanner.nextInt();
        while (start <= stop) {
            System.out.println(start);
            start++;
        }
    }
}