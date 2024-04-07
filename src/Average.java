/**
 * Calculates the average of an array of integers.
 *
 * @param array the array of integers
 * @return the average value of the elements in the array
 */
public class Average{

    public static double calculateAverage(int[] array) {
        int sum = 0; // initializing sum

        for (int num : array) {
            sum += num; // add each number to sum
        }

        return (double) sum / array.length;  // here we caclulate and return the average
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7};  // creating an array of numbers
        double average = calculateAverage(numbers);
        System.out.println(average);
    }
}