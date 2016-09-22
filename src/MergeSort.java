import java.util.Arrays;

/**
 * Created by proshad on 9/21/16.
 * take help from https://www.khanacademy.org/computing/computer-science/algorithms/merge-sort/p/challenge-implement-merge
 */
public class MergeSort extends SortTemplatePattern {
    public MergeSort() {
        System.out.println("Using merge sort:");
    }


    @Override
    int divide(int[] array, int left, int right) {

        int center = (left + right) / 2;
        return center;
    }

    @Override
    void merge(int[] array, int left, int center, int right) {

        int firstArrSize = center - left + 1;
        int[] lowHalf = new int[firstArrSize];
        int secondArrSize = right - center;
        int[] highHalf = new int[secondArrSize];

        int i, j, k = left;
        for (i = 0; k <= center; i++, k++) {
            lowHalf[i] = array[k];
        }
        for (j = 0; k <= right; j++, k++) {
            highHalf[j] = array[k];
        }

        k = left;
        i = 0;
        j = 0;


        while (i < lowHalf.length && j < highHalf.length) {
            if (lowHalf[i] < highHalf[j]) {
                array[k++] = lowHalf[i++];
            } else {
                array[k++] = highHalf[j++];
            }
        }
        while (i < lowHalf.length) {
            array[k++] = lowHalf[i++];
        }
        while (j < highHalf.length) {
            array[k++] = highHalf[j++];
        }

    }

}
