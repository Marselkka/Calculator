import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Spliterator;

public class CalculatonJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите выражение арабскими или римскими цифрами, например 2 + 2 или X + V через пробел, затем нажмите Enter:\n");
        String expression = scanner.nextLine();

        String[] parts = expression.split("\\s");
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);
        char operator = parts[1].charAt(0);
        int result = 0;



        if ((num1<1) || (num1>10) || (num2<1) || (num2>10)){
            System.out.println("Число не входит в диапазон");
        } else {

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Некорректная операция");
                    return;
            }
            System.out.println("Результат: " + result);
        }
    }
}

