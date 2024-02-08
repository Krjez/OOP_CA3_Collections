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

            switch (command) {
                case "buy" -> {
                    int quantity = input.nextInt();
                    double price = input.nextDouble();
                    stocks.add(new Block(quantity, price));
                }
                case "sell" -> {
                    int quantity = input.nextInt();
                    double price = input.nextDouble();

                }
                case "quit" -> System.out.println("Goodbye");
                default -> System.out.println("Invalid input, try again.");
            }

        }
    }
}
