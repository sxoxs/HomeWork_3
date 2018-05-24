package logik;

import java.util.Scanner;

public class Menu {

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        for (;;){
            System.out.println("Выберите игру: \n 1. Угадай число; \n 2. Угадай слово; \n 3. Выход." );
            switch (sc.nextInt()){
                case 1: {
                    GuessTheNumber guessTheNumber = new GuessTheNumber();
                    guessTheNumber.runGameGuessTheNubber();
                    break;
                }
                case 2: {
                    GuessTheWord guessTheWord = new GuessTheWord();
                    guessTheWord.runGameGuessTheWord();
                    break;
                }
                case 3:{
                    System.out.println("Спасибо за игру!");
                    return;
                }
            }
        }
    }
}
