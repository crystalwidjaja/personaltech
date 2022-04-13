# Bubble Sort
The bubble sort compares the first two elements in an array and changes the order as needed. This process is repeated for all the elements.

![image](https://user-images.githubusercontent.com/72881876/162247024-6461c8c9-fe75-4cc6-850e-48815f830e85.png)

# Insertion Sort
The insertion sort starts by comparing the two elements and swapping if necessary. From there, the sort looks at the next element in the array and compares it to the current sorted array. This step is repeated till the entire array is finished.

![image](https://user-images.githubusercontent.com/72881876/162900960-f66db7d8-ee85-4356-99f0-1ceb389ecb6d.png)

# Merge Sort
The merge sort separates the array into two halves and then sorts through each half by splitting the arrays into pairs and sorting through that. At the end, all pairs are combined together, and then the original halves are put back together.

![image](https://user-images.githubusercontent.com/72881876/162901021-96c7ece7-daad-4617-bdf2-6aae737d9b39.png)

# Selection Sort
The sort essentially scans to find the smallest element in the array and places it in the front. This procedure is repeated with each of the elements in the array until it is sorted.

![image](https://user-images.githubusercontent.com/72881876/162901423-4cd777d5-ff19-458d-a126-3724e5337590.png)

# Big O Notation
Big O notation essentially refers to the time it takes an algorithm to sort through an array. Often, this is expressed through a graph where different equations are used to express different algorithms. 

![image](https://user-images.githubusercontent.com/72881876/162902223-0556443b-e343-4634-b15a-d7aee6e57211.png)

In the case of the sorts we focused on, the general formula for each sort can be found in the table below:

| Sort Type | Equation |
| --------------- | --------------- |
| Bubble Sort | O(n2) |
| Insertion Sort | O(n) |
| Merge Sort | O(nlogn) |
| Selection Sort | O(n^2) |

Our results from the [code](https://replit.com/@CrystalWidjaja/Sorts#src/MergeSort.java) I constructed indicate that the insertion sort is the fastest and selection sort is the slowest. Merge sort and Bubble sort are relatively the same with merge being a tad faster. This aligns with the equations used to describe each of the sorts.

Specific Data From Code is Provided Here:

![image](https://user-images.githubusercontent.com/72881876/163118215-f1fadd28-1926-4230-afe0-b7e1031d452b.png)

![image](https://user-images.githubusercontent.com/72881876/163118284-326df0be-2f90-48e6-af8c-d4ddf82d394a.png)
