import java.util.ArrayList;

public class MenuCard {
    ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
    private String White = "\u001B[37m";
    public MenuCard() {
        DBConnector connector = new DBConnector();
     pizzas = connector.getPizzas();
      /*     pizzas.add(new Pizza(" Margherita", 49,1));
        pizzas.add(new Pizza(" Vesuvio", 54,2));
        pizzas.add(new Pizza(" Donka", 64,3));
        pizzas.add(new Pizza(" Samos", 68,4));
        pizzas.add(new Pizza(" Capricciosa", 60,5));
        pizzas.add(new Pizza(" Jamaica", 60,6));
        pizzas.add(new Pizza(" Hawaii", 59,7));
        pizzas.add(new Pizza(" Amor", 65,8));
        pizzas.add(new Pizza(" Quatro Stagioni", 67,9));
        pizzas.add(new Pizza(" Italiana", 64,10));
        pizzas.add(new Pizza(" Marinara", 60,11));
        pizzas.add(new Pizza(" Viking"   , 41,12));
        pizzas.add(new Pizza(" Nazo", 53,13));
        pizzas.add(new Pizza(" Roma", 49,14));
        pizzas.add(new Pizza(" Ribo", 65,15));
        pizzas.add(new Pizza(" Pascara", 53,16));
        pizzas.add(new Pizza(" Vegetariana", 62,17));
        pizzas.add(new Pizza(" Grandpa", 61,18));
        pizzas.add(new Pizza(" Panzar", 69,19));
        pizzas.add(new Pizza(" A Car", 63,20));
        pizzas.add(new Pizza(" Torben speciel", 67,21));
        pizzas.add(new Pizza(" Rhodos", 81,22));
        pizzas.add(new Pizza(" Indiana", 71,23));
        pizzas.add(new Pizza(" Boderum", 53,24));
        pizzas.add(new Pizza(" Enes", 60,25));
        pizzas.add(new Pizza(" Helin", 62,26));
        pizzas.add(new Pizza(" Americano", 54,27));
        pizzas.add(new Pizza(" Maderia", 65,28));
        pizzas.add(new Pizza(" Mario's Special", 67,29));
        pizzas.add(new Pizza(" Bodyslamer", 110,30));
        */

    }

    public void showMenuCard() {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        sb.append("Pizzas are: \n");
        for(Pizza p : pizzas) {
            count++;
            sb.append("\n").append(count).append(" " + p.getPizza() + " - " + p.getPrice() + "KR");
        }
        System.out.println(White + sb.toString());
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }



    @Override
    public String toString() {
        return "MenuCard" + "pizzas: " + pizzas;
    }
}
