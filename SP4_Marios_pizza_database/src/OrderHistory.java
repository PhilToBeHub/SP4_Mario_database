import java.util.ArrayList;


public class OrderHistory {

    ArrayList<Order> orderHistory = new ArrayList<Order>();

    public OrderHistory() {
    }

    public void addToOrderHistory(Order order) {
        orderHistory.add(order);
    }

    @Override
    public String toString() {
        return "OrderHistory: " + orderHistory;
    }
}
