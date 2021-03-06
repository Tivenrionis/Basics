package com.tiven.questy.SortedCollections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if (item != null) {
            //check if we already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
            //if there is in the map... adjust quantity
            if (inStock != item) {
                item.adjustStock(inStock.getQuantityInStock());
            }
            list.put(item.getName(), item);
            return item.getQuantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.getOrDefault(item, null);

        if ((inStock != null) && (inStock.getQuantityInStock() >= quantity) && (quantity > 0)) {
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public Map<String, StockItem> Items() {
        //read only map
        return Collections.unmodifiableMap(list);
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.getQuantityInStock();

            s = s + stockItem + ". There are " + stockItem.getQuantityInStock() + " in stock. Values of items: ";
            s = s + String.format("%.2f",itemValue) + "\n";
            totalCost += itemValue;

        }
        return s + "Total stock value: " + totalCost;
    }
}
