import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        List<String> studentCatalog = new ArrayList<String>(20);

        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s1 = null, s2 = null;
            int choice;

            System.out.println("Каталог студентів");


            studentCatalog.add("Гагарін");    studentCatalog.add("12.03.2002");
            studentCatalog.add("Шпак");      studentCatalog.add("25.11.2001");
            studentCatalog.add("Сидор");    studentCatalog.add("01.05.2003");
            studentCatalog.add("Грицишин");   studentCatalog.add("14.09.2000");
            studentCatalog.add("Шевченко");    studentCatalog.add("08.12.2002");
            studentCatalog.add("Порошенко");      studentCatalog.add("19.07.2001");
            studentCatalog.add("Мороз");       studentCatalog.add("03.02.2003");
            studentCatalog.add("Ткач");    studentCatalog.add("22.06.2000");
            studentCatalog.add("Тимошенко");   studentCatalog.add("30.04.2002");
            studentCatalog.add("Григоренко");  studentCatalog.add("17.10.2001");

            if (!studentCatalog.isEmpty())
                System.out.println("Кількість студентів у каталозі = " + studentCatalog.size() / 2);

            do {
                System.out.println("\nВиберіть режим роботи:");
                System.out.println("1. Показати всіх студентів");
                System.out.println("2. Додати студента");
                System.out.println("3. Пошук студента");
                System.out.println("4. Видалити студента");
                System.out.println("0. Вихід");
                s2 = br.readLine();
                choice = Integer.parseInt(s2);

                switch (choice)
                {

                    case 1:
                        System.out.println("\nКаталог студентів ");
                        for (int i = 0; i < studentCatalog.size(); i += 2)
                        {
                            System.out.println("Прізвище: " + studentCatalog.get(i) +
                                    " | Дата народження: " + studentCatalog.get(i + 1));
                        }
                        break;

                    case 2:
                        System.out.println("Введіть прізвище студента: ");
                        s1 = br.readLine();
                        System.out.println("Введіть дату народження (дд.мм.рррр): ");
                        s2 = br.readLine();
                        studentCatalog.add(s1);
                        studentCatalog.add(s2);
                        System.out.println("Студента додано!");
                        break;

                    case 3:
                        System.out.println("Введіть прізвище для пошуку: ");
                        s1 = br.readLine();
                        if (studentCatalog.contains(s1))
                        {
                            int index = studentCatalog.indexOf(s1);
                            System.out.println("Знайдено: " + studentCatalog.get(index) +
                                    " | Дата: " + studentCatalog.get(index + 1));
                        } else
                        {
                            System.out.println("Такого студента немає!");
                        }
                        break;

                    case 4:
                        System.out.println("Введіть прізвище для видалення: ");
                        s1 = br.readLine();
                        if (studentCatalog.contains(s1))
                        {
                            int index = studentCatalog.indexOf(s1);
                            System.out.println("Видалено: " + studentCatalog.get(index));
                            studentCatalog.remove(index + 1);
                            studentCatalog.remove(index);
                        } else
                        {
                            System.out.println("Студента не знайдено.");
                        }
                        break;

                    case 0:
                        System.out.println("Вихід з програми.");
                        break;

                    default:
                        System.out.println("Невірний вибір!");
                }

            } while (choice != 0);

        } catch (IOException e) {
            System.out.println("Помилка вводу!");
        }
    }
}