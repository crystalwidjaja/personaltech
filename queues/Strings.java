// Week 1, Challange 1: Add and remove elements from a queue

// import packages
package src;
import java.util.LinkedList;
import java.util.Queue;

// the snakes class
public class Strings {

    public static void main(String[] args)
    {
        Queue<String> q = new LinkedList<>();

        // define the array with an array literal
        String[] stringArray = new String[]{ "seven", "slimy", "snakes", "sallying", "slowly", "slithered", "southward" };

        // push to the queue
        for (String addWord : stringArray){
            q.add(addWord);
            System.out.println("Enqueued data: " + addWord);
            System.out.println("Words count: " + q.size() + ", data: " + q);
        }

        // pop from the queue
        for (int i = 0; i < 7; i++){
            String removeWord = q.remove();
            System.out.println("Dequeued data: " + removeWord);
            System.out.println("Words count: " + q.size() + ", data: " + q);
        }
    }
}
