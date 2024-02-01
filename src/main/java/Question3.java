import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.HashSet;

/**
 * Jakub Polacek
 * GD2b
 * 1.2.2024
 */

public class Question3
{
    public static void main(String[] args) throws FileNotFoundException
    {
        TreeMap<String, HashSet<Integer>> map = new TreeMap<>();
        int lineNumber = 0;
        String token = "";

        Scanner fileInput = new Scanner(new File("Question1.java"));

        while(fileInput.hasNextLine())
        {
            Scanner in = new Scanner(fileInput.nextLine()).useDelimiter("[^A-Za-z0-9_]+");
            lineNumber++;

            while()
            {

            }



            if(map.containsKey(token))
            {
                map.get(token).add(lineNumber);
            }
            else
            {
                HashSet<Integer> set = new HashSet<>();
                set.add(lineNumber);
            }

        }



    }
}