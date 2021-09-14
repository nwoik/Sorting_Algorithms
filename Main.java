public class Main {

    public static void main(final String[] args) {
        int my_list[] = {8, 15,  3,  23,  7,  19,  25,  4,  12,  18};
        BubbleSort obj1 = new BubbleSort();
        SelectionSort obj2 = new SelectionSort();
        InsertionSort obj3 = new InsertionSort();
        HeapSort obj4 = new HeapSort();

        PrintArray pa = new PrintArray();
        System.out.print("Unsorted list: ");

        pa.printArray(my_list); // before sorting
        System.out.println();

        obj4.heapSort(my_list);
        pa.printArray(my_list); // after sorting

        
    }
}