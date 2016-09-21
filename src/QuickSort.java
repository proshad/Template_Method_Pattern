import java.util.Arrays;

/**
 * Created by proshad on 9/21/16.
 */
public class QuickSort extends SortTemplatePattern {
    public QuickSort(int[] sampleInput) {
        System.out.println("Using quick sort:");
        super.setArrSorted(sampleInput);
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(arrSorted));
    }

    @Override
    int divide(int low, int high) {
        // Get the pivot element from the middle of the list
        int pivot = arrSorted[low + (high - low) / 2];
        return pivot;
    }

    @Override
    void conquer(int[] arrSorted, int low, int high) {
        int i = low, j = high;
        int pivot = divide(low, high);

        // Divide into two lists
        while (i <= j) {
            // If current value from left list is smaller then the pivot, get next element from left list
            while (arrSorted[i] < pivot) {
                i++;
            }
            // If current value from right list is larger then the pivot, get next element from right list
            while (arrSorted[j] > pivot) {
                j--;
            }

            // If a values in left list is larger then pivot & a value in right list is smaller then pivot, exchange the values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            conquer(arrSorted, low, j);
        if (i < high)
            conquer(arrSorted, i, high);
    }

    @Override
    void combine(int[] array, int leftArrayBegin, int rightArrayBegin, int rightArrayEnd) {
// No need. Once the conquer step recursively sorts, we are done
    }


    private void exchange(int i, int j) {
        int temp = arrSorted[i];
        arrSorted[i] = arrSorted[j];
        arrSorted[j] = temp;
    }
}
