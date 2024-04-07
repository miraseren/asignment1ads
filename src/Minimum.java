public class Minimum {

    public static int FindMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7};
        int minimum = FindMinimum(numbers);
        System.out.println( minimum);
    }
}