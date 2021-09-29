import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        int my_list[] = {8, 15,  3,  23,  7,  19,  25,  4,  12,  18};

        System.out.print("Unsorted list: ");
        System.out.println(Arrays.toString(my_list)); // before sorting
        System.out.println();
        sort(my_list);
    }

    public static void sort(int my_list[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("1: BubbleSort\n2: SelectionSort\n3: InsertionSort\n4: HeapSort\n5: QuickSort");
        System.out.println("Enter the sorting algorithm you want to use (0 to exit): ");

        int algo = input.nextInt();

        BubbleSort obj1 = new BubbleSort();
        SelectionSort obj2 = new SelectionSort();
        InsertionSort obj3 = new InsertionSort();
        HeapSort obj4 = new HeapSort();
        QuickSort obj5 = new QuickSort();

        switch(algo) {
            case 1: {
                obj1.bubbleSort(my_list);
                break;
            }
            case 2: {
                obj2.selectionSort(my_list);
                break;
            }
            case 3: {
                obj3.insertionSort(my_list);
                break;
            }
            case 4: {
                obj4.heapSort(my_list);
                break;
            }
            case 5: {
                obj5.quickSort(my_list);
                break;
            }
            default :{
                sort(my_list);
            }
        }
    }
}