package com.tiven.questy.SortedCollections;

public class Main {
    // till now:
    // List - ArrayList
    // List - LinkedList
    // Map - HashMap
    //Set - HashSet

    //LinkedHashMap and LinkedHashSet... SortedMap and SortedSet -> implemented in TreeMap TreeSet
    //LinkedHashMao --> dodaje chronologicznie

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);
        temp = new StockItem("Car", 12.50, 2);
        stockList.addStock(temp);
        temp = new StockItem("Chair", 62.0, 10);
        stockList.addStock(temp);
        temp = new StockItem("Cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("Cup", 0.45, 7);
        stockList.addStock(temp);
        temp = new StockItem("Door", 72.95, 4);
        stockList.addStock(temp);
        temp = new StockItem("Juice", 1.10, 7);
        stockList.addStock(temp);
        temp = new StockItem("Phone", 96.69, 35);
        stockList.addStock(temp);
        temp = new StockItem("Towel", 2.40, 80);
        stockList.addStock(temp);
        temp = new StockItem("Vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket myBasket = new Basket("Tiven");
        sellItem(myBasket,"Car",1);
        System.out.println(myBasket);

        sellItem(myBasket,"Car",1);
        System.out.println(myBasket);

        sellItem(myBasket,"Car",1);
        sellItem(myBasket,"Spanner",5);
        System.out.println(myBasket);

        sellItem(myBasket,"Juice",4);
        sellItem(myBasket,"Cup",12);
        sellItem(myBasket,"Bread",1);
        System.out.println(myBasket);

        System.out.println(stockList);
//
//        temp = new StockItem("Pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);


    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We dont't sell " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;

    }
}
