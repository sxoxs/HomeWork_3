package logik;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
//    1. Написать программу, которая загадывает случайное число от 0 до 9,
// и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер
// должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    public void runGameGuessTheNubber() {
        Random rn = new Random();
        int requiredNumber = 0;
        int attemptsNumber = 0;
        Scanner sc = new Scanner(System.in);

        for (;;) {
            requiredNumber = rn.nextInt(10);
            attemptsNumber = 3;
            System.out.println("Угадайте число от 0 до 9");

            for (;;){
                System.out.println(requiredNumber);
                System.out.println("Осталось попыток "+ attemptsNumber);
                System.out.println("Введите число:");
                if (requiredNumber == sc.nextInt()) {
                    System.out.println("Поздравляем!\nВы угадали число");
                    break;
                }
                else {
                    System.out.println("Вы не угадали");
                    attemptsNumber--;
                    if (attemptsNumber == 0){
                        break;
                    }
                }
            }

            System.out.println("Повторить игру?\n 1. Да; \n 2. Нет.");
            if (2 == sc.nextInt()){
                break;
            }
        }
    }
}
