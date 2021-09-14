public class HeapSort {
    /**
     * Heap Sort works by building a max heap. 
     * At this point the largest value is at the top of the list.
     * The list is sorted by swapping first and the last value and building the max heap excluding the ones sorted.
     * Worst case: O(nlogn)
     */
    public void heapSort(int my_list[]) {
        int n = my_list.length;
        for (int i = (n/2)-1; i >= 0; i--) { // Final parent in a binary heap is located at (n/2)-1
            heapify(my_list, n, i); // This will bring the largest value in the whole list to the front
        }

        for (int i = n-1; i > 0; i--) { // One by one to the back of the list
            int temp = my_list[0];
            my_list[0] = my_list[i]; // The biggest value would be at the front, so we swap it
            my_list[i] = temp;
            heapify(my_list, i, 0); // We heapify the list excluding the value we swapped, moving the next biggest value to index 0 by heapifying
        }
    }

    private void heapify(int my_list[], int n, int i) { // n is the size of the heap and i is the root
        int biggest = i; // this is gonna be the root
        int left = 2*i + 1; // left of it
        int right = 2*i + 2; // right

        if (left < n && my_list[biggest] < my_list[left]) { // Checking if there is a left one and if it's greater   
            biggest = left; // biggest is now the left one
        } 

        if (right < n && my_list[biggest] < my_list[right]) { // Checking if there is a right one and if it's greater   
            biggest = right; // biggest is now the right one
        } 

        if (biggest != i) { // if the biggest value changed from i
            int temp = my_list[biggest];
            my_list[biggest] = my_list[i]; // swap
            my_list[i] = temp;
            System.out.print(my_list[i]);
            System.out.print(" <=> "); // Just to show the comparisons
            System.out.print(my_list[biggest]);
            System.out.println();
            heapify(my_list, n, biggest); // recall it with the biggest value
        }
    }
}
