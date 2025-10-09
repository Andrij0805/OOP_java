import java.util.Scanner;


public class Main {
    public static  void test(A a){
        a = new A(20);
        a.Value = 10;
    }
    public static void main(String[] args) {


        A a1 = new A(5);
        test(a1);
        System.out.println(a1.Value);




//        Scanner scan = new Scanner(System.in);
//
//        try {
//
//            Parallelogram test = new Parallelogram(10, 10);
//
//
//            System.out.println("Введіть значення основи паралелограма (мм):");
//            double a1 = scan.nextDouble();
//            System.out.println("Введіть значення висоти паралелограма (мм):");
//            double h1 = scan.nextDouble();
//
//            Parallelogram m = new Parallelogram(a1, h1);
//            System.out.println("Площа паралелограма: " + m.getArea());
//            System.out.println("Колір паралелограма: " + m.getColor());
//            System.out.println("Одиниця вимірювання: " + m.getUnit());
//            System.out.println("Кількість усіх фігур: " + Shape.getShapeCount());
//
//
//            System.out.println("Введіть нижню основу трапеції (мм):");
//            double c1 = scan.nextDouble();
//            System.out.println("Введіть верхню основу трапеції (мм):");
//            double d1 = scan.nextDouble();
//            System.out.println("Введіть висоту трапеції (мм):");
//            double h2 = scan.nextDouble();
//
//            Trapezium n = new Trapezium(c1, d1, h2);
//            System.out.println("Площа трапеції: " + n.getArea());
//            System.out.println("Кількість створених трапецій: " + Trapezium.getTrapeziumCount());
//
//
//            int cmp = m.compareArea(n);
//            if (cmp < 0)
//                System.out.println("Площа паралелограма менша за площу трапеції.");
//            else if (cmp == 0)
//                System.out.println("Площі рівні.");
//            else
//                System.out.println("Площа паралелограма більша за площу трапеції.");
//
//
//            m.setColor("blue");
//            System.out.println("Новий колір паралелограма: " + m.getColor());
//
//        } catch (IllegalArgumentException e)
//        {
//            System.out.println("Помилка: " + e.getMessage());
//        } finally
//        {
//            scan.close();
//        }
    }
}


abstract class Shape
{
    private String unit = "мм";
    protected String color;
    protected static int shapeCount = 0;


    {
        unit = "мм";
    }

    protected Shape()
    {
        shapeCount++;
    }

    public static int getShapeCount()
    {
        return shapeCount;
    }

    public String getUnit()
    {
        return unit;
    }

    public abstract double getArea();


    public int compareArea(Shape other)
    {
        return Double.compare(this.getArea(), other.getArea());
    }
}


class Parallelogram extends Shape
{

    private double a;
    private double h;

    protected String description;
    public static final String TYPE = "Parallelogram";


    {
        description = "Паралелограм";
    }


    public Parallelogram(double a, double h)
    {
        this(a, h, "без кольору");
    }

    public Parallelogram(double a, double h, String color)
    {
        super();
        if (a <= 0 || h <= 0)
            throw new IllegalArgumentException("Основа і висота не можуть бути від'ємними або нульовими.");
        this.a = a;
        this.h = h;
        this.color = color;
    }


    @Override
    public double getArea()
    {
        return a * h;
    }


    public double getArea(int i)
    {
        return i;
    }

    public double getArea(int i, int j)
    {
        return i + j;
    }

    public String getArea(String text)
    {
        return text;
    }


    public double getA() { return a; }
    public void setA(double a)
    {
        if (a <= 0) throw new IllegalArgumentException("Основа не може бути від'ємною або нульовою.");
        this.a = a;
    }

    public double getH() { return h; }
    public void setH(double h)
    {
        if (h <= 0) throw new IllegalArgumentException("Висота не може бути від'ємною або нульовою.");
        this.h = h;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getDescription() { return description; }
}


class Trapezium extends Shape
{
    private double c;
    private double d;
    private double h;

    private static int trapeziumCount = 0;


    public Trapezium(double c, double d, double h)
    {
        this(c, d, h, "без кольору");
    }

    public Trapezium(double c, double d, double h, String color)
    {
        super();
        if (c <= 0 || d <= 0 || h <= 0)
            throw new IllegalArgumentException("Параметри не можуть бути від'ємними або нульовими.");
        this.c = c;
        this.d = d;
        this.h = h;
        this.color = color;
        trapeziumCount++;
    }

    @Override
    public double getArea()
    {
        return 0.5 * (c + d) * h;
    }

    public static int getTrapeziumCount()
    {
        return trapeziumCount;
    }


    public double getC() { return c; }
    public void setC(double c)
    {
        if (c <= 0) throw new IllegalArgumentException("Значення не може бути від'ємним або нульовим.");
        this.c = c;
    }

    public double getD() { return d; }
    public void setD(double d)
    {
        if (d <= 0) throw new IllegalArgumentException("Значення не може бути від'ємним або нульовим.");
        this.d = d;
    }

    public double getH() { return h; }
    public void setH(double h)
    {
        if (h <= 0) throw new IllegalArgumentException("Значення не може бути від'ємним або нульовим.");
        this.h = h;
    }

    protected String shapeInfo()
    {
        return "Трапеція: висота = " + h;
    }
}