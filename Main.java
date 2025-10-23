
                       --------------------task16---------------------


import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Введіть кількість рядків: ");
        int rows = scanner.nextInt();
        System.out.print("Введіть кількість стовпців: ");
        int cols = scanner.nextInt();


        int[][] array = new int[rows][cols];


        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                array[i][j] = random.nextInt(101) - 50;
            }
        }


        System.out.println("\nЗгенерований масив:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }


        System.out.println("\nНайменші елементи кожного стовпця:");
        for (int j = 0; j < cols; j++)
        {
            int min = array[0][j];
            for (int i = 1; i < rows; i++)
            {
                if (array[i][j] < min)
                {
                    min = array[i][j];
                }
            }
            System.out.println("Стовпець " + (j + 1) + ": " + min);
        }

        scanner.close();
    }
}


                     -------------------------task17----------------------------

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Введіть кількість рядків: ");
        int rows = scanner.nextInt();
        System.out.print("Введіть кількість стовпців: ");
        int cols = scanner.nextInt();


        int[][] array = new int[rows][cols];


        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                array[i][j] = random.nextInt(101) - 50;
            }
        }


        System.out.println("\nЗгенерований масив:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }


        System.out.println("\nНайменші елементи кожного стовпця:");
        for (int j = 0; j < cols; j++)
        {
            int min = array[0][j];
            for (int i = 1; i < rows; i++)
            {
                if (array[i][j] < min)
                {
                    min = array[i][j];
                }
            }
            System.out.println("Стовпець " + (j + 1) + ": " + min);
        }

        scanner.close();
    }
}

                         
