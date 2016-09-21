/**
 * Created by proshad on 9/21/16.
 */
public class SortTemplatePatternTester {
    public static void main(String[] args) {

        int[] sampleInput = new int[]{11, 9, 38, 7, 46, 5, 14, 9, 3, 17};
        int[] sampleInput2 = new int[]{1, 39, 38, 17, 4, 25, 114, 79, 13, 7};

        SortTemplatePattern sortTemplatePattern = new MergeSort(sampleInput);
        sortTemplatePattern.sort();

        System.out.println("************************************");

        sortTemplatePattern = new QuickSort(sampleInput2);
        sortTemplatePattern.sort();
    }
}
