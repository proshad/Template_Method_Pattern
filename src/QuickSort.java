import java.util.Arrays;

/**
 * Created by proshad on 9/21/16.
 *
 * algorithm from https://www.khanacademy.org/computing/computer-science/algorithms/quick-sort/p/challenge-implement-partition
 */

public class QuickSort extends SortTemplatePattern {
    public QuickSort() {
        System.out.println("Using quicksort:");
    }


    @Override
    int divide(int[] array, int left, int right) {
        for (int i = left; i < right; i++) {
            if (array[i] <= array[right]) {
                swap(array, i, left);
                left++;
            }
        }
        swap(array, right, left);
        return left;

    }
    @Override
    void merge(int[] array, int left, int center, int right) {
        // in quick sort, no need to merge as merge taken place in parallel with dividing steps
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
