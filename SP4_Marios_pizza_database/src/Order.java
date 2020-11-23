import java.util.ArrayList;
import java.util.List;

public class Order {


    String pickUpTime;
    int id;
    int fullPrice;

    ArrayList<Pizza> pizzas = new ArrayList<>();

    public Order(String pickUpTime, int id, int fullPrice) {
        this.pickUpTime = pickUpTime;
        this.id = id;
        this.fullPrice = fullPrice;
    }

    public String getPickUpTime() {
        return pickUpTime;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void addPizza(Pizza p) {
        pizzas.add(p);
    }

    public int getId() {
        return id;
    }

    public int calculateFullPrice(List<Pizza> order) {
        int fullPrice = 0;
        for(Pizza p : order) {
            fullPrice = fullPrice + p.getPrice();
        }
        return fullPrice;
    }

    @Override
    public String toString() {
        return "\n" + "Ordre: "+ id + ", Afhentningstid:'" + pickUpTime + " " + pizzas + "\n" + "Samlede pris for pizzaer: " + calculateFullPrice(pizzas) + "KR";
    }
}
