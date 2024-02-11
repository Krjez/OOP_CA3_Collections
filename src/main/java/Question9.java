import java.util.Scanner;
import java.util.Stack;

/**
 * Jakub Polacek
 * GD2b
 * 11.2.2024
 */

public class Question9
{
    public static void main(String[] args)
    {
        Stack<Path> paths = new Stack<>();
        paths.push(new Path(5,5,"N"));
        paths.push(new Path(5,5,"S"));
        paths.push(new Path(5,5,"E"));
        paths.push(new Path(5,5,"W"));


        boolean go = true;

        while(!paths.isEmpty())
        {
            int x = paths.peek().posX;
            int y = paths.peek().posY;
            String direction = paths.peek().direction;
            paths.pop();

            while(go)
            {
                if(direction.equals("N"))
                {
                    y--;
                }
                else if(direction.equals("S"))
                {
                    y++;
                }
                else if(direction.equals("E"))
                {
                    x++;
                }
                else if(direction.equals("W"))
                {
                    x--;
                }

                //simulates exit
                if(x == 3 && y == 2)
                {
                    System.out.println("Found exit.");
                }
            }

        }
    }
}

