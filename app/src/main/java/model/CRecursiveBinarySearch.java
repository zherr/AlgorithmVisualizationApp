package model;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Zach on 10/20/2014.
 */
public class CRecursiveBinarySearch implements ISearchingAlgorithm {

    private final static String description = "A recursive binary search.";
    private Comparator<Object> comparator;

    @Override
    public boolean FindInList(Object key, List<Object> list, Comparator<Object> comparator) {
        this.comparator = comparator;
        return RecursiveBinarySearch(key, list, 0, list.size());
    }

    @Override
    public String GetDescription() {
        return description;
    }

    @Override
    public void SetDescription(String description) {
        // No-op
    }

    private boolean RecursiveBinarySearch(Object key, List<Object> list, int min, int max)
    {
        if (max < min) { return false; }
        else
        {
            int mid = (min + max) / 2;
            if (comparator.compare(key, list.get(mid)) > 0)
            {
                return RecursiveBinarySearch(key, list, mid + 1, max);
            }
            else if (comparator.compare(key, list.get(mid)) < 0)
            {
                return RecursiveBinarySearch(key, list, min, mid - 1);
            }
            else
            {
                return true;
            }
        }
    }
}
