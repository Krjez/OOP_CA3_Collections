import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Deque;

/**
 * Jakub Polacek
 * GD2b
 * 26.1.2024
 */
public class Question2
{
    public static void main(String[] args)
    {
        //Initializing
        int[][] paint = new int[10][10];
        ArrayDeque<Pair> toBeChecked = new ArrayDeque<>();
        Scanner input = new Scanner(System.in);

        //User input
        System.out.println("Type in starting x: ");
        int x = input.nextInt();
        System.out.println("Type in starting y: ");
        int y = input.nextInt();
        toBeChecked.push(new Pair(x, y));






        displayPaint(paint);


    }

    public static void displayPaint(int[][] paint)
    {
        for(int i = 0; i < 10 ;i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print(paint[i][j] + " ");
            }
            System.out.println();
        }
    }
}