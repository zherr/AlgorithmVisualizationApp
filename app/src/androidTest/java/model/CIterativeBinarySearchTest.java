package model;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class CIterativeBinarySearchTest extends TestCase {

    private ISearchingAlgorithm searchingAlgorithm;
    private List<Object> objects;
    private CIntegerComparator comparator;

    public void setUp() throws Exception {
        super.setUp();
        searchingAlgorithm = new CIterativeBinarySearch();
        objects = new ArrayList<Object>();
        objects.add(1);
        objects.add(4);
        objects.add(6);
        objects.add(8);
        objects.add(9);
        objects.add(11);
        objects.add(16);
        objects.add(19);
        comparator = new CIntegerComparator();
    }

    public void testFindInList() throws Exception {
        boolean found = searchingAlgorithm.FindInList(6, objects, comparator);
        assertTrue(found);
        found = searchingAlgorithm.FindInList(2, objects, comparator);
        assertFalse(found);
    }

    public void testGetDescription() throws Exception {
        assertEquals("A binary search that assumes a sorted list.", searchingAlgorithm.GetDescription());
    }

    public void testSetDescription() throws Exception {
        searchingAlgorithm.SetDescription("test");
        assertEquals("A binary search that assumes a sorted list.", searchingAlgorithm.GetDescription());
    }
}