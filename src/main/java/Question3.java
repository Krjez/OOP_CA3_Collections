import java.io.File;
import java.io.FileReader;
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
    public static void main(String[] args)
    {
        TreeMap<String, HashSet<Integer>> map = new TreeMap<>();
        int lineNumber = 0;
        String token = "";

        FileReader fileReader = new FileReader(new File("Question1.java"));
        Scanner in = new Scanner(fileReader).useDelimiter("[^A-Za-z0-9_]+");


        while()
        {
            lineNumber++;
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