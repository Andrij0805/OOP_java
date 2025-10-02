import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("введіть значення основи паралелограма в мм");
        double a1 = scan.nextDouble();
        System.out.println("введіть значення висоти паралелограма в мм");
        double h1 = scan.nextDouble();

        try {
            Shape m = new Paralelogram(a1, h1);
            System.out.println("площа паралелограма: " + m.GetArea());
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        System.out.println("введіть значення нижньої основи трапеції в мм");
        double c1 = scan.nextDouble();
        System.out.println("введіть значення верхньої основи трапеції в мм");
        double d1 = scan.nextDouble();
        System.out.println("введіть значення висоти трапеції в мм");
        double h2 = scan.nextDouble();

        try {
            Shape n = new Trapezium(c1, d1, h2);
            System.out.println("площа трапеції: " + n.GetArea());
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        scan.close();
    }
}

abstract class Shape {
    abstract double GetArea();
}

class Paralelogram extends Shape {
    double A;
    double H;

    Paralelogram(double A, double H) {
        if (A <= 0 || H <= 0) {
            throw new IllegalArgumentException("Основа та висота відємні");
        }
        this.A = A;
        this.H = H;
    }

    @Override
    double GetArea() {
        return A * H;
    }
}

class Trapezium extends Shape {
    double C;
    double D;
    double H;

    Trapezium(double C, double D, double H) {
        if (C <= 0 || D <= 0 || H <= 0) {
            throw new IllegalArgumentException("Основа і висота відємні");
        }
        this.C = C;
        this.D = D;
        this.H = H;
    }

    @Override
    double GetArea() {
        return 0.5 * (C + D) * H;
    }
}