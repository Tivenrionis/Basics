package com.tiven.questy.InputOutput;

import java.io.*;
import java.util.*;

//checked exception cannot be ignored - will not compile
public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        //try with resources - RESOURCE is a OBJECT THAT MUST BE CLOSED
        try (BufferedWriter locFile = new BufferedWriter(new FileWriter("locations_big.txt"));
             BufferedWriter dirFile = new BufferedWriter(new FileWriter("directions_big.txt"))) {
            for (Location location : locations.values()) {
                locFile.write(location.getLocationID() + " , " + location.getDescription() + "\n");
                for (String dir : location.getExits().keySet()) {
                    dirFile.write(location.getLocationID() + " , " + dir + " , " + location.getExits().get(dir) + "\n");
                }
            }
        }
    }

    static {
        //Buffered Reader reads text from input stream and bufers the character into character array
        // faster and more efficient
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("locations_big.txt")))) {
            scanner.useDelimiter(" , ");
            while (scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                System.out.println("Imported loc: " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader dirFiles = new BufferedReader(new FileReader("directions_big.txt"))) {
            String line;
            while ((line = dirFiles.readLine()) != null) {
                String[] data = line.split(" , ");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);

                System.out.println(loc + ": " + direction + ": " + destination);
                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
