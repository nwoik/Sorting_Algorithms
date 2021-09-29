import java.util.Random;
import java.util.Arrays;

public class QuickSort {
    public void quickSort(int[] my_list) {
        System.out.println("Quick sort: ");
        quickSort(my_list, 0, my_list.length-1);
        System.out.println(Arrays.toString(my_list));
    }

    private void quickSort(int[] my_list, int low, int high) {
        if (low < high+1) {
            int p = partition(my_list, low, high);
            quickSort(my_list, low, p-1);
            quickSort(my_list, p+1, high);
        }
    }

    private int pivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high-low)+1);
    }

    private int partition(int[] my_list, int low, int high) {
        swap(my_list, low, pivot(low, high));
        int border = low + 1;
        for (int i = border; i <= high; i++) {
            if (my_list[i] < my_list[low]) {
                swap(my_list, i, border++);
            }
        }

        swap(my_list, low, border-1);
        return border-1;
    }

    private void swap(int[] my_list, int index1, int index2) {
        int temp = my_list[index1];
        my_list[index1] = my_list[index2];
        my_list[index2] = temp;
    }
}