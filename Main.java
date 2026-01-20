import java.util.Arrays;

public class Main{
        public static void main(String[] args) {
        int sizeOf = Integer.parseInt(args[0]);

        int[] elements = randArr(sizeOf);

        int[] actual = elements.clone();
        Arrays.sort(actual);

        switch(args[1].toLowerCase()) {
            case "bubble": {
                Sorter.bubbleSort(elements);
            }
            break;
            case "insertion": {
                Sorter.insertionSort(elements);
            }   
            break;
            case "selection": {
                Sorter.selectionSort(elements);
            }
            break; 
            default:
                System.out.println("Please enter a valid sort type! Either bubble, insertion, or selection!");
        }

        System.out.println(Arrays.equals(elements, actual));       
    }

    public static int[] randArr(int size) {
        int[] arr = new int[size];

        for(int iter=0; iter<size; iter++) {
            arr[iter] = (int) (Math.random() * 1000000000);
        }

        return arr;
    }
}