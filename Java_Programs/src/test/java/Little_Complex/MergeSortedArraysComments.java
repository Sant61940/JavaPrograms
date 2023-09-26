package Little_Complex;
import java.util.List;
import java.util.ArrayList;



public class MergeSortedArraysComments {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] array2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.print("Merged array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        // Compare elements from both arrays and add them to mergedList
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedList.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                mergedList.add(arr2[j]);
                j++;
            } else {
                // If both elements are equal, add one of them to mergedList
                mergedList.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements from arr1 to mergedList
        while (i < arr1.length) {
            mergedList.add(arr1[i]);
            i++;
        }

        // Add remaining elements from arr2 to mergedList
        while (j < arr2.length) {
            mergedList.add(arr2[j]);
            j++;
        }

        // Convert List to array
        int[] mergedArray = new int[mergedList.size()];
        for (int k = 0; k < mergedList.size(); k++) {
            mergedArray[k] = mergedList.get(k);
        }

        return mergedArray;
    }
}
