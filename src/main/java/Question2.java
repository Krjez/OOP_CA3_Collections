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
        int z = 1;

        while(!toBeChecked.isEmpty())
        {
            x = toBeChecked.peek().x;
            y = toBeChecked.peek().y;
            toBeChecked.pop();
            paint[x][y] = z++;

            //North check - if the tile exists AND if its 0, push on stack and mark
            if(y - 1 >= 0 && paint[x][y-1] == 0)
            {
                toBeChecked.push(new Pair(x, y-1));
                paint[x][y-1] = -1;
            }

            //South check - if the tile exists AND if its 0, push on stack and mark
            if(y + 1 < 10 && paint[x][y+1] == 0)
            {
                toBeChecked.push(new Pair(x, y+1));
                paint[x][y+1] = -1;
            }

            //West check - if the tile exists AND if its 0, push on stack and mark
            if(x - 1 >= 0 && paint[x-1][y] == 0)
            {
                toBeChecked.push(new Pair(x-1, y));
                paint[x-1][y] = -1;
            }

            //East check - if the tile exists AND if its 0, push on stack and mark
            if(x + 1 < 10 && paint[x+1][y] == 0)
            {
                toBeChecked.push(new Pair(x+1, y));
                paint[x+1][y] = -1;
            }

        }

        displayPaint(paint);
    }

    public static void displayPaint(int[][] paint)
    {
        for(int i = 0; i < 10 ;i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print(paint[j][i] + "\t");
            }
            System.out.println();
        }
    }
}