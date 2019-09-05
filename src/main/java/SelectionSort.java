/**
 * SelectionSort is a recursive way of finding minimum and sorting array.
 */

public class SelectionSort {
    public static int iteration = 0;
    public static void main(String[] args) {
        int array[] = {3,4,1,0};
        int startIndex = 0;
        findMinimum( startIndex , array);

        for (int i : array) {
            System.out.println(i);
        }
    }

    private static int[] findMinimum(int startIndex, int[] array) {

        if(startIndex == array.length-1) {
            return array;
        }
        int min = 0;
        int indexOfMin = 0;

        for (int i = startIndex; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                min = array[i];
                indexOfMin = i;

            } else {
                min = array[i + 1];
                indexOfMin = i +1;

            }
        }
        int swap = array[startIndex];
        array[startIndex] = min;
        array[indexOfMin] = swap;
        return findMinimum(++startIndex, array);
    }

}
