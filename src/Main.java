import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int listSize, maxValue, treshold;
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.print("Введите размер списка: ");
        Scanner scanner = new Scanner(System.in);
        listSize = scanner.nextInt();

        System.out.print("Введите верхнюю границу для значений: ");
        maxValue = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(maxValue));
        }
        System.out.print("Вот случайный список: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        treshold = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(treshold);
        filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        logger.log("Завершаем программу");
    }
}