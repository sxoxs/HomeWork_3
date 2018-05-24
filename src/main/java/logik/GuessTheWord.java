package logik;

import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {

//    2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
// "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
// "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер
// показывает буквы которые стоят на своих местах.
//            apple – загаданное
//    apricot - ответ игрока
//    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//    Для сравнения двух слов посимвольно, можно пользоваться:
//    String str = "apple";
//str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//    Играем до тех пор, пока игрок не отгадает слово
//    Используем только маленькие букв


    public void runGameGuessTheWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
 "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
 "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random rn = new Random();
        int requiredNumberWord = 0;
        int attemptsNumber = 0;
        Scanner sc = new Scanner(System.in);

        for (;;) {
            requiredNumberWord = rn.nextInt(words.length);
            attemptsNumber = 0;
            System.out.println("Угадайте слово");

            for (;;){
                System.out.println(words[requiredNumberWord]);

                System.out.println("Введите слово:");
                if (words[requiredNumberWord].equalsIgnoreCase(sc.nextLine())) {
                    System.out.println("Поздравляем!\nВы угадали слово");
                    break;
                }
                else {
                    System.out.println("Вы не угадали");
                    System.out.println("Подсказка:");
                    attemptsNumber++;
                    for (int i = 0; i < 15; i++) {
                        if (i < attemptsNumber){
                            System.out.print(words[requiredNumberWord].charAt(i));
                        }
                        else {
                            System.out.print("#");
                        }
                    }
                    System.out.println();
                    if (attemptsNumber == words[requiredNumberWord].length()){
                        System.out.println("Вы не угадали слово");
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


