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

        System.out.println("Please separate your input numbers and operators by either space or new lines(enter).");
        System.out.println("Use keyword 'end' to evaluate");
        System.out.println("Start writing in your equation to be evaluated:");
        String equation = input.next();

        while(!equation.equals("end"))
        {
            //input = new Scanner(System.in);
            equation = input.next();

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
                while(operators.peek().equals("*") || operators.peek().equals("/"))
                {
                    evaluateTheTop(numbers, operators);
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
            else
            {
                System.out.println("Wrong input");
            }
        }
        while(!operators.isEmpty())
        {
            evaluateTheTop(numbers, operators);
        }
        System.out.println();
        System.out.println();
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
            numbers.push(numbers.pop() - numbers.pop());
        }
        else if(op.equals("*"))
        {
            numbers.push(numbers.pop() * numbers.pop());
        }
        else if(op.equals("/"))
        {
            numbers.push(numbers.pop() / numbers.pop());
        }
    }
}