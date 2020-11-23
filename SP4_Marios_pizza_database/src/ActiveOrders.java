import java.util.ArrayList;

public class ActiveOrders {

    ArrayList<Order> activeOrders = new ArrayList<>();

    public ActiveOrders() {
    }

    public ArrayList<Order> getActiveOrders() {
        return activeOrders;
    }

    public void addOrder(Order order) {
        activeOrders.add(order);
    }

    public void removeOrder(Order order) {
        activeOrders.remove(order);
    }

    @Override
    public String toString() {
        return "" + activeOrders;
    }
}
