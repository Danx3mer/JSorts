public class Sorter {
    /**
     * Time /Space Complexity: O(n^2) / O(1)
     * @param elements The array to be sorted.
     */
    static public void bubbleSort(int[] elements) {
        int[] result = elements;
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
    }

    /**
     * Time / Space Complexity: O() / O()
     * @param elements The array to be sorted.
    */
    static public void insertionSort(int[] elements) {  
        for(int iter=1; iter<elements.length; iter++) {
            int toInsert = iter-1;
            int key = elements[iter];

            while(toInsert >= 0 && elements[toInsert] > key) {
                elements[toInsert + 1] = elements[toInsert];
                toInsert--; 
            }
            elements[toInsert + 1] = key;
        }
    } 
    
    /**
     * Time / Space Complexity: O(n^2) / O(1)
     * @param elements The array to be sorted.
    */
    static public void selectionSort(int[] elements) { 
        for(int iterBack = elements.length-1; iterBack >=0; iterBack--) {
            for(int iterFront = 0; iterFront < iterBack; iterFront++) {
                if(elements[iterBack] < elements[iterFront]) {
                    int temp = elements[iterFront];
                    elements[iterFront] = elements[iterBack];
                    elements[iterBack] = temp;
                }
            }
        }
    } 
}

