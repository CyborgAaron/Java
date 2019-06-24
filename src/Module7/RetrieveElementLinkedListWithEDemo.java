package Module7;

import java.util.LinkedList;

public class RetrieveElementLinkedListWithEDemo {

    public static void main(String[] args) {
        LinkedList<Double> stockPrices = new LinkedList<>();
        stockPrices.add(45.00);
        stockPrices.add(51.00);
        stockPrices.add(62.50);
        stockPrices.add(42.75);
        stockPrices.add(36.80);
        stockPrices.add(68.40);

        //Getting the first element in the LinkedList using getLast()
        // The getLast() method throws NoSuchElementException if the LinkedList is empty
        Double firstElement = stockPrices.getFirst();
        System.out.println("Inirial Stock Price :" + firstElement);


        //Getting the last element in the LinkedList using getLast()
        // The getLast() method throws NoSuchElementException if the LinkedList is empty
        Double lastElement = stockPrices.getLast();
        System.out.println("Current Stock Price : " + lastElement);

        //getting the element at a given position in the LinkedList
        Double stockPriceon3rdDay = stockPrices.get(2);
        System.out.println("Stock Price on 3rd Day : " + stockPriceon3rdDay);

        Double stockPriceOn4thAnd5thDAy = stockPrices.get(4);
        Double stockPriceOn5thDay = stockPrices.get(5);
        System.out.println("Sum of stock of Day 4 & 5: " + stockPriceOn4thAnd5thDAy * stockPriceOn5thDay);
    }
}




