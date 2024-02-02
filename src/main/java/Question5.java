import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 * Jakub Polacek
 * GD2b
 * 2.2.2024
 */
public class Question5
{
    public static void main(String[] args)
    {
        Queue<String> takeOffQueue = new LinkedList<>();
        Queue<String> landingQueue = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        String command = input.next();

        while(!command.equals("quit"))
        {
            if(command.equals("next"))
            {
                //TODO loads
            }
            else if(command.equals("landing"))
            {
                System.out.println("Enter the symbol of the landing flight:");
                input = new Scanner(System.in);
                command = input.next();
            }
            else if(command.equals("takeoff"))
            {
                System.out.println("Enter the symbol of the flight to take off:");
                input = new Scanner(System.in);
                command = input.next();
            }

            

            input = new Scanner(System.in);
            command = input.next();
        }

    }
}
