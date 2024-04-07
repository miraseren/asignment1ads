public class Minimum {

    public static int FindMinimum(int[] arr) {
        int min = Integer.MAX_VALUE; // Initialize min with a very large value

        for (int num : arr) {
            if (num < min) { // if some number < than min then the min = num
                min = num;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7}; // creating an array of numbers
        int minimum = FindMinimum(numbers);
        System.out.println(minimum);
    }
}