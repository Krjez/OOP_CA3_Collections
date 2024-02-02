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
        Scanner input;
        String command = "";

        System.out.println("*********************************************");
        System.out.println("Welcome to the simulation of Airport Control!");
        System.out.println("*********************************************");
        System.out.println("The list of available commands:");
        System.out.println("- \"takeoff <flightSymbol>\" -> places the flight into queue for take-off (ex. 'takeoff FR526')");
        System.out.println("- \"land <flightSymbol>\" -> places the flight into queue for landing (ex. 'land KC95DF')");
        System.out.println("- \"next\" -> finishes current take-off or landing and prints its symbol");
        System.out.println("- \"quit\" -> ends the simulation");

        while(!command.equals("quit"))
        {
            System.out.println("\nEnter your command:");
            input = new Scanner(System.in);
            command = input.nextLine();

            if(command.equals("next"))
            {
                if(!landingQueue.isEmpty())
                {
                    System.out.println("The flight of number " + landingQueue.remove() + " landed into the airport.");
                }
                else if(!takeOffQueue.isEmpty())
                {
                    System.out.println("The flight of number " + takeOffQueue.remove() + " took off from the airport.");
                }
                else
                {
                    System.out.println("No flight waiting landing or take-off queues.");
                }
            }
            else if(command.matches("land [A-Za-z0-9]+"))
            {
                landingQueue.add(command.substring(5));
            }
            else if(command.matches("takeoff [A-Za-z0-9]+"))
            {
                takeOffQueue.add(command.substring(8));
            }
            else
            {
                System.out.println("Wrong input.");
            }
        }
        System.out.println("Goodbye");
    }
}
