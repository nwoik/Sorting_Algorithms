public class PrintArray {
    /**
     * 
     * Simply prints the list in a visually appealing way
     */
    public void printArray(int my_list[]) {
        System.out.print("[");
        for (int i = 0; i < my_list.length; i++) {
            System.out.print(my_list[i]);
            if (i != my_list.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}