
import java.util.Scanner;
import java.util.Stack;

/**
 * Jakub Polacek
 * GD2b
 * 11.2.2024
 */

public class Question8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Stack<Double> numbers = new Stack<>();
        Stack<String> operators = new Stack<>();

        System.out.println("Please separate your input numbers and operators by either space or enter.");
        System.out.println("Write in your equation to be evaluated:");
        String equation = input.next();

        while(!equation.equals("quit"))
        {
            //input = new Scanner(System.in);
            equation = input.next();

            if(equation.equals("+"))
            {

            }
            else if(equation.equals("-"))
        }
    }
    public void evaluateTheTop(Stack<Double> numbers, Stack<String> operators)
    {
        numbers.pop();
    }

}