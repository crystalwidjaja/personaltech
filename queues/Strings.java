package queues;
import java.util.LinkedList;
import java.util.Queue;

// Organizing Strings
public class Strings {

	public static void main(String[] args)
	{
		Queue<String> q = new LinkedList<>();

		// define array
    String[] stringArray = new String[]{ "seven", "slimy", "snakes", "sallying", "slowly", "slithered", "southward" }; 

    // push queue
    for (String addWord : stringArray){
      q.add(addWord);
      System.out.println("Enqueued data: " + addWord);
      System.out.println("Words count: " + q.size() + ", data: " + q);
    }

		// pop queue
    for (int i = 0; i < 7; i++){
      String removeWord = q.remove();
      System.out.println("Dequeued data: " + removeWord);
      System.out.println("Words count: " + q.size() + ", data: " + q);
    }
	}
}
