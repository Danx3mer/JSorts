public class Main{
    public static void main() {
        int[] elements = {1, 4, 56, 12, 34, 2, 321, 1111111};

        System.out.println("Hello, World!");
        for(int a: Sorter.bubbleSort(elements)) {
            System.out.println(a);
        }
    }
}