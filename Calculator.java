import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, res;
        char operator;
        System.out.print("Enter two numbers");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        System.out.print("Enter Arithmetic operator");
        operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                res = a + b;
                System.out.print(res);
                break;
            case '-':
                res = a - b;
                System.out.print(res);
                break;
            case '*':
                res = a * b;
                System.out.print(res);
                break;
            case '/':
                res = a / b;
                System.out.print(res);
                break;

            default:
                System.out.print("try again");
                break;
        }

    }
}
