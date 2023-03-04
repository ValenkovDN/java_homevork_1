/*
Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->
 */
import java.util.Scanner;
public class homework_1_task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = scan.nextDouble();

        System.out.print("Введите знак ( + - / *): ");
        String sign = scan.next();

        System.out.print("Введите второе число: ");
        double b = scan.nextDouble();

        if (sign.equals("+")) System.out.println( a + "+" + b + "=" + (a + b));
        if (sign.equals("-")) System.out.println( a + "-" + b + "=" + (a - b));
        if (sign.equals("/")) System.out.println( a + "/" + b + "=" + (a / b));
        if (sign.equals("*")) System.out.println( a + "x" + b + "=" + (a * b));
    }
}
