import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class CombinedArrayOperations {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        numbers[2] = 99;
        System.out.println("Updated Array: " + Arrays.toString(numbers));

        double[] grades = {85.5, 90.0, 78.5, 92.0, 88.0};
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.length;
        System.out.println("Average Grade: " + average);

        int[] values = {45, 12, 89, 23, 67};
        int max = values[0];
        int min = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);

        int[] original = {1, 2, 3, 4, 5};
        int[] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        System.out.println("Reversed Array: " + Arrays.toString(reversed));

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        int[] merged = new int[array1.length + array2.length];
        int index = 0;
        for (int num : array1) {
            merged[index++] = num;
        }
        for (int num : array2) {
            merged[index++] = num;
        }
        Arrays.sort(merged);
        System.out.println("Merged Array: " + Arrays.toString(merged));

        int[] duplicates = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : duplicates) {
            uniqueSet.add(num);
        }
        int[] uniqueArray = new int[uniqueSet.size()];
        index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index++] = num;
        }
        System.out.println("Array with Duplicates Removed: " + Arrays.toString(uniqueArray));
    }
}