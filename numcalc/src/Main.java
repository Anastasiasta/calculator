
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int number1, number2;
    static char operation;
    static int result;

    public static void main (String[] args) {
        System.out.println("Введите выражение без пробелов и нажмите Enter:");
        String userInput = scanner.nextLine();
        char[] under_char = new char[10];
        for (int i = 0; i < userInput.length(); i++) {
            under_char[i] = userInput.charAt(i);
            if (under_char[i] == '+') {
                operation = '+';
            }
            if (under_char[i] == '-') {
                operation = '-';
            }
            if (under_char[i] == '*') {
                operation = '*';
            }
            if (under_char[i] == '/') {
                operation = '/';
            }
        }
        String under_charString = String.valueOf(under_char);
        String[] blacks = under_charString.split("[+-/*]");
        String stable00 = blacks[0];
        String stable01 = blacks[1];
        String string03 = stable01.trim();
             if ((number1 > 10 && number1 < 1) && (number2 > 10 && number2 < 1) && (number1 == (int)number1) && (number2 == (int)number2)) {
           System.out.println("Числа введены некорректно. Введите числа от 1 до 10");
             } else {
                 number1 = Integer.parseInt(stable00);
                 number2 = Integer.parseInt(string03);
                 result = calculated(number1, number2, operation);
                 System.out.println("Ответ:");
                 System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
             }
    }


    public static int calculated (int num1, int num2, char op) {
        int result = 0;
        switch (op) {
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
                if (num2 == 0) {
                    System.out.println("Делить на ноль нельзя!");
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }
        return result;
    }
}
