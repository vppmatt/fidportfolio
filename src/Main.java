import domain.Order;
import domain.OrderType;
import domain.Stock;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Stock microsoft = new Stock();
        microsoft.setName("Microsoft");
        microsoft.setTicker("MSFT");

        Stock apple = new Stock("Apple", "APPL");

        ArrayList<Order> portfolio = new ArrayList<>();

        BigDecimal num1 = new BigDecimal("123.45"); //OK
        BigDecimal num2 = BigDecimal.valueOf(123.45); //OK
        BigDecimal num3 = new BigDecimal(123.45); //AVOID - inaccurate

        portfolio.add(new Order(microsoft, LocalDateTime.now(), OrderType.PURCHASE, new BigDecimal("454.27"),100));
        portfolio.add(new Order(microsoft, LocalDateTime.now(), OrderType.SALE, new BigDecimal("456.73"),30));
        portfolio.add(new Order(apple, LocalDateTime.now(), OrderType.PURCHASE, new BigDecimal("200.74"),100));
        portfolio.add(new Order(apple, LocalDateTime.now(), OrderType.PURCHASE, new BigDecimal("195.33"),50));

        System.out.println(portfolio);

        //current quantity of all stocks in portfolio
        HashMap<Stock, Integer> stockQuantities = new HashMap<>();
        
        for (int i = 0; i < portfolio.size(); i++) {
            //which stock is in position i?
            Order currentOrder = portfolio.get(i);
            Stock currentStock = currentOrder.getStock();

            //what's the quantity of that stock?
            Integer currentQuantity = currentOrder.getQuantity();

            //is it a sale or purchase
            Boolean purchase = currentOrder.getOrderType() == OrderType.PURCHASE;

            //put the correct value into the hashmap
            stockQuantities.put(currentStock, currentQuantity);
        }

        System.out.println(stockQuantities);
    }
}
