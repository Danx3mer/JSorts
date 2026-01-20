public class Sorter {
    /**
     * Time /Space Complexity: O(n^2) / O(1)
     * @param elements The array ofelements to be sorted.
     * @return The sorted array of elements
     */
    static public int[] bubbleSort(int[] elements) {
        int[] result = elements.clone();
        boolean swapped = false;
        int passes = 0;

        do {
            swapped = false;
            for(int iter=0; iter<elements.length-passes-1; iter++) {
                if(result[iter] > result[iter+1]) {
                    int temp = result[iter];
                    result[iter] = result[iter+1];
                    result[iter+1] = temp;
                    swapped = true;
                }
            }

        } while(swapped && passes <= elements.length - 1);
        return result;
    }
}
