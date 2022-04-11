package src;

import java.util.Random;

class SelectionSort
{
  private static int comparisons;
  private static int swaps; 
    void sort(int arr[])
    {
        int n = arr.length;
  
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            comparisons++;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
  
            // Swap time
                swaps++;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
  
    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

	public static void main(String args[])
	{
     System.out.println("\nSELECTION SORT: ");
    long startTime = System.nanoTime();
    int[] arr = new int[5000];
    for (int i = 0; i < 5000; i++) { 
      Random rand = new Random(); //instance of random class
      int randNum = rand.nextInt(100);
      arr[i] = randNum;  
    }

    // merge sort the array
		SelectionSort ob = new SelectionSort();
		ob.sort(arr);

    // Figure out start and end times and print average
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println("Selection Sort Duration: " + duration + " nanoseconds");
    
		System.out.println("Low = " + arr[0]);
    System.out.println("High = " + arr[arr.length-1]);
    System.out.println("Swaps = " + swaps);
    System.out.println("Comparisons = " + comparisons);

    }
}
