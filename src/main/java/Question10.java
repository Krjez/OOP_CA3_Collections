import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.PriorityQueue;

/**
 * Jakub Polacek
 * GD2b
 * 11.2.2024
 */

public class Question10
{
    public static void main(String[] args) throws FileNotFoundException
    {
        HashMap<String,TreeSet<DistanceTo>> connections = new HashMap<>();
        HashMap<String,Integer> shortestKnownDistance = new HashMap<>();

        PriorityQueue<DistanceTo> distances = new PriorityQueue<>();
        distances.add(new DistanceTo("Pendleton",0));

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
            if(!connections.containsKey(city2))
            {
                connections.put(city2,new TreeSet<>());
            }
            else
            {
                connections.get(city2).add(new DistanceTo(city1,distance));
            }

        }
        //Comments from the question assignment
        while(!distances.isEmpty()) //While the priority queue is not empty
        {
            DistanceTo city = distances.poll(); //Get its smallest element.
            if(!shortestKnownDistance.containsKey(city.getTarget())) //If its target is not a key in shortestKnownDistance
            {
                int cityDistance = city.getDistance(); //Let d be the distance to that target
                shortestKnownDistance.put(city.getTarget(), cityDistance); //Put (target, d) into shortestKnownDistance.

                TreeSet<DistanceTo> direct = connections.getOrDefault(city.getTarget(), new TreeSet<>());
                for(DistanceTo c : direct) // For all cities c that have a direct connection from target
                {
                    //Add DistanceTo(c, d + distance from target to c) to the priority queue.
                    distances.add(new DistanceTo(c.getTarget(),c.getDistance()+cityDistance));
                }
            }
        }

        for(HashMap.Entry<String,Integer> dis : shortestKnownDistance.entrySet())
        {
            System.out.printf("\nDistance from Pendleton to %s is %s.", dis.getKey(), dis.getValue());
        }
    }
}
