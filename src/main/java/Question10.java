import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * Jakub Polacek
 * GD2b
 * 11.2.2024
 */

public class Question10
{
    public static void main(String[] args) throws FileNotFoundException
    {
        HashMap<String, TreeSet<DistanceTo>> connections = new HashMap<>();
        Scanner input = new Scanner(new File("Cities Connections"));

        while(input.hasNext())
        {
            String city1 = input.next();
            String city2 = input.next();
            int distance = input.nextInt();

            if(!connections.containsKey(city1))
            {
                connections.put(city1,new TreeSet<>());
            }
            else
            {
                connections.get(city1).add(new DistanceTo(city2,distance));
            }
        }


        
    }
}
