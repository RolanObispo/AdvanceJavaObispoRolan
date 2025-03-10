import java.util.Arrays;
import java.util.Scanner;

public class CombinedSortingSearching {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] bubbleSortedArr = Arrays.copyOf(arr, arr.length); // Create a copy for bubble sort
        for (int i = 0; i < bubbleSortedArr.length - 1; i++) {
            for (int j = 0; j < bubbleSortedArr.length - 1 - i; j++) {
                if (bubbleSortedArr[j] > bubbleSortedArr[j + 1]) {
                    int temp = bubbleSortedArr[j];
                    bubbleSortedArr[j] = bubbleSortedArr[j + 1];
                    bubbleSortedArr[j + 1] = temp;
                }
            }
        }
        System.out.print("Bubble Sorted Array: " + Arrays.toString(bubbleSortedArr) + "\n");

        int[] selectionSortedArr = Arrays.copyOf(arr, arr.length); // Create a copy for selection sort
        for (int i = 0; i < selectionSortedArr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < selectionSortedArr.length; j++) {
                if (selectionSortedArr[j] < selectionSortedArr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = selectionSortedArr[minIndex];
            selectionSortedArr[minIndex] = selectionSortedArr[i];
            selectionSortedArr[i] = temp;
        }
        System.out.print("Selection Sorted Array: " + Arrays.toString(selectionSortedArr) + "\n");

        System.out.print("Enter the element to search using Linear Search: ");
        int linearSearchTarget = scanner.nextInt();
        int linearSearchIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == linearSearchTarget) {
                linearSearchIndex = i;
                break;
            }
        }
        if (linearSearchIndex != -1) {
            System.out.println("Linear Search: Element found at index: " + linearSearchIndex);
        } else {
            System.out.println("Linear Search: Element not found.");
        }

        Arrays.sort(arr); // Sort the original array for binary search
        System.out.print("Enter the element to search using Binary Search: ");
        int binarySearchTarget = scanner.nextInt();
        int binarySearchIndex = Arrays.binarySearch(arr, binarySearchTarget);
        if (binarySearchIndex >= 0) {
            System.out.println("Binary Search: Element found at index: " + binarySearchIndex);
        } else {
            System.out.println("Binary Search: Element not found.");
        }

        String[] stringArr = {"banana", "apple", "cherry", "date"};
        for (int i = 1; i < stringArr.length; i++) {
            String key = stringArr[i];
            int j = i - 1;
            while (j >= 0 && stringArr[j].compareTo(key) > 0) {
                stringArr[j + 1] = stringArr[j];
                j--;
            }
            stringArr[j + 1] = key;
        }
        System.out.print("Insertion Sorted String Array: " + Arrays.toString(stringArr));

        scanner.close();
    }
}