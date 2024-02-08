import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Jakub Polacek
 * GD2b
 * 8.2.2024
 */

public class Question7
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

            switch (command)
            {
                case "buy" ->
                {
                    int quantity = input.nextInt();
                    double price = input.nextDouble();
                    stocks.add(new Block(quantity, price));
                }
                case "sell" ->
                {
                    int quantity = input.nextInt();
                    double price = input.nextDouble();
                    double profit = 0;
                    while(quantity > 0)
                    {
                        if(stocks.isEmpty())
                        {
                            System.out.println("Not enough stock to sell all. Sold all available.");
                            quantity = 0;
                        }
                        else if(quantity > stocks.peek().quantity)
                        {
                            profit += stocks.peek().quantity * (price - stocks.peek().price);
                            quantity -= stocks.peek().quantity;
                            stocks.remove();
                        }
                        else
                        {
                            profit += quantity * (price - stocks.peek().price);
                            stocks.peek().quantity -= quantity;
                            quantity = 0;
                        }
                    }
                    System.out.println("The total profit from this transaction was: " + profit);
                }
                case "quit" -> System.out.println("Goodbye");
                default -> System.out.println("Invalid input, try again.");
            }
        }
    }
}