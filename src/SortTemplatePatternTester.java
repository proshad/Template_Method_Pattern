import java.util.Arrays;

/**
 * Created by proshad on 9/21/16.
 */
public class SortTemplatePatternTester {
    public static void main(String[] args) {

        int[] sampleInput = new int[]{11, 9, 38, 7, 46, 5, 14, 9, 3, 17};
        int[] sampleInput2 = new int[]{1, 39, 38, 17, 4, 25, 114, 79, 13, 7};

        System.out.println("Before sorting");
        System.out.println(Arrays.toString(sampleInput));

        SortTemplatePattern sortTemplatePattern = new MergeSort();
        sortTemplatePattern.sort(sampleInput, 0, sampleInput.length - 1);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(sampleInput));

        System.out.println("************************************");

        System.out.println("Before sorting");
        System.out.println(Arrays.toString(sampleInput2));

        sortTemplatePattern = new QuickSort();
        sortTemplatePattern.sort(sampleInput2, 0, sampleInput.length - 1);

        System.out.println("After sorting");
        System.out.println(Arrays.toString(sampleInput2));
    }
}
