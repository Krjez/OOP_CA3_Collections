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
        String command = "";

        while(!command.equals("quit"))
        {
            System.out.println("Enter your command:");
            input = new Scanner(System.in);
            command = input.nextLine();

            if(command.equals("next"))
            {
                //TODO loads
            }
            else if(command.matches("land [A-Za-z0-9]+"))
            {
                landingQueue.add(command.substring(5));
            }
            else if(command.matches("takeoff [A-Za-z0-9]+"))
            {
                takeOffQueue.add(command.substring(8));
            }

            System.out.println(landingQueue.peek());
            System.out.println(takeOffQueue.peek());

        }
        System.out.println("Goodbye");
    }
}
