package melmezayen;

/**
 * Utility class that contains generic helper methods.
 */
public class GenericUtils {

    /**
     * Reverses the order of elements inside the array.
     * The operation happens in-place, meaning no new
     * array is created.
     *
     * @param array the array that should be reversed
     * @param <T> generic type of the array
     */
    public static <T> void reverse(T[] array) {

        int start = 0;
        int end = array.length - 1;

        while (start < end) {

            // swap the two elements
            T temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    /**
     * Calculates the sum of all values in the array.
     *
     * @param array array containing numbers
     * @param <T> type that extends Number
     * @return sum of all values as double
     */
    public static <T extends Number> double sum(T[] array) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }

        return sum;
    }
}