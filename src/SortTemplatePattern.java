import java.util.Arrays;

/**
 * Created by proshad on 9/21/16.
 */
public abstract class SortTemplatePattern {

    public int[] arrSorted;

    // template method
    public final void sort() {

        divideAndConquer(arrSorted, 0, this.arrSorted.length - 1);
        showSortedData();
    }

    abstract void divideAndConquer(int[] arrSorted, int low, int high);

    public void showSortedData() {
        System.out.println("After sorting");
        System.out.println(Arrays.toString(arrSorted));
    }

    public void setArrSorted(int[] tempData) {
        this.arrSorted = tempData;
    }

}
