/*
Вывести все простые числа от 1 до 1000
 */
public class homework_1_task_2 {
    public static void main(String[] args) {

        for (int i = 2; i <= 1000; i++) {
            boolean tof = true;
            for (int j = 2; j < i; j++) {
                if ( i % j == 0) {
                    tof = false;
                    break;
                }
            }
            if (tof) System.out.println(i);
        }
    }
}
