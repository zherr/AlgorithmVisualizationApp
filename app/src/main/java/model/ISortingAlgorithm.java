package model;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Zach on 10/15/2014.
 */
public interface ISortingAlgorithm extends IAlgorithm {

    /**
     * Sorts a list by using the object's comparator interface.
     * @param list - The list to sort.
     * @param comparator - The comparator object to compare elements when sorting.
     */
    public void SortListWithComparator(List<Object> list, Comparator<Object> comparator);
}
