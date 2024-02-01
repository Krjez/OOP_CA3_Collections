import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;


/**
 * Jakub Polacek
 * GD2b
 * 1.2.2024
 */

public class Question4
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Stack<String> tags = new Stack<>();
        String tag;
        Scanner input = new Scanner(new File("HTML tags"));

        while(input.hasNext())
        {
            tag = input.next();
            if(tag.charAt(1) != '/')
            {
                tags.push(tag.substring(1,tag.length()-1));
                System.out.println(tag);
            }
            else
            {
                if(tags.peek().equals(tag.substring(2,tag.length()-1)))
                {
                    tags.pop();
                }
                else
                {
                    System.out.println("ERROR ERROR ERROR");
                }
            }
        }

    }
}
