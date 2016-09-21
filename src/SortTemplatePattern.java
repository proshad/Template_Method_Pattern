import java.util.Arrays;

/**
 * Created by proshad on 9/21/16.
 */
public abstract class SortTemplatePattern {

    public int[] arrSorted;

    // template method
    public final void sort() {
        // default calling
        int center = divide(0, 0);
        conquer(arrSorted, 0, this.arrSorted.length - 1);
        // for ommitting the initial call
        if (initialCombineNeeded()) {
            combine(arrSorted, 0, center, this.arrSorted.length - 1);
        }
        showSortedData();
    }

    abstract int divide(int left, int right);

    abstract void conquer(int[] arrSorted, int low, int high);

    abstract void combine(int[] array, int leftArrayBegin, int rightArrayBegin, int rightArrayEnd);


    public void showSortedData() {
        System.out.println("After sorting");
        System.out.println(Arrays.toString(arrSorted));
    }

    public void setArrSorted(int[] tempData) {
        this.arrSorted = tempData;
    }

    boolean initialCombineNeeded() {
        return false;
    }

}
