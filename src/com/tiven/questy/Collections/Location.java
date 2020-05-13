package com.tiven.questy.Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Michał Wesołowski
 * @version 1.0
 * Date: 03.05.2020
 * Time: 23:25
 * Class name: Location
 * Description:
 */
public class Location {
    private final int locationID;
    private final String description;

    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        exits = new HashMap<>();
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
