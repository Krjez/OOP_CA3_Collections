import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question6
{
    public static void main(String[] args)
    {
        Queue<Block> stocks = new LinkedList<>();

        Scanner input;
        String command = "";

        while(!command.equals("quit"))
        {
            System.out.println("Enter the command:");
            input = new Scanner(System.in);
            command = input.next();
            
            if(command.matches("buy [0-9]+ [0-9]*\\.[0-9]+"))
            {
                String[] commandArr = command.split("\\s+");
                stocks.add(new Block(Integer.parseInt(commandArr[1]),Double.parseDouble(commandArr[2])));

            }
            else if(command.matches("sell [0-9]+ [0-9]*\\.[0-9]+"))
            {
                String[] commandArr = command.split("\\s+");

            }
            else if(command.equals("quit"))
            {
                System.out.println("Goodbye");
            }
            else
            {
                System.out.println("Invalid input, try again.");
            }

        }
    }
}
