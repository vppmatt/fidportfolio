package domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Order {

    private Stock stock;
    private LocalDateTime dateTime;
    private OrderType orderType;
    private BigDecimal price;
    private Integer quantity;

    public Order(Stock stock, LocalDateTime dateTime, OrderType orderType, BigDecimal price, Integer quantity) {
        this.stock = stock;
        this.dateTime = dateTime;
        this.orderType = orderType;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "stock=" + stock +
                ", dateTime=" + dateTime +
                ", orderType=" + orderType +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(stock, order.stock) && Objects.equals(dateTime, order.dateTime) && orderType == order.orderType && Objects.equals(price, order.price) && Objects.equals(quantity, order.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stock, dateTime, orderType, price, quantity);
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
