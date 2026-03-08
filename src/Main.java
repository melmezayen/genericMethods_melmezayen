public class Main {

    public static void main(String[] args) {

        // -------- REVERSE TEST WITH TEXT --------
        System.out.println("REVERSE TEST (String)");

        String[] words = {"Apple", "Banana", "Orange", "Mango"};

        System.out.println("Before reverse:");
        printArray(words);

        GenericUtils.reverse(words);

        System.out.println("After reverse:");
        printArray(words);



        // -------- REVERSE TEST WITH NUMBERS --------
        System.out.println("\nREVERSE TEST (Integer)");

        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Before reverse:");
        printArray(numbers);

        GenericUtils.reverse(numbers);

        System.out.println("After reverse:");
        printArray(numbers);



        // -------- SUM TEST --------
        System.out.println("\nSUM TEST");

        Integer[] values = {10, 20, 30, 40};

        double result = GenericUtils.sum(values);

        System.out.println("The Array (values):");
        printArray(values);

        System.out.println("Sum of values: " + result);



        // -------- SUM TEST WITH DOUBLE --------
        Double[] decimalValues = {1.5, 2.5, 3.0};

        double result2 = GenericUtils.sum(decimalValues);

        System.out.println("\nThe Array (decimal values):");
        printArray(decimalValues);

        System.out.println("Sum of decimal values: " + result2);
    }


    /**
     * Helper method to print arrays.
     */
    public static <T> void printArray(T[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}