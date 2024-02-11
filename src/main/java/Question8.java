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

        System.out.println("\nPlease separate your input numbers, operators and brackets by new lines(enter).");
        System.out.println("Use keyword 'e' or 'E' to evaluate and end");
        System.out.println("Start writing in your equation to be evaluated:");
        String equation = "";

        while(!equation.equalsIgnoreCase("e"))
        {
            equation = input.nextLine();

            if(equation.matches("[0-9]+\\.*[0-9]*"))
            {
                numbers.push(Double.parseDouble(equation));
            }
            else if(equation.equals("("))
            {
                operators.push("(");
            }
            else if(equation.equals("+") || equation.equals("-"))
            {
                if(!operators.isEmpty())
                {
                    while(operators.peek().equals("*") || operators.peek().equals("/"))
                    {
                        evaluateTheTop(numbers, operators);
                        if(operators.isEmpty())
                        {
                            break;
                        }
                    }
                }
                operators.push(equation);
            }
            else if(equation.equals("*") || equation.equals("/"))
            {
                operators.push(equation);
            }
            else if(equation.equals(")"))
            {
                while(!operators.peek().equals("("))
                {
                    evaluateTheTop(numbers, operators);
                }
                operators.pop();
            }
            else if(!equation.equalsIgnoreCase("e"))
            {
                System.out.println("Wrong input");
            }
        }

        while(!operators.isEmpty())
        {
            evaluateTheTop(numbers, operators);
        }
        System.out.println("The result of the equation is:");
        System.out.println(numbers.pop());
    }
    public static void evaluateTheTop(Stack<Double> numbers, Stack<String> operators)
    {
        String op = operators.pop();
        if(op.equals("+"))
        {
            numbers.push(numbers.pop() + numbers.pop());
        }
        else if(op.equals("-"))
        {
            double num = numbers.pop();
            numbers.push(numbers.pop() - num);
        }
        else if(op.equals("*"))
        {
            numbers.push(numbers.pop() * numbers.pop());
        }
        else if(op.equals("/"))
        {
            double num = numbers.pop();
            numbers.push(numbers.pop() / num);
        }
    }
}