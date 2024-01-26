import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Deque;

/**
 * Jakub Polacek
 * GD2b
 * 25.1.2024
 */
public class Question1
{
    public static void main(String[] args)
    {
        Deque<Integer> driveway = new ArrayDeque<>();
        Deque<Integer> street = new ArrayDeque<>();
        Scanner input;
        boolean run = true;

        while(run)
        {
            System.out.println("\nInput the car number plate (positive to add, negative to remove, 0 to end):");
            input = new Scanner(System.in);
            int car = input.nextInt();

            //Positive -> Car added into the stack
            if(car > 0)
            {
                driveway.push(car);
                displayCars(driveway, street);
            }

            //Negative -> Looking for a car to remove
            else if(car < 0)
            {
                while(!driveway.isEmpty())
                {
                    if(driveway.peek() == -car)
                    {
                        System.out.println("Removed car " + driveway.pop() + ".");
                        break;
                    }
                    else
                    {
                        street.push(driveway.pop());
                        System.out.println("Pushed car " + street.peek() + " to street.");
                    }
                    displayCars(driveway, street);
                }
                while(!street.isEmpty())
                {
                    System.out.println("Put car "+ street.peek() + " back into driveway");
                    driveway.push(street.pop());
                    displayCars(driveway, street);
                }
            }

            //0 -> End of the program
            else
            {
                System.out.println("Ending the simulation.");
                run = false;
            }
        }
    }

    public static void displayCars(Deque<Integer> driveway, Deque<Integer> street)
    {
        System.out.println("Cars in the driveway and street stack:");
        System.out.println(driveway.toString());
        System.out.println(street.toString());
    }
}
