package model;

import android.test.ActivityTestCase;

import java.util.ArrayList;
import java.util.List;

public class CSequentialSearchTest extends ActivityTestCase {

    private ISearchingAlgorithm searchingAlgorithm;
    private List<Object> objects;

    public void setUp() throws Exception {
        super.setUp();
        objects = new ArrayList<Object>();
        objects.add(5);
        objects.add(4);
        objects.add(7);
        objects.add(8);
        objects.add(3);
        searchingAlgorithm = new CSequentialSearch();
    }

    public void testFindInList() throws Exception {
        Object key = new Integer(5);
        assertTrue(searchingAlgorithm.FindInList(key, objects));
        key = new Integer(9);
        assertFalse(searchingAlgorithm.FindInList(key, objects));
    }

    public void testGetDescription() throws Exception {
        assertEquals("A sequential search using java List.contains", searchingAlgorithm.GetDescription());
    }

    public void testSetDescription() throws Exception {
        searchingAlgorithm.SetDescription("Should not change.");
        assertEquals("A sequential search using java List.contains", searchingAlgorithm.GetDescription());
    }
}