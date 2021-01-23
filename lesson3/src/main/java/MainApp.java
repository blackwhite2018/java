import java.util.Scanner;
import java.util.Random;

public class MainApp {
    public static void main(String args[]) {
        game();

        Scanner fd = new Scanner(System.in);
        int isRepeatGame;

        do {
            System.out.println("\nПовторить игру ещё раз? (1 - да / 0 - нет)");
            isRepeatGame = fd.nextInt();

            if (isRepeatGame == 1)
                game();
        } while(isRepeatGame != 0);
    }

    public static void game() {
        Random rand = new Random();
        Scanner fd = new Scanner(System.in);

        final int randomNbr = rand.nextInt(9);
        int nbr;
        boolean isSuccess = false;

        System.out.println("Игра угадай число начинается. У вас есть только 3 попытки угадать число.");

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите число: ");
            nbr = fd.nextInt();

            if (nbr == randomNbr) {
                isSuccess = true;
                break;
            }
            System.out.printf("Вы загадали число: %d. Ответ неверный.", nbr);
            System.out.println(nbr > randomNbr ? "\nЗагаданное число меньше." : "\nЗагаданное число больше.");
        }

        if (isSuccess) {
            System.out.print("Поздравляем! Вы победили!");
        } else {
            System.out.printf("Поражение. Загаданное число: %d", randomNbr);
        }
    }
}
