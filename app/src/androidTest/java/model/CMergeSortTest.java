package model;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CMergeSortTest extends TestCase {

    private ISortingAlgorithm mergeSort;
    private List<Object> listToSort;
    private Comparator comparator;

    public void setUp() throws Exception {
        super.setUp();
        mergeSort = new CMergeSort();
        listToSort = new ArrayList<Object>();
        listToSort.add(5);
        listToSort.add(6);
        listToSort.add(1);
        listToSort.add(3);
        listToSort.add(2);
        listToSort.add(9);
        listToSort.add(8);
        comparator = new CIntegerComparator();
    }

    public void testSortListWithComparator() throws Exception {
        mergeSort.SortListWithComparator(listToSort, comparator);
        List<Object> sorted = new ArrayList<Object>(listToSort);
        sorted.add(1);
        sorted.add(2);
        sorted.add(3);
        sorted.add(5);
        sorted.add(6);
        sorted.add(8);
        sorted.add(9);
        boolean isSorted = true;
        for (int i = 0; i < listToSort.size(); ++i)
        {
            if (comparator.compare(listToSort.get(i), sorted.get(i)) != 0) {
                isSorted = false;
                break;
            }
        }
        assertTrue(isSorted);

        listToSort.clear();
        listToSort.add(2);
        mergeSort.SortListWithComparator(listToSort, comparator);
        assertNotNull(listToSort);
        assertTrue(listToSort.size() == 1);
        listToSort.add(1);
        mergeSort.SortListWithComparator(listToSort, comparator);
        assertTrue((Integer)listToSort.get(0) == 1);
    }

    public void testGetDescription() throws Exception {
        assertEquals("A mergesort algorithm.", mergeSort.GetDescription());
    }

    public void testSetDescription() throws Exception {
        mergeSort.SetDescription("test");
        assertEquals("A mergesort algorithm.", mergeSort.GetDescription());
    }
}