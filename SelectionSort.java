public class SelectionSort {
    /**
     * Selection sort works by taking a current value and searches the list for the lowest value then swaps their positions
     * Worst case: O(n^2)
     */
    public void selectionSort(int my_list[]) {
        System.out.println("Selectionsort: ");
        int n = my_list.length;
        if (n == 1) { // If there's only 1 thing in the list, there's nothing to sort
            return ;
        };
        for (int i = 0; i < n-1; i++) { // Moves 1 by 1 through the list
            int low = i;
            for (int j = i+1; j < n; j++) { // This loop is for finding the lowest value
                if (my_list[j] < my_list[low]) // If the current node is less than the value
                    low = j; // Then it's the new min value 
            };
            if (my_list[i] > my_list[low]) {
                int temp = my_list[i]; // storing the number in a temporary variable
                my_list[i] = my_list[low];
                my_list[low] = temp;
                System.out.print(my_list[i]);
                System.out.print(" <=> "); // Just to show the comparisons
                System.out.print(my_list[low]);
                System.out.println();
            };        
        };
    }
}
