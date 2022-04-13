package Sorts;

import java.util.Random;

class BubbleSort
{
  private static int comparisons;
  private static int swaps; 

    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                  comparisons++;
                  swaps++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    // Prints the array 
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
     
    // Driver method to test above
	public static void main(String args[])
	{
    
    System.out.println("\nBUBBLE SORT: ");
    
    long startTime = System.nanoTime();
    int[] arr = new int[5000];
    for (int i = 0; i < 5000; i++) { 
      Random rand = new Random(); //instance of random class
      int randNum = rand.nextInt(100);
      arr[i] = randNum;  
    }

    // merge sort the array
		BubbleSort ob = new BubbleSort();
		ob.bubbleSort(arr);
    
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println("Bubble Sort Duration: " + duration + " nanoseconds");
		System.out.println("Low = " + arr[0]);
    System.out.println("High = " + arr[arr.length-1]);
    System.out.println("Swaps = " + swaps);
    System.out.println("Comparisons = " + comparisons);

    }
}
