import java.io.*;
import java.util.*;

public class KartaStudentiv
{
    public static void main(String[] args)
    {

        Map<String, String> studentMap = new HashMap<>();

        studentMap.put("Іваненко", "2005-03-12");
        studentMap.put("Романів", "2004-11-25");
        studentMap.put("Шевченко", "2006-01-08");
        studentMap.put("Стеценко", "2005-07-19");
        studentMap.put("Коваль", "2004-04-04");
        studentMap.put("Мельник", "2005-12-30");
        studentMap.put("Степаненко", "2006-02-10");
        studentMap.put("Демченко", "2005-06-17");
        studentMap.put("Стерненко", "2005-09-01");
        studentMap.put("Мартинюк", "2007-05-08");


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {

            String surname, birthDate, mode;

            System.out.println("КАРТА СТУДЕНТІВ");
            System.out.println("0 - Вихід з програми");
            System.out.println("1 - Пошук студента");
            System.out.println("2 - Додати нового студента");
            System.out.println("3 - Видалити студента");
            System.out.println("4 - Вивести всіх студентів");

            System.out.print("\nВкажіть номер режиму роботи програми: ");
            mode = br.readLine();

            while (!mode.equals("0")) {


                if (mode.equals("1"))
                {
                    System.out.print("Введіть прізвище для пошуку: ");
                    surname = br.readLine();
                    if (studentMap.containsKey(surname))
                    {
                        System.out.println("Знайдено: " + surname + " — " + studentMap.get(surname));
                    } else
                    {
                        System.out.println("Студента з таким прізвищем немає!");
                    }
                }


                else if (mode.equals("2"))
                {
                    System.out.print("Введіть прізвище студента: ");
                    surname = br.readLine();
                    System.out.print("Введіть дату народження (рррр-мм-дд): ");
                    birthDate = br.readLine();
                    studentMap.put(surname, birthDate);
                    System.out.println("Студента додано до карти.");
                }


                else if (mode.equals("3"))
                {
                    System.out.print("Введіть прізвище студента для видалення: ");
                    surname = br.readLine();
                    if (studentMap.containsKey(surname))
                    {
                        System.out.println("Видалено: " + surname + " — " + studentMap.get(surname));
                        studentMap.remove(surname);
                    } else
                    {

                        System.out.println("Такого студента не знайдено!");
                    }
                }


                else if (mode.equals("4"))
                {
                    System.out.println("\n Список студентів");
                    for (Map.Entry<String, String> entry : studentMap.entrySet())
                    {
                        System.out.println(entry.getKey() + " — " + entry.getValue());
                    }
                    System.out.println("Всього студентів: " + studentMap.size());
                }


                else
                {
                    System.out.println("Невірний режим! Спробуйте ще раз.");
                }


                System.out.print("\nВкажіть номер режиму роботи програми: ");
                mode = br.readLine();
            }

            System.out.println("\nПрограму завершено. До побачення!");

        } catch (IOException e)
        {
            System.err.println("Помилка вводу/виводу: " + e.getMessage());
        } catch (Exception e)
        {
            System.err.println("Несподівана помилка:");
            e.printStackTrace();
        }
    }
}