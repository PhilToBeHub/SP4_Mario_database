public class Pizza {
    String pizza;
    int price;
    int id;

    public Pizza(String pizza, int price, int id) {
        this.pizza = pizza;
        this.price = price;
        this.id = id;
    }

    public String getPizza() {
        return pizza;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "\n" + "Pizza" + pizza + ", Pris: " + price + "KR" + ", Pizza nr: " + id;
    }
}
