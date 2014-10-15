package model;

import java.util.List;

/**
 * Created by Zach on 10/15/2014.
 */
public interface ISearchingAlgorithm extends IAlgorithm {

    /**
     * Searches for an object in the list. Returns false if not found.
     * @param key - The object to look for.
     * @param list - The list to search through.
     * @return True if found, false otherwise.
     */
    public boolean FindInList(Object key, List<Object> list);

}
