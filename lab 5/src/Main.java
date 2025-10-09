import java.util.Scanner;

interface FigureBehavior {
    double getArea();
    String getColor();
    void setColor(String color);
    default String getDescription(){
        return "123";
    }
}

abstract class Shape
{
    protected String color;
    private String unit = "мм";
    protected static int shapeCount = 0;

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


    public int compareArea(Shape other)
    {
        return Double.compare(this.getArea(), other.getArea());
    }

    public abstract double getArea();
}



class Parallelogram extends Shape implements FigureBehavior
{
    private double a;
    private double h;
    private String description = "Паралелограм";

    public Parallelogram(double a, double h)
    {
        this(a, h, "без кольору");
    }

    public Parallelogram(double a, double h, String color)
    {
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

    @Override
    public String getColor()
    {
        return color;
    }

    @Override
    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public String getDescription()
    {
        return description;
    }
}



class Trapezium extends Shape implements FigureBehavior
{
    private double c;
    private double d;
    private double h;
    private static int trapeziumCount = 0;
    private String description = "Трапеція";

    public Trapezium(double c, double d, double h)
    {
        this(c, d, h, "без кольору");
    }

    public Trapezium(double c, double d, double h, String color)
    {
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

    @Override
    public String getColor()
    {
        return color;
    }

    @Override
    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public String getDescription()
    {
        return description;
    }

    public static int getTrapeziumCount()
    {
        return trapeziumCount;
    }
}



public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть значення основи паралелограма (мм):");
        double a1 = scan.nextDouble();
        System.out.println("Введіть значення висоти паралелограма (мм):");
        double h1 = scan.nextDouble();

        FigureBehavior fig1 = new Parallelogram(a1, h1, "червоний");

        System.out.println("Введіть нижню основу трапеції (мм):");
        double c1 = scan.nextDouble();
        System.out.println("Введіть верхню основу трапеції (мм):");
        double d1 = scan.nextDouble();
        System.out.println("Введіть висоту трапеції (мм):");
        double h2 = scan.nextDouble();

        FigureBehavior fig2 = new Trapezium(c1, d1, h2, "синій");


        System.out.println("\n=== Результати ===");
        System.out.println(fig1.getDescription() + ": площа = " + fig1.getArea() + ", колір = " + fig1.getColor());
        System.out.println(fig2.getDescription() + ": площа = " + fig2.getArea() + ", колір = " + fig2.getColor());

        Shape shape1 = (Shape) fig1;
        Shape shape2 = (Shape) fig2;

        int cmp = shape1.compareArea(shape2);
        if (cmp > 0)
            System.out.println("Площа " + fig1.getDescription() + " більша.");
        else if (cmp < 0)
            System.out.println("Площа " + fig2.getDescription() + " більша.");
        else
            System.out.println("Площі рівні.");

        System.out.println("\nКількість усіх створених фігур: " + Shape.getShapeCount());
        System.out.println("Кількість трапецій: " + Trapezium.getTrapeziumCount());

        scan.close();
    }
}