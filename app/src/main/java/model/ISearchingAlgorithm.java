package model;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Zach on 10/15/2014.
 */
public interface ISearchingAlgorithm extends IAlgorithm {

    /**
     * Searches for an object in the list. Returns false if not found.
     * @param key - The object to look for.
     * @param list - The list to search through.
     * @param comparator - The comparator to use when needed.
     * @return True if found, false otherwise.
     */
    public boolean FindInList(Object key, List<Object> list, Comparator<Object> comparator);

}
