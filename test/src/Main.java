import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Task 1 ");
        for (double x = -2; x <= 3.001; x += 0.2)
        {
            double y = Math.sqrt(3 * x * x + x);
            System.out.println("x = " + x + " y = " + y);

        }
        System.out.println("__________________________________________");
        for (double x=5; x <= 7.001; x+= 0.15)
        {
            double y;
            if (x<6)
            {
                y = x * Math.sqrt(x*x+4);
            }
            else
            {
                y=Math.pow(Math.sin(x+1),3);
            }
            System.out.println("x=" + x + "   y=" + y);
        }
        System.out.println("Task 2 ");
        int counter =0;
        int rows=10;
        int cols = 10;
        int[][] M = new int[rows][cols];
        Random rand =new Random();
        for (int i=0;i<rows;i++)
        {
            for(int j = 0;j<cols ;j++)
            {
                M[i][j]=rand.nextInt(101)-50;
                System.out.print(M[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < rows;i++ )
        {
           if( M[i][i]<0)
               counter +=1;
        }
        System.out.println(counter);
    }
}