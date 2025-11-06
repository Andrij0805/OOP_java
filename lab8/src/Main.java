import java.util.Scanner;

public class Main
{

    public static String xorCipher(String text, String key) {
        StringBuilder result = new StringBuilder();
        int keyLength = key.length();

        for (int i = 0; i < text.length(); i++)
        {
            char c = (char) (text.charAt(i) ^ key.charAt(i % keyLength));
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String text = "Але такий поділ програмного забезпечення на системне і приклад- не" +
                " є чисто умовним, оскільки його розробка в обох випадках здій- снюється з допомогою одних і тих " +
                "самих інструментальних засобів: компіляторів мов високого рівня; засобів редагування, компонуван- ня " +
                "і завантаження програм.";

        System.out.println(text);

        System.out.print("Введіть ключ для кодування та розкодування: ");
        String key = scanner.nextLine();


        if (key.isEmpty() || key.trim().isEmpty())
        {
            System.out.println("Помилка: ключ не може бути порожнім.");
            scanner.close();
            return;
        }

        String encoded = xorCipher(text, key);
        System.out.println("Закодований текст: " + encoded);

        String decoded = xorCipher(encoded, key);
        System.out.println("Розкодований текст: " + decoded);

        scanner.close();
    }
}