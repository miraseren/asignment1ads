/**
 * Reverses the elements of an array.
 *
 * @param array the array to be reversed
 */
public class ReverseArray {

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {// swap elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // move start index forward and end index backward
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 6, 2};
        reverseArray(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}