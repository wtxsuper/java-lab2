import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Цвета для вывода в консоль
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String RESET = "\u001B[0m";

        // Сканер для чтения строки
        Scanner scanner = new Scanner(System.in);
        // Регулярное выражение, соотвествующее веб-адресу
        String urlRegex = "^(https?://)?([\\da-z.-]{2,})\\.([a-z.]{2,6})(:[0-9]+)?([/\\w .-]*)*/?$";
        // Создание паттерна на основе регулярного выражения
        Pattern pattern = Pattern.compile(urlRegex);

        while (true) {
            // Выход при вводе F
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("f")) {
                break;
            }
            // Проверка соответствия вводимой строки регулярному выражению
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                System.out.println(GREEN + "Да" + RESET);
            } else {
                System.out.println(RED + "Нет" + RESET);
            }

            System.out.println("Используйте F для выхода или введите новый текст для проверки");
        }
    }
}
