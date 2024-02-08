import java.util.LinkedList;
import java.util.TreeMap;
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
        TreeMap<String,Queue<Block>> symbolsMap = new TreeMap<>();
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
                    String symbol = input.next();
                    int quantity = input.nextInt();
                    double price = input.nextDouble();
                    if(symbolsMap.containsKey(symbol))
                    {
                        symbolsMap.get(symbol).add(new Block(quantity, price));
                    }
                    else
                    {
                        symbolsMap.put(symbol, new LinkedList<>());
                        symbolsMap.get(symbol).add(new Block(quantity, price));
                    }
                }
                case "sell" ->
                {
                    String symbol = input.next();
                    int quantity = input.nextInt();
                    double price = input.nextDouble();
                    double profit = 0;
                    while(quantity > 0)
                    {
                        if(symbolsMap.get(symbol).isEmpty())
                        {
                            System.out.println("Not enough stock here to sell all. Sold all available.");
                            quantity = 0;
                        }
                        else if(quantity > symbolsMap.get(symbol).peek().quantity)
                        {
                            profit += symbolsMap.get(symbol).peek().quantity * (price - symbolsMap.get(symbol).peek().price);
                            quantity -= symbolsMap.get(symbol).peek().quantity;
                            symbolsMap.get(symbol).remove();
                        }
                        else
                        {
                            profit += quantity * (price - symbolsMap.get(symbol).peek().price);
                            symbolsMap.get(symbol).peek().quantity -= quantity;
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