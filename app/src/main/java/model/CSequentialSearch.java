package model;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Zach on 10/15/2014.
 */
public class CSequentialSearch implements ISearchingAlgorithm {

    private static final String m_Description = "A sequential search using java List.contains";

    @Override
    public boolean FindInList(Object key, List<Object> list, Comparator<Object> comparator) {
        return list.contains(key);
    }

    @Override
    public String GetDescription() {
        return m_Description;
    }

    @Override
    public void SetDescription(String description) {
        // No-op
    }
}
