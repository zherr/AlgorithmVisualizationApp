package model;

/**
 * Created by Zach on 10/15/2014.
 */
public interface IAlgorithm {

    /**
     * Gets a description of the algorithm.
     * @return String - the algorithm's description
     */
    public String GetDescription();

    /**
     * Sets the algorithm's description.
     * @param description - The description of the algorithm.
     */
    public void SetDescription(String description);

}
