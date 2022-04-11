// import packages
package src;
import java.util.LinkedList;
import java.util.Queue;

// the Reverse class
public class Reverse {

    public static void main(String[] args)
    {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        // define the array with an array literal
        int[] array1 = new int[]{ 1, 2, 3 };

        // create the two queues
        for (int addInt : array1){
            queue1.add(addInt);
        }

        System.out.println("Here is the starting queue:");
        System.out.println(queue1);

        // merge into a singular queue
        for (int i = 0; i < 3; i++){
            int flipNum = queue1.remove();
            queue2.add(flipNum);
        }
        // print out the merged queue
        System.out.println("\nHere is the flipped queue:");
        System.out.println(queue2 + "\n");
    }
}
