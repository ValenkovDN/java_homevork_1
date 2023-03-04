/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
 */

import java.util.Scanner;
public class homework_1_task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите числ n: ");
        int n = scan.nextInt();
        int faktorial = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum += i;
            faktorial *= i;
        }

        System.out.println("Сумма чисел от 1 до n: " + sum);
        System.out.println("Факориал числа n: " + faktorial);
    }
}