import java.util.Arrays;

/**
 * Created by proshad on 9/21/16.
 */
public class MergeSort extends SortTemplatePattern {
    public MergeSort(int[] sampleInput) {
        System.out.println("Using merge sort:");
        super.setArrSorted(sampleInput);
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(arrSorted));
    }

    @Override
    int divide(int left, int right) {
        //split the array into 2
        int center = (left + right) / 2;
        return center;
    }

    @Override
    void conquer(int[] array, int left, int right) {

        if (left < right) {

            int center = divide(left, right);

            //sort the left and right array
            conquer(array, left, center);
            conquer(array, center + 1, right);

            //combine the result
            combine(array, left, center + 1, right);
        }
    }


    @Override
    void combine(int[] array, int leftArrayBegin, int rightArrayBegin, int rightArrayEnd) {

        int leftArrayEnd = rightArrayBegin - 1;

        int numElements = rightArrayEnd - leftArrayBegin + 1;
        this.arrSorted = new int[numElements];
        int resultArrayBegin = 0;

        // Find the smallest element in both these array and add it to the result array
        while (leftArrayBegin <= leftArrayEnd && rightArrayBegin <= rightArrayEnd) {
            if (array[leftArrayBegin] <= array[rightArrayBegin]) {
                this.arrSorted[resultArrayBegin++] = array[leftArrayBegin++];
            } else {
                this.arrSorted[resultArrayBegin++] = array[rightArrayBegin++];
            }
        }

        // After the main loop completed we may have few more elements in left array copy them.
        while (leftArrayBegin <= leftArrayEnd) {
            this.arrSorted[resultArrayBegin++] = array[leftArrayBegin++];
        }

        // After the main loop completed we may have few more elements in right array copy.
        while (rightArrayBegin <= rightArrayEnd) {
            this.arrSorted[resultArrayBegin++] = array[rightArrayBegin++];
        }

        // Copy this.arrSorted back to the main array
        for (int i = numElements - 1; i >= 0; i--, rightArrayEnd--) {
            array[rightArrayEnd] = this.arrSorted[i];
        }
    }

}