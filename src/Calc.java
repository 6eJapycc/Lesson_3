import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Введите первое число:");
            double number1 = sc.nextDouble();
            System.out.println("Введите второе число:");
            double number2 = sc.nextDouble();
            System.out.println("Введите тип операции. Доступно: '+', '-', '*', '/'");
            String operation = sc.next();

            double result1;
            String result = null;
            switch (operation) {
                case "+":
                    result1 = number1 + number2;
                    result = String.format("%.3f", result1);
                    break;
                case "-":
                    result1 =  number1 - number2;
                    result = String.format("%.3f", result1);
                    break;
                case "*":
                    result1 =  number1 * number2;
                    result = String.format("%.3f", result1);
                    break;
                case "/":
                    result1 =  number1 / number2;
                    result = String.format("%.3f", result1);
                    break;
                default:
                    System.out.println("Оператор не найден");
                    continue;
            }
            System.out.println("Результат: " + result);
            System.out.println("n - продолжить программу, y - завершить: ");

            String next = sc.next();
            switch (next) {
                case "y":
                    return;
                case "n":
                    break;
            }
        }
    }
}
