// import packages
package src;
import java.util.LinkedList;
import java.util.Queue;

// the orderedQueues class
public class Combine {

    public static void main(String[] args)
    {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        Queue<Integer> merged = new LinkedList<>();

        // define the array with an array literal
        int[] array1 = new int[]{ 3, 7, 10, 12 };
        int[] array2 = new int[]{ 4, 8, 11, 52 };

        // create the two queues
        for (int addInt : array1){
            queue1.add(addInt);
        }
        for (int addInt : array2){
            queue2.add(addInt);
        }

        System.out.println("Here are the starting queues:");
        System.out.println(queue1);
        System.out.println(queue2);

        // merge into a singular queue
        for (int i = 0; i < 4; i++){
            int num1 = queue1.remove();
            int num2 = queue2.remove();
            if (num1 > num2){
                merged.add(num2);
                merged.add(num1);
            }
            else {
                merged.add(num1);
                merged.add(num2);
            }
        }

        // print out the merged queue
        System.out.println("\nHere is the merged queue:");
        System.out.println(merged + "\n");
    }
}
