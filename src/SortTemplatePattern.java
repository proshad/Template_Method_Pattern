import java.util.Arrays;

/**
 * Created by proshad on 9/21/16.
 */
public abstract class SortTemplatePattern {

    // template method
    public final void sort(int[] array, int low, int high) {
        if (low < high) {
            int q = divide(array, low, high);
            sort(array, low, q - 1);
            sort(array, q + 1, high);
            merge(array, low, q, high);
        }
    }

    abstract int divide(int[] array, int left, int right);
    abstract void merge(int[] array, int left, int center, int right);

}
