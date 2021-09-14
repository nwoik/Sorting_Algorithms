public class BubbleSort {
    /**
     * Bubble sort works by comparing 2 elements and swapping them if they're in the wrong order.
     * What inevitably happens is that all the largest values gets moved to back of the list.
     * Worst case: O(n^2)
     */
    public void bubbleSort(int my_list[]) {
        System.out.println("Bubblesort: ");
        int n = my_list.length;
        if (n == 1) { // If there's only 1 thing in the list, there's nothing to sort
            return ;
        };
    
        for (int i = 0; i < n; i++) { // Moves 1 by 1 through the list
            for (int j = 1; j <= n-1; j++) { // Moves through the list excluding the ones sorted
                if (my_list[j-1] > my_list[j]) { // If the one before it is greater then swap em
                    System.out.print(my_list[j-1]);
                    System.out.print(" | "); // Just to show the comparisons
                    System.out.print(my_list[j]);
                    System.out.println();
                    int temp = my_list[j]; // storing the number in a temporary variable
                    my_list[j] = my_list[j-1]; // swap
                    my_list[j-1] = temp;
                };
            };
        };
    };
};