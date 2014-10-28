package model;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Zach on 10/26/2014.
 */
public class CMergeSort implements ISortingAlgorithm {

    private static final String description = "A mergesort algorithm.";
    private Comparator<Object> comparator;

    @Override
    public void SortListWithComparator(List<Object> list, Comparator<Object> comparator) {
        this.comparator = comparator;
        RecursiveMergeSort(list);
    }

    @Override
    public String GetDescription() {
        return description;
    }

    @Override
    public void SetDescription(String description) {
        // No-op
    }

    private void RecursiveMergeSort(List<Object> list){

        if (list.size() > 1)
        {
            final int mid = list.size() / 2;
            List<Object> left = list.subList(0, mid);
            List<Object> right = list.subList(mid, list.size());
            RecursiveMergeSort(left);
            RecursiveMergeSort(right);

            // Merge
            int lInc = 0;
            int rInc = 0;
            int origInc = 0;
            while (lInc < left.size() && rInc < right.size()) {
                if (comparator.compare(left.get(lInc), right.get(rInc)) < 0) {
                    list.set(origInc, left.get(lInc));
                    ++lInc;
                }
                else {
                    list.set(origInc, right.get(rInc));
                    ++rInc;
                }
                ++origInc;
            }
            if (lInc == left.size()) {
                for ( ; rInc < right.size() ; ++rInc) {
                    list.set(origInc, right.get(rInc));
                    ++origInc;
                }
            }
            else if (rInc == right.size()) {
                for ( ; lInc < left.size() ; ++lInc) {
                    list.set(origInc, left.get(lInc));
                    ++origInc;
                }
            }
        }
    }
}
