package model;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Zach on 10/20/2014.
 */
public class CIterativeBinarySearch implements ISearchingAlgorithm {

    private static final String description = "A binary search that assumes a sorted list.";

    @Override
    public boolean FindInList(Object key, List<Object> list, Comparator<Object> comparator) {
        if (list.size() == 0) return false;
        int min = 0;
        int max = list.size();
        while (max >= min)
        {
            int mid = (max + min) / 2;
            System.out.println(mid);
            if (comparator.compare(key, list.get(mid)) == 0)
            {
                return true;
            }
            else if (comparator.compare(key, list.get(mid)) > 0)
            {
                min = mid + 1;
            }
            else
            {
                max = mid - 1;
            }
        }
        return false;
    }

    @Override
    public String GetDescription() {
        return description;
    }

    @Override
    public void SetDescription(String description) {
        // No-op
    }
}
