package model;

import java.util.Comparator;

/**
 * Created by Zach on 10/20/2014.
 */
public class CIntegerComparator implements Comparator {
    @Override
    public int compare(Object o, Object o2) {
        return ((Integer)o).compareTo(((Integer)o2));
    }
}
