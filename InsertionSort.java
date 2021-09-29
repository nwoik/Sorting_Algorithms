import java.util.Arrays;

public class InsertionSort {
    /**
     * Insertion sort works by comparing values in turn.
     * Starting on the second one, it swaps with the left value if it is greater than itself 
     * Worst case: O(n^2)
     */
    public void insertionSort(int my_list[]) {
        System.out.println("Insertionsort: ");
        int n = my_list.length;
        if (n == 1) { // If there's only 1 thing in the list, there's nothing to sort
            return ;
        };
        for (int i = 1; i < n; i++) { // Loops through the whole list
            int current = my_list[i]; // Define the current value to be inserted
            int position = i; 
            while (position > 0 && my_list[position-1] > current) { // as long as it isn't the 1st position and the current item is less than the one being compared
                my_list[position] = my_list[position-1]; // Make the position equal to the one behind it
                System.out.print(my_list[position]);
                System.out.print(" <=> "); // Just to show the comparisons
                System.out.print(current);
                System.out.println();
                position -= 1; // Move to the one behind it
            };
            my_list[position] = current; // this is where u insert the value
        };
        System.out.println(Arrays.toString(my_list));
    };
}
